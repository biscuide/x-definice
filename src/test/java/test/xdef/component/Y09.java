// This file was generated by cz.syntea.xdef.component.GenXComponent.
// XDPosition: "Y09#A".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Y09 implements cz.syntea.xdef.component.XComponent{
  public String getx() {return _x;}
  public String gety() {return _y;}
  public Y09.$any get$any() {return _$any;}
  public void setx(String x) {_x = x;}
  public void sety(String x) {_y = x;}
  public void set$any(Y09.$any x) {_$any = x;}
  public String xposOfx(){return XD_XPos + "/@x";}
  public String xposOfy(){return XD_XPos + "/@y";}
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
    if (getx() != null)
      el.setAttribute("x", getx());
    if (gety() != null)
      el.setAttribute("y", gety());
    for (cz.syntea.xdef.component.XComponent x: XD_List==null?xGetNodeList():XD_List)
      el.appendChild(x.toXml(doc));
    XD_List = null;
    return el;
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<cz.syntea.xdef.component.XComponent> a =
      new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();
    cz.syntea.xdef.component.XComponentUtil.addXC(a, get$any());
    return XD_List = a;
  }
  public Y09() {}
  public Y09(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Y09(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"835AAA029A29BEE6B34428E9D440E750".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _x;
  private String _y;
  private Y09.$any _$any;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "A";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="Y09#A";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {
    if (xx.getXMNode().getXDPosition().endsWith("/@x"))
      setx(parseResult.getParsedValue().stringValue());
    else sety(parseResult.getParsedValue().stringValue());
  }
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx)
    {return new $any(this, xx);}
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {
    xc.xSetNodeIndex(XD_ndx++);
    set$any(($any) xc); //Y09#A/$any
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class $any implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 0;}
  @Override
  public org.w3c.dom.Node toXml(org.w3c.dom.Document doc) {
    if (doc == null) {
      return cz.syntea.xdef.xml.KXmlUtils.parseXml(XD_Any)
        .getDocumentElement();
    } else {
      return (org.w3c.dom.Element)
        doc.adoptNode(cz.syntea.xdef.xml.KXmlUtils.parseXml(XD_Any)
          .getDocumentElement());
    }
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    return new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();}
  public $any() {}
  public $any(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public $any(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"117B364B3D0FA862BEBF8C1E91BB23A1".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "$any";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private String XD_XPos;
  private String XD_Model="Y09#A/$any";
  private String XD_Any;
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
  public void xSetAny(org.w3c.dom.Element el) {
    XD_Any = cz.syntea.xdef.xml.KXmlUtils.nodeToString(el);
  }
// </editor-fold>
}
}