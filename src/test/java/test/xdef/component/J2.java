// This file was generated by cz.syntea.xdef.component.GenXComponent.
// XDPosition: "J#C".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class J2 implements cz.syntea.xdef.component.XComponent{
  public String get$value() {return _$value;}
  public J2.D getD() {return _D;}
  public String get$value1() {return _$value1;}
  public java.util.List<J2.D2> listOfD2() {return _D2;}
  public String get$value2() {return _$value2;}
  public void set$value(String x) {_$value = x;}
  public void setD(J2.D x) {_D = x;}
  public void set$value1(String x) {_$value1 = x;}
  public void addD2(J2.D2 x) {
    if (x!=null) _D2.add(x);
  }
  public void set$value2(String x) {_$value2 = x;}
  public String xposOf$value(){return XD_XPos + "/$text";}
  public String xposOf$value1(){return XD_XPos + "/$text";}
  public String xposOf$value2(){return XD_XPos + "/$text";}
//<editor-fold defaultstate="collapsed" desc="XComponent interface">
  @Override
  public org.w3c.dom.Element toXml()
    {return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(cz.syntea.xdef.component.XComponent p,
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
  public cz.syntea.xdef.component.XComponent xGetParent() {return XD_Parent;}
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
    if (doc == null) {
      doc = cz.syntea.xdef.xml.KXmlUtils.newDocument(
        XD_NamespaceURI, XD_NodeName, null);
      el = doc.getDocumentElement();
    } else {
      el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
      if (doc.getDocumentElement() == null) doc.appendChild(el);
    }
    for (cz.syntea.xdef.component.XComponent x: XD_List==null?xGetNodeList():XD_List)
      el.appendChild(x.toXml(doc));
    XD_List = null;
    return el;
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<cz.syntea.xdef.component.XComponent> a =
      new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();
    if (get$value() != null)
      cz.syntea.xdef.component.XComponentUtil.addText(this,
        "J#C/$text", a, get$value(), _$$value);
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getD());
    if (get$value1() != null)
      cz.syntea.xdef.component.XComponentUtil.addText(this,
        "J#C/$text[2]", a, get$value1(), _$$value1);
    cz.syntea.xdef.component.XComponentUtil.addXC(a, listOfD2());
    if (get$value2() != null)
      cz.syntea.xdef.component.XComponentUtil.addText(this,
        "J#C/$text[3]", a, get$value2(), _$$value2);
    return XD_List = a;
  }
  public J2() {}
  public J2(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public J2(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"758ADB74235695AEF0C3191468C396D7".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private J2.D _D;
  private String _$value1;
  private char _$$value1= (char) -1;
  private final java.util.List<J2.D2> _D2 = new java.util.ArrayList<J2.D2>();
  private String _$value2;
  private char _$$value2= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "C";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="J#C";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {
    if ("J#C/$text".equals(xx.getXMNode().getXDPosition())) {
      _$$value=(char) XD_ndx++;
      set$value(parseResult.getParsedValue().stringValue());
    } else if ("J#C/$text[2]".equals(xx.getXMNode().getXDPosition())) {
      _$$value1=(char) XD_ndx++;
      set$value1(parseResult.getParsedValue().stringValue());
    } else if ("J#C/$text[3]".equals(xx.getXMNode().getXDPosition())) {
      _$$value2=(char) XD_ndx++;
      set$value2(parseResult.getParsedValue().stringValue());
    }
  }
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx) {
    String s = xx.getXMElement().getXDPosition();
    if ("J#C/D".equals(s))
      return new D(this, xx);
    return new D2(this, xx); // J#C/D[2]
  }
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {
    xc.xSetNodeIndex(XD_ndx++);
    String s = xc.xGetModelPosition();
    if ("J#C/D".equals(s))
      setD((D) xc);
    else
      listOfD2().add((D2) xc); //J#C/D[2]
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class D implements cz.syntea.xdef.component.XComponent{
//<editor-fold defaultstate="collapsed" desc="XComponent interface">
  @Override
  public org.w3c.dom.Element toXml()
    {return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(cz.syntea.xdef.component.XComponent p,
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
  public cz.syntea.xdef.component.XComponent xGetParent() {return XD_Parent;}
  @Override
  public Object xGetObject() {return XD_Object;}
  @Override
  public void xSetObject(final Object obj) {XD_Object = obj;}
  @Override
  public String toString() {return "XComponent: "+xGetModelPosition();}
  @Override
  public String xGetModelPosition() {return XD_Model;}
  @Override
  public int xGetModelIndex() {return 1;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
    return doc!=null ? doc.createElementNS(XD_NamespaceURI, XD_NodeName)
      : cz.syntea.xdef.xml.KXmlUtils.newDocument(
        XD_NamespaceURI, XD_NodeName, null).getDocumentElement();
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();}
  public D() {}
  public D(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public D(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"AE000FE9086A94685823DB975ED9377F".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "D";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="J#C/D";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx)
    {return null;}
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {}
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
}
public static class D2 implements cz.syntea.xdef.component.XComponent{
//<editor-fold defaultstate="collapsed" desc="XComponent interface">
  @Override
  public org.w3c.dom.Element toXml()
    {return (org.w3c.dom.Element) toXml((org.w3c.dom.Document) null);}
  @Override
  public String xGetNodeName() {return XD_NodeName;}
  @Override
  public void xInit(cz.syntea.xdef.component.XComponent p,
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
  public cz.syntea.xdef.component.XComponent xGetParent() {return XD_Parent;}
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
    return doc!=null ? doc.createElementNS(XD_NamespaceURI, XD_NodeName)
      : cz.syntea.xdef.xml.KXmlUtils.newDocument(
        XD_NamespaceURI, XD_NodeName, null).getDocumentElement();
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();}
  public D2() {}
  public D2(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public D2(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"7377249335685E3CA225E6B2542FF053".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "D";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="J#C/D[2]";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx)
    {return null;}
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {}
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
}
}