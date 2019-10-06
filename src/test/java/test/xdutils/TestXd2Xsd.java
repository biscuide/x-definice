package test.xdutils;

import org.apache.ws.commons.schema.XmlSchema;
import org.apache.ws.commons.schema.XmlSchemaCollection;
import org.apache.ws.commons.schema.XmlSchemaForm;
import org.xdef.XDPool;
import org.xdef.XDValue;
import org.xdef.impl.util.conv.xd2schemas.XD2MultipleXsdAdapter;
import org.xdef.impl.util.conv.xd2schemas.XD2XsdAdapter;
import org.xdef.impl.util.conv.xd2schemas.XmlSchemaImportLocation;
import org.xdef.impl.util.conv.xsd.XmlValidator;
import org.xdef.proc.XXElement;
import org.xdef.sys.ArrayReporter;
import test.utils.XDTester;

import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.util.*;

public class TestXd2Xsd extends XDTester {

    static private boolean PRINT_SCHEMA_TO_OUTPUT = false;
    static private boolean WRITE_SCHEMAS_INTO_FILE = true;

    private File _inputFilesRoot;
    private File _refFilesRoot;
    private File _dataFilesRoot;
    private File _outputFilesRoot;

    private void init() {
        File dataDir = new File(getDataDir());
        if (!dataDir.exists() || !dataDir.isDirectory()) {
            throw new RuntimeException(
                    "Data directory does not exists or is not a directory!");
        }

        _inputFilesRoot = initFolder(dataDir, "xd2xsd_2");
        _refFilesRoot = initFolder(dataDir, "xd2xsd_2");
        _dataFilesRoot = initFolder(dataDir, "xd2xsd_2");
        _outputFilesRoot = initFolder(dataDir, "xd2xsd_2\\output");
    }

    private File initFolder(final File dataDir, final String folderPath) {
        File folder = new File(dataDir.getAbsolutePath(), folderPath);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new RuntimeException("Directory " + folderPath + " does not exists!");
        }

        return folder;
    }

    private File getFile(final String path, final String fileName, final String fileExt) throws FileNotFoundException {
        File xdFile = new File(path, fileName + fileExt);
        if (xdFile == null || !xdFile.exists() || !xdFile.isFile()) {
            throw new FileNotFoundException("Path: " + path + fileName + fileExt);
        }

        return xdFile;
    }

    private XDPool compileXd(final String fileName) throws FileNotFoundException {
        return compile(getFile(_inputFilesRoot.getAbsolutePath() + "\\" + fileName, fileName, ".xdef"), this.getClass());
    }

    private FileReader createFileReader(final String filePath, final String fileName, final String fileExt) throws FileNotFoundException {
        return new FileReader(filePath + "\\" + fileName + fileExt);
    }

    private FileReader createRefFileReader(final String fileName, final String fileExt) throws FileNotFoundException {
        return createFileReader(_refFilesRoot.getAbsolutePath() + "\\" + fileName, fileName, fileExt);
    }

    private File getXmlDataFile(final String testCase, final String fileName) throws FileNotFoundException {
        return getFile(_dataFilesRoot.getAbsolutePath() + "\\" + testCase + "\\data", fileName, ".xml");
    }

    private XmlSchema[] getRefSchemas(final String fileName, int schemaCount) throws FileNotFoundException {
        XmlSchemaCollection schemaCollection = new XmlSchemaCollection();
        schemaCollection.read(createRefFileReader(fileName, ".xsd"));
        XmlSchema[] schemas = schemaCollection.getXmlSchemas();

        if (schemas.length != schemaCount + 1) {
            throw new RuntimeException("Invalid number of reference schemas, expected: 2, actual: " + schemas.length);
        }

        return schemas;
    }

    private ByteArrayOutputStream compareSchema(final String fileName, XmlSchema ref, XmlSchema output) throws UnsupportedEncodingException {
        ByteArrayOutputStream outputStreamRef = new ByteArrayOutputStream();
        ref.write(outputStreamRef);

        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        output.write(outputStream);

        if (WRITE_SCHEMAS_INTO_FILE == true) {
            try {
                BufferedWriter writerActual = new BufferedWriter(new FileWriter(_outputFilesRoot.getAbsolutePath() + "\\" + fileName + "_actual.xsd"));
                output.write(writerActual);
                BufferedWriter writerRef = new BufferedWriter(new FileWriter(_outputFilesRoot.getAbsolutePath() + "\\" + fileName + "_ref.xsd"));
                ref.write(writerRef);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        assertEq(outputStream.toString(), outputStreamRef.toString());

        return outputStream;
    }

    private List<ByteArrayOutputStream> compareSchemas(final String fileName, XmlSchema[] refSchemas, XmlSchema[] outputSchemas) throws UnsupportedEncodingException {
        assertEq(refSchemas.length, outputSchemas.length);

        // TODO: How to order schemas to compare it in single loop?

        List<ByteArrayOutputStream> refSchemasByteList = new ArrayList<ByteArrayOutputStream>();
        for (int i = 0; i < refSchemas.length - 1; i++) {
            ByteArrayOutputStream outputStreamRef = new ByteArrayOutputStream();
            refSchemas[i].write(outputStreamRef);
            refSchemasByteList.add(outputStreamRef);
        }

        List<ByteArrayOutputStream> outputSchemasByteList = new ArrayList<ByteArrayOutputStream>();
        for (int i = 0; i < outputSchemas.length - 1; i++) {
            ByteArrayOutputStream outputStreamRef = new ByteArrayOutputStream();
            outputSchemas[i].write(outputStreamRef);
            outputSchemasByteList.add(outputStreamRef);
        }

        for (int i = 0; i < outputSchemasByteList.size(); i++) {
            boolean schemaFound = false;
            for (int j = 0; j < refSchemasByteList.size(); j++) {
                schemaFound = outputSchemasByteList.get(i).toString().equals(refSchemasByteList.get(j).toString());
                if (schemaFound) {
                    if (WRITE_SCHEMAS_INTO_FILE == true) {
                        try {
                            BufferedWriter writerActual = new BufferedWriter(new FileWriter(_outputFilesRoot.getAbsolutePath() + "\\" + fileName + (i > 0 ? "_" + i : "") + ".xsd"));
                            outputSchemas[i].write(writerActual);
                            BufferedWriter writerRef = new BufferedWriter(new FileWriter(_outputFilesRoot.getAbsolutePath() + "\\" + fileName  + (i > 0 ? "_" + i : "") + "_ref.xsd"));
                            refSchemas[j].write(writerRef);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }

                    refSchemasByteList.remove(j);
                    break;
                }
            }

            assertTrue(schemaFound, "No schema match found");
        }

        return outputSchemasByteList;
    }

    private void validateXml(final File xmlFile, final ByteArrayOutputStream xsdStream, boolean expectedResult) throws FileNotFoundException {
        XmlValidator validator = new XmlValidator(new StreamSource(xmlFile), new StreamSource(new ByteArrayInputStream(xsdStream.toByteArray())));
        assertEq(expectedResult, validator.validate());
    }

    private void convertXd2Xsd(final String fileName,
                               List<String> validTestingData, List<String> invalidTestingData,
                               XmlSchemaForm elemSchemaForm, XmlSchemaForm attrSchemaForm) {
        convertXd2Xsd(fileName, validTestingData, invalidTestingData, elemSchemaForm, attrSchemaForm, null);
    }

    private void convertXd2Xsd(final String fileName,
                               List<String> validTestingData, List<String> invalidTestingData,
                               XmlSchemaForm elemSchemaForm, XmlSchemaForm attrSchemaForm, String targetNamespace) {
        ArrayReporter reporter = new ArrayReporter();
        setProperty("xdef.warnings", "true");
        try {
            XD2XsdAdapter adapter = new XD2XsdAdapter();
            //adapter.setPrintXdTree(true);
            adapter.setElemSchemaForm(elemSchemaForm);
            adapter.setAttrSchemaForm(attrSchemaForm);
            adapter.setTargetNamespace(targetNamespace);

            // Convert XD -> XSD Schema
            XDPool inputXD = compileXd(fileName);
            XmlSchema outputSchema = adapter.createSchema(inputXD, fileName);

            if (PRINT_SCHEMA_TO_OUTPUT == true) {
                outputSchema.write(System.out);
            }

            // Compare XSD schemas
            ByteArrayOutputStream outputSchemaStream = compareSchema(fileName, getRefSchemas(fileName, 1)[0], outputSchema);

            // Validate valid XML file against XSD schema
            if (validTestingData != null) {
                for (String testingFile : validTestingData) {
                    validateXml(getXmlDataFile(fileName, testingFile), outputSchemaStream, true);
                }
            }

            // Validate invalid XML file against XSD schema
            if (invalidTestingData != null) {
                for (String testingFile : invalidTestingData) {
                    validateXml(getXmlDataFile(fileName, testingFile), outputSchemaStream, false);
                }
            }

            assertNoErrors(reporter);
        } catch (Exception ex) {fail(ex);}
    }

    private void convertXd2Xsd_Multiple(final String fileName,
                                        List<String> validTestingData, List<String> invalidTestingData,
                                        XmlSchemaForm[] elemSchemaForms, XmlSchemaForm[] attrSchemaForms, String[] targetNamespaces,
                                        XmlSchemaImportLocation[] schemaImportLocations, int schemaCount) {
        ArrayReporter reporter = new ArrayReporter();
        setProperty("xdef.warnings", "true");
        try {
            XD2MultipleXsdAdapter adapter = new XD2MultipleXsdAdapter();
            //adapter.setPrintXdTree(true);
            Map<String, XmlSchemaImportLocation> schemaNamespaceLocations = new HashMap<String, XmlSchemaImportLocation>();
            for (int i = 0; i < schemaImportLocations.length; i++) {
                schemaNamespaceLocations.put(schemaImportLocations[i].getNamespaceUri(), schemaImportLocations[i]);
            }
            adapter.setSchemaNamespaceLocations(schemaNamespaceLocations);

            for (int i = 0; i < elemSchemaForms.length; i++) {
                adapter.setElemSchemaForm(i, elemSchemaForms[i]);
            }

            for (int i = 0; i < attrSchemaForms.length; i++) {
                adapter.setAttrSchemaForm(i, attrSchemaForms[i]);
            }

            for (int i = 0; i < targetNamespaces.length; i++) {
                adapter.setTargetNamespace(i, targetNamespaces[i]);
            }

            // Convert XD -> XSD Schema
            XDPool inputXD = compileXd(fileName);
            XmlSchemaCollection outputXmlSchemaCollection = adapter.createSchemas(inputXD);
            XmlSchema[] outputXmlSchemas = outputXmlSchemaCollection.getXmlSchemas();

            if (PRINT_SCHEMA_TO_OUTPUT == true) {
                for (XmlSchema outputSchema : outputXmlSchemas) {
                    outputSchema.write(System.out);
                }
            }

            // Compare XSD schemas
            List<ByteArrayOutputStream> outputSchemaStreams = compareSchemas(fileName, getRefSchemas(fileName, schemaCount), outputXmlSchemas);

            // Validate valid XML file against XSD schema
            if (validTestingData != null) {
                for (String testingFile : validTestingData) {
                    validateXml(getXmlDataFile(fileName, testingFile), outputSchemaStreams.get(0), true);
                }
            }

            // Validate invalid XML file against XSD schema
            if (invalidTestingData != null) {
                for (String testingFile : invalidTestingData) {
                    validateXml(getXmlDataFile(fileName, testingFile), outputSchemaStreams.get(0), false);
                }
            }

            assertNoErrors(reporter);
        } catch (Exception ex) {fail(ex);}
    }

    @Override
    public void test() {
        init();

        convertXd2Xsd("t000", Arrays.asList(new String[] {"t000"}), Arrays.asList(new String[] {"t000_invalid_blank_char"}), XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t001", Arrays.asList(new String[] {"t001"}), null, XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t002", Arrays.asList(new String[] {"t002"}), null, XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t003", Arrays.asList(new String[] {"t003"}), null, XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t004", Arrays.asList(new String[] {"t004"}), null, XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t005", Arrays.asList(new String[] {"t005"}), null, XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED);
        convertXd2Xsd("t007", Arrays.asList(new String[] {"t007"}), null, XmlSchemaForm.QUALIFIED, XmlSchemaForm.UNQUALIFIED, "http://www.w3schools.com");
        convertXd2Xsd("t009", Arrays.asList(new String[] {"t009"}), null, XmlSchemaForm.QUALIFIED, XmlSchemaForm.UNQUALIFIED, "http://www.w3schools.com");
        convertXd2Xsd("t010", Arrays.asList(new String[] {"t010"}), null, XmlSchemaForm.QUALIFIED, XmlSchemaForm.QUALIFIED, "http://www.w3schools.com");

        convertXd2Xsd_Multiple("t011", Arrays.asList(new String[] {"t011"}), null,
                new XmlSchemaForm[] {XmlSchemaForm.QUALIFIED, XmlSchemaForm.QUALIFIED}, new XmlSchemaForm[] {XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED},
                new String[] {"http://www.w3ctest.com", "http://www.w3schools.com"},
                new XmlSchemaImportLocation[] {
                        new XmlSchemaImportLocation("http://www.w3ctest.com", "src\\\\test\\\\resources\\\\test\\\\xdutils\\\\data\\\\xd2xsd_2\\\\t011")
                },
                2);

        convertXd2Xsd_Multiple("t012", Arrays.asList(new String[] {"t012"}), null,
                new XmlSchemaForm[] {XmlSchemaForm.QUALIFIED, XmlSchemaForm.UNQUALIFIED}, new XmlSchemaForm[] {XmlSchemaForm.UNQUALIFIED, XmlSchemaForm.UNQUALIFIED},
                new String[] {"http://a", null},
                new XmlSchemaImportLocation[] {
                        new XmlSchemaImportLocation("http://a", "src\\\\test\\\\resources\\\\test\\\\xdutils\\\\data\\\\xd2xsd_2\\\\t012")
                },
                2);
    }

    ////////////////////////////////////////////////////////////////////////////////
// External methods for the test Sisma
////////////////////////////////////////////////////////////////////////////////
    public static void initParams(XXElement chkElem) {}
    public static void setErr(XXElement chkElem, XDValue[] params) {}
    public static boolean tab(XXElement chkEl, XDValue[] params) {return true;}
    public static void chkOpt_RC_ifEQ(XXElement chkElem, XDValue[] params) {}
    public static void dateDavka(XXElement chkElem, XDValue[] params) {}
    public static void chk_dec_nonNegative(XXElement chkEl, XDValue[] params) {}
    public static void chk_RC_DatNar_ifEQ(XXElement chkEl, XDValue[] params) {}
    public static void setDefault_ifEx(XXElement chkElem, XDValue[] params) {}
    public static void emptySubjHasAddr(XXElement chkElem, XDValue[] params) {}
    public static String getIdOsoba(XXElement chkElem) { return "1"; }
    public static void protocol(XXElement chkElem, String role, long idXxx) {}
    public static void protocol(XXElement chkElem, String role, String ident) {}
    public static void outputIVR(XXElement chkElem, XDValue[] params) {}
    public static String getKodPartnera() { return "1"; }
    public static void chkEQ_PojistitelFuze(XXElement chkEl, XDValue[] params){}
    public static void chk_Poj_NeexElement(XXElement chkEl, XDValue[] params) {}
    public static void chkOpt_IC_ifEQ(XXElement chkElem, XDValue[] params) {}
    public static void hasElement_if(XXElement chkElem, XDValue[] params) {}
    public static void subjekt_OsobaOrFirma(XXElement chkEl, XDValue[] params){}
    public static String getIdSubjekt(XXElement chkElem) { return "1"; }
    public static void notEmptyMisto(XXElement chkElem, XDValue[] params) {}
    public static void equal(XXElement chkElem, XDValue[] params) {}
    public static void chkOpt_CisloTP_ifEQ(XXElement chkEl, XDValue[] params) {}
    public static String getIdVozidlo(XXElement chkElem) { return "1"; }
    public static boolean kvadrant(XXElement chkElem) { return true; }
    public static void chk_TypMinusPlneni_Platba(XXElement chkEl,
                                                 XDValue[] params) {}
    public static boolean fil0(XXElement chkEl, XDValue[] params) {return true;}
////////////////////////////////////////////////////////////////////////////////

    /** Run test
     * @param args ignored
     */
    public static void main(String... args) {
        XDTester.setFulltestMode(true);
        runTest();
    }
}
