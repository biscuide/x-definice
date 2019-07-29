// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#VozidloDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class VozidloDN implements org.xdef.component.XComponent{
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getDruhVozidla() {return _DruhVozidla;}
  public String getSPZ() {return _SPZ;}
  public String getMPZ() {return _MPZ;}
  public String getVIN() {return _VIN;}
  public String getZnacka() {return _Znacka;}
  public String getTypVozidla() {return _TypVozidla;}
  public org.xdef.sys.SDatetime getRokVyroby() {return _RokVyroby;}
  public java.util.Date dateOfRokVyroby(){return org.xdef.sys.SDatetime.getDate(_RokVyroby);}
  public java.sql.Timestamp timestampOfRokVyroby(){return org.xdef.sys.SDatetime.getTimestamp(_RokVyroby);}
  public java.util.Calendar calendarOfRokVyroby(){return org.xdef.sys.SDatetime.getCalendar(_RokVyroby);}
  public String getPlatnostSTK() {return _PlatnostSTK;}
  public org.xdef.sys.SDatetime getMesicSTKDo() {return _MesicSTKDo;}
  public java.util.Date dateOfMesicSTKDo(){return org.xdef.sys.SDatetime.getDate(_MesicSTKDo);}
  public java.sql.Timestamp timestampOfMesicSTKDo(){return org.xdef.sys.SDatetime.getTimestamp(_MesicSTKDo);}
  public java.util.Calendar calendarOfMesicSTKDo(){return org.xdef.sys.SDatetime.getCalendar(_MesicSTKDo);}
  public String getTypBrzd() {return _TypBrzd;}
  public String getStavBrzd() {return _StavBrzd;}
  public String getKodPojistitele() {return _KodPojistitele;}
  public String getNazevPojistitele() {return _NazevPojistitele;}
  public String getCisloDokladuPojisteni() {return _CisloDokladuPojisteni;}
  public String getPojisteniText() {return _PojisteniText;}
  public String getCisloZK() {return _CisloZK;}
  public String getVydalZK() {return _VydalZK;}
  public org.xdef.sys.SDatetime getPlatnostZKOd() {return _PlatnostZKOd;}
  public java.util.Date dateOfPlatnostZKOd(){return org.xdef.sys.SDatetime.getDate(_PlatnostZKOd);}
  public java.sql.Timestamp timestampOfPlatnostZKOd(){return org.xdef.sys.SDatetime.getTimestamp(_PlatnostZKOd);}
  public java.util.Calendar calendarOfPlatnostZKOd(){return org.xdef.sys.SDatetime.getCalendar(_PlatnostZKOd);}
  public org.xdef.sys.SDatetime getPlatnostZKDo() {return _PlatnostZKDo;}
  public java.util.Date dateOfPlatnostZKDo(){return org.xdef.sys.SDatetime.getDate(_PlatnostZKDo);}
  public java.sql.Timestamp timestampOfPlatnostZKDo(){return org.xdef.sys.SDatetime.getTimestamp(_PlatnostZKDo);}
  public java.util.Calendar calendarOfPlatnostZKDo(){return org.xdef.sys.SDatetime.getCalendar(_PlatnostZKDo);}
  public Integer getPojistneHPKc() {return _PojistneHPKc;}
  public org.xdef.sys.SDatetime getDatumUhradyHP() {return _DatumUhradyHP;}
  public java.util.Date dateOfDatumUhradyHP(){return org.xdef.sys.SDatetime.getDate(_DatumUhradyHP);}
  public java.sql.Timestamp timestampOfDatumUhradyHP(){return org.xdef.sys.SDatetime.getTimestamp(_DatumUhradyHP);}
  public java.util.Calendar calendarOfDatumUhradyHP(){return org.xdef.sys.SDatetime.getCalendar(_DatumUhradyHP);}
  public String getMistoUhradyHP() {return _MistoUhradyHP;}
  public Z3 getSkoda() {return _Skoda;}
  public Z3 getJinaSkoda() {return _JinaSkoda;}
  public VozidloDN.Drzitel getDrzitel() {return _Drzitel;}
  public void setOznSegmentu(String x){_OznSegmentu=x;}
  public void setDruhVozidla(String x){_DruhVozidla=x;}
  public void setSPZ(String x){_SPZ=x;}
  public void setMPZ(String x){_MPZ=x;}
  public void setVIN(String x){_VIN=x;}
  public void setZnacka(String x){_Znacka=x;}
  public void setTypVozidla(String x){_TypVozidla=x;}
  public void setRokVyroby(org.xdef.sys.SDatetime x){_RokVyroby=x;}
  public void setRokVyroby(java.util.Date x){_RokVyroby=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setRokVyroby(java.sql.Timestamp x){_RokVyroby=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setRokVyroby(java.util.Calendar x){_RokVyroby=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostSTK(String x){_PlatnostSTK=x;}
  public void setMesicSTKDo(org.xdef.sys.SDatetime x){_MesicSTKDo=x;}
  public void setMesicSTKDo(java.util.Date x){_MesicSTKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setMesicSTKDo(java.sql.Timestamp x){_MesicSTKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setMesicSTKDo(java.util.Calendar x){_MesicSTKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setTypBrzd(String x){_TypBrzd=x;}
  public void setStavBrzd(String x){_StavBrzd=x;}
  public void setKodPojistitele(String x){_KodPojistitele=x;}
  public void setNazevPojistitele(String x){_NazevPojistitele=x;}
  public void setCisloDokladuPojisteni(String x){_CisloDokladuPojisteni=x;}
  public void setPojisteniText(String x){_PojisteniText=x;}
  public void setCisloZK(String x){_CisloZK=x;}
  public void setVydalZK(String x){_VydalZK=x;}
  public void setPlatnostZKOd(org.xdef.sys.SDatetime x){_PlatnostZKOd=x;}
  public void setPlatnostZKOd(java.util.Date x){_PlatnostZKOd=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostZKOd(java.sql.Timestamp x){_PlatnostZKOd=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostZKOd(java.util.Calendar x){_PlatnostZKOd=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostZKDo(org.xdef.sys.SDatetime x){_PlatnostZKDo=x;}
  public void setPlatnostZKDo(java.util.Date x){_PlatnostZKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostZKDo(java.sql.Timestamp x){_PlatnostZKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPlatnostZKDo(java.util.Calendar x){_PlatnostZKDo=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setPojistneHPKc(Integer x){_PojistneHPKc=x;}
  public void setDatumUhradyHP(org.xdef.sys.SDatetime x){_DatumUhradyHP=x;}
  public void setDatumUhradyHP(java.util.Date x){_DatumUhradyHP=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumUhradyHP(java.sql.Timestamp x){_DatumUhradyHP=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumUhradyHP(java.util.Calendar x){_DatumUhradyHP=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setMistoUhradyHP(String x){_MistoUhradyHP=x;}
  public void setSkoda(Z3 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Skoda", null, "SouborD1A#VozidloDN/$mixed/Skoda");
    _Skoda=x;
  }
  public void setJinaSkoda(Z3 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "JinaSkoda", null, "SouborD1A#VozidloDN/$mixed/JinaSkoda");
    _JinaSkoda=x;
  }
  public void setDrzitel(VozidloDN.Drzitel x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "Drzitel", null, "SouborD1A#VozidloDN/$mixed/Drzitel");
    _Drzitel=x;
  }
  public String xposOfOznSegmentu(){return XD_XPos+"/@OznSegmentu";}
  public String xposOfDruhVozidla(){return XD_XPos+"/@DruhVozidla";}
  public String xposOfSPZ(){return XD_XPos+"/@SPZ";}
  public String xposOfMPZ(){return XD_XPos+"/@MPZ";}
  public String xposOfVIN(){return XD_XPos+"/@VIN";}
  public String xposOfZnacka(){return XD_XPos+"/@Znacka";}
  public String xposOfTypVozidla(){return XD_XPos+"/@TypVozidla";}
  public String xposOfRokVyroby(){return XD_XPos+"/@RokVyroby";}
  public String xposOfPlatnostSTK(){return XD_XPos+"/@PlatnostSTK";}
  public String xposOfMesicSTKDo(){return XD_XPos+"/@MesicSTKDo";}
  public String xposOfTypBrzd(){return XD_XPos+"/@TypBrzd";}
  public String xposOfStavBrzd(){return XD_XPos+"/@StavBrzd";}
  public String xposOfKodPojistitele(){return XD_XPos+"/@KodPojistitele";}
  public String xposOfNazevPojistitele(){return XD_XPos+"/@NazevPojistitele";}
  public String xposOfCisloDokladuPojisteni(){return XD_XPos+"/@CisloDokladuPojisteni";}
  public String xposOfPojisteniText(){return XD_XPos+"/@PojisteniText";}
  public String xposOfCisloZK(){return XD_XPos+"/@CisloZK";}
  public String xposOfVydalZK(){return XD_XPos+"/@VydalZK";}
  public String xposOfPlatnostZKOd(){return XD_XPos+"/@PlatnostZKOd";}
  public String xposOfPlatnostZKDo(){return XD_XPos+"/@PlatnostZKDo";}
  public String xposOfPojistneHPKc(){return XD_XPos+"/@PojistneHPKc";}
  public String xposOfDatumUhradyHP(){return XD_XPos+"/@DatumUhradyHP";}
  public String xposOfMistoUhradyHP(){return XD_XPos+"/@MistoUhradyHP";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  @Override
  public org.w3c.dom.Element toXml()
    {return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(org.xdef.component.XComponent p,
    String name, String ns, String xdPos) {
    XD_Parent=p; XD_NodeName=name; XD_NamespaceURI=ns; XD_Model=xdPos;
  }
  @Override
  public String xGetNamespaceURI() {return XD_NamespaceURI;}
  @Override
  public String xGetXPos() {return XD_XPos;}
  @Override
  public void xSetXPos(String xpos){XD_XPos = xpos;}
  @Override
  public int xGetNodeIndex() {return XD_Index;}
  @Override
  public void xSetNodeIndex(int index) {XD_Index = index;}
  @Override
  public org.xdef.component.XComponent xGetParent() {return XD_Parent;}
  @Override
  public Object xGetObject() {return XD_Object;}
  @Override
  public void xSetObject(final Object obj) {XD_Object = obj;}
  @Override
  public String toString() {return "XComponent: "+xGetModelPosition();}
  @Override
  public String xGetModelPosition() {return XD_Model;}
  @Override
  public int xGetModelIndex() {return -1;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
    org.w3c.dom.Element el;
    if (doc==null) {
      doc = org.xdef.xml.KXmlUtils.newDocument(XD_NamespaceURI,
        XD_NodeName, null);
      el = doc.getDocumentElement();
    } else {
      el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
      if (doc.getDocumentElement()==null) doc.appendChild(el);
    }
    if (getOznSegmentu() != null)
      el.setAttribute(XD_Name_OznSegmentu, getOznSegmentu());
    if (getDruhVozidla() != null)
      el.setAttribute(XD_Name_DruhVozidla, getDruhVozidla());
    if (getSPZ() != null)
      el.setAttribute(XD_Name_SPZ, getSPZ());
    if (getMPZ() != null)
      el.setAttribute(XD_Name_MPZ, getMPZ());
    if (getVIN() != null)
      el.setAttribute(XD_Name_VIN, getVIN());
    if (getZnacka() != null)
      el.setAttribute(XD_Name_Znacka, getZnacka());
    if (getTypVozidla() != null)
      el.setAttribute(XD_Name_TypVozidla, getTypVozidla());
    if (getRokVyroby() != null)
      el.setAttribute(XD_Name_RokVyroby, getRokVyroby().formatDate("yyyy"));
    if (getPlatnostSTK() != null)
      el.setAttribute(XD_Name_PlatnostSTK, getPlatnostSTK());
    if (getMesicSTKDo() != null)
      el.setAttribute(XD_Name_MesicSTKDo, getMesicSTKDo().formatDate("M/yyyy"));
    if (getTypBrzd() != null)
      el.setAttribute(XD_Name_TypBrzd, getTypBrzd());
    if (getStavBrzd() != null)
      el.setAttribute(XD_Name_StavBrzd, getStavBrzd());
    if (getKodPojistitele() != null)
      el.setAttribute(XD_Name_KodPojistitele, getKodPojistitele());
    if (getNazevPojistitele() != null)
      el.setAttribute(XD_Name_NazevPojistitele, getNazevPojistitele());
    if (getCisloDokladuPojisteni() != null)
      el.setAttribute(XD_Name_CisloDokladuPojisteni, getCisloDokladuPojisteni());
    if (getPojisteniText() != null)
      el.setAttribute(XD_Name_PojisteniText, getPojisteniText());
    if (getCisloZK() != null)
      el.setAttribute(XD_Name_CisloZK, getCisloZK());
    if (getVydalZK() != null)
      el.setAttribute(XD_Name_VydalZK, getVydalZK());
    if (getPlatnostZKOd() != null)
      el.setAttribute(XD_Name_PlatnostZKOd, getPlatnostZKOd().formatDate("d.M.yyyy"));
    if (getPlatnostZKDo() != null)
      el.setAttribute(XD_Name_PlatnostZKDo, getPlatnostZKDo().formatDate("d.M.yyyy"));
    if (getPojistneHPKc() != null)
      el.setAttribute(XD_Name_PojistneHPKc, String.valueOf(getPojistneHPKc()));
    if (getDatumUhradyHP() != null)
      el.setAttribute(XD_Name_DatumUhradyHP, getDatumUhradyHP().formatDate("d.M.yyyy"));
    if (getMistoUhradyHP() != null)
      el.setAttribute(XD_Name_MistoUhradyHP, getMistoUhradyHP());
    for (org.xdef.component.XComponent x: xGetNodeList())
      el.appendChild(x.toXml(doc));
    return el;
  }
  @Override
  public Object toJon() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.List<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    org.xdef.component.XComponentUtil.addXC(a, getSkoda());
    org.xdef.component.XComponentUtil.addXC(a, getJinaSkoda());
    org.xdef.component.XComponentUtil.addXC(a, getDrzitel());
    return a;
  }
  public VozidloDN() {}
  public VozidloDN(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public VozidloDN(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"2BF19086D0F2B8B3D724253D9F7DED9A".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_OznSegmentu="OznSegmentu";
  private String _OznSegmentu;
  private String XD_Name_DruhVozidla="DruhVozidla";
  private String _DruhVozidla;
  private String XD_Name_SPZ="SPZ";
  private String _SPZ;
  private String XD_Name_MPZ="MPZ";
  private String _MPZ;
  private String XD_Name_VIN="VIN";
  private String _VIN;
  private String XD_Name_Znacka="Znacka";
  private String _Znacka;
  private String XD_Name_TypVozidla="TypVozidla";
  private String _TypVozidla;
  private String XD_Name_RokVyroby="RokVyroby";
  private org.xdef.sys.SDatetime _RokVyroby;
  private String XD_Name_PlatnostSTK="PlatnostSTK";
  private String _PlatnostSTK;
  private String XD_Name_MesicSTKDo="MesicSTKDo";
  private org.xdef.sys.SDatetime _MesicSTKDo;
  private String XD_Name_TypBrzd="TypBrzd";
  private String _TypBrzd;
  private String XD_Name_StavBrzd="StavBrzd";
  private String _StavBrzd;
  private String XD_Name_KodPojistitele="KodPojistitele";
  private String _KodPojistitele;
  private String XD_Name_NazevPojistitele="NazevPojistitele";
  private String _NazevPojistitele;
  private String XD_Name_CisloDokladuPojisteni="CisloDokladuPojisteni";
  private String _CisloDokladuPojisteni;
  private String XD_Name_PojisteniText="PojisteniText";
  private String _PojisteniText;
  private String XD_Name_CisloZK="CisloZK";
  private String _CisloZK;
  private String XD_Name_VydalZK="VydalZK";
  private String _VydalZK;
  private String XD_Name_PlatnostZKOd="PlatnostZKOd";
  private org.xdef.sys.SDatetime _PlatnostZKOd;
  private String XD_Name_PlatnostZKDo="PlatnostZKDo";
  private org.xdef.sys.SDatetime _PlatnostZKDo;
  private String XD_Name_PojistneHPKc="PojistneHPKc";
  private Integer _PojistneHPKc;
  private String XD_Name_DatumUhradyHP="DatumUhradyHP";
  private org.xdef.sys.SDatetime _DatumUhradyHP;
  private String XD_Name_MistoUhradyHP="MistoUhradyHP";
  private String _MistoUhradyHP;
  private Z3 _Skoda;
  private Z3 _JinaSkoda;
  private VozidloDN.Drzitel _Drzitel;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "VozidloDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#VozidloDN";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@OznSegmentu")) {
      XD_Name_OznSegmentu = x.getNodeName();
      setOznSegmentu(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@DruhVozidla")) {
      XD_Name_DruhVozidla = x.getNodeName();
      setDruhVozidla(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@SPZ")) {
      XD_Name_SPZ = x.getNodeName();
      setSPZ(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@MPZ")) {
      XD_Name_MPZ = x.getNodeName();
      setMPZ(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@VIN")) {
      XD_Name_VIN = x.getNodeName();
      setVIN(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Znacka")) {
      XD_Name_Znacka = x.getNodeName();
      setZnacka(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TypVozidla")) {
      XD_Name_TypVozidla = x.getNodeName();
      setTypVozidla(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@RokVyroby")) {
      XD_Name_RokVyroby = x.getNodeName();
      setRokVyroby(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PlatnostSTK")) {
      XD_Name_PlatnostSTK = x.getNodeName();
      setPlatnostSTK(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@MesicSTKDo")) {
      XD_Name_MesicSTKDo = x.getNodeName();
      setMesicSTKDo(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TypBrzd")) {
      XD_Name_TypBrzd = x.getNodeName();
      setTypBrzd(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@StavBrzd")) {
      XD_Name_StavBrzd = x.getNodeName();
      setStavBrzd(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@KodPojistitele")) {
      XD_Name_KodPojistitele = x.getNodeName();
      setKodPojistitele(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@NazevPojistitele")) {
      XD_Name_NazevPojistitele = x.getNodeName();
      setNazevPojistitele(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@CisloDokladuPojisteni")) {
      XD_Name_CisloDokladuPojisteni = x.getNodeName();
      setCisloDokladuPojisteni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PojisteniText")) {
      XD_Name_PojisteniText = x.getNodeName();
      setPojisteniText(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@CisloZK")) {
      XD_Name_CisloZK = x.getNodeName();
      setCisloZK(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@VydalZK")) {
      XD_Name_VydalZK = x.getNodeName();
      setVydalZK(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PlatnostZKOd")) {
      XD_Name_PlatnostZKOd = x.getNodeName();
      setPlatnostZKOd(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PlatnostZKDo")) {
      XD_Name_PlatnostZKDo = x.getNodeName();
      setPlatnostZKDo(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@PojistneHPKc")) {
      XD_Name_PojistneHPKc = x.getNodeName();
      setPojistneHPKc(parseResult.getParsedValue().intValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@DatumUhradyHP")) {
      XD_Name_DatumUhradyHP = x.getNodeName();
      setDatumUhradyHP(parseResult.getParsedValue().datetimeValue());
    } else {
      XD_Name_MistoUhradyHP = x.getNodeName();
      setMistoUhradyHP(parseResult.getParsedValue().stringValue());
    }
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("SouborD1A#VozidloDN/$mixed/Skoda".equals(s))
      return new test.xdef.component.Z3(this, x);
    if ("SouborD1A#VozidloDN/$mixed/JinaSkoda".equals(s))
      return new test.xdef.component.Z3(this, x);
    return new Drzitel(this, x); // SouborD1A#VozidloDN/$mixed/Drzitel
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("SouborD1A#VozidloDN/$mixed/Skoda".equals(s))
      setSkoda((test.xdef.component.Z3)x);
    else if ("SouborD1A#VozidloDN/$mixed/JinaSkoda".equals(s))
      setJinaSkoda((test.xdef.component.Z3)x);
    else
      setDrzitel((Drzitel)x); //SouborD1A#VozidloDN/$mixed/Drzitel
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class Drzitel implements org.xdef.component.XComponent{
  public String get$value() {return _$value;}
  public void set$value(String x){_$value=x;}
  public String xposOf$value(){return XD_XPos+"/$text";}
//<editor-fold defaultstate="collapsed" desc="Implementation of XComponent interface">
  @Override
  public org.w3c.dom.Element toXml()
    {return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(org.xdef.component.XComponent p,
    String name, String ns, String xdPos) {
    XD_Parent=p; XD_NodeName=name; XD_NamespaceURI=ns; XD_Model=xdPos;
  }
  @Override
  public String xGetNamespaceURI() {return XD_NamespaceURI;}
  @Override
  public String xGetXPos() {return XD_XPos;}
  @Override
  public void xSetXPos(String xpos){XD_XPos = xpos;}
  @Override
  public int xGetNodeIndex() {return XD_Index;}
  @Override
  public void xSetNodeIndex(int index) {XD_Index = index;}
  @Override
  public org.xdef.component.XComponent xGetParent() {return XD_Parent;}
  @Override
  public Object xGetObject() {return XD_Object;}
  @Override
  public void xSetObject(final Object obj) {XD_Object = obj;}
  @Override
  public String toString() {return "XComponent: "+xGetModelPosition();}
  @Override
  public String xGetModelPosition() {return XD_Model;}
  @Override
  public int xGetModelIndex() {return 3;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
    org.w3c.dom.Element el;
    if (doc==null) {
      doc = org.xdef.xml.KXmlUtils.newDocument(XD_NamespaceURI,
        XD_NodeName, null);
      el = doc.getDocumentElement();
    } else {
      el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
    }
    for (org.xdef.component.XComponent x: xGetNodeList())
      el.appendChild(x.toXml(doc));
    return el;
  }
  @Override
  public Object toJon() {return org.xdef.json.JsonUtil.xmlToJson(toXml());}
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    if (get$value() != null)
      org.xdef.component.XComponentUtil.addText(this,
        "SouborD1A#text/$text", a, get$value(), _$$value);
    return a;
  }
  public Drzitel() {}
  public Drzitel(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Drzitel(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"0BBC8E2A504A9E2D3C354DD465C51838".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Drzitel";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#VozidloDN/$mixed/Drzitel";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public org.xdef.component.XComponent xCreateXChild(
    org.xdef.proc.XXNode x)
    {return null;}
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){}
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
}
}