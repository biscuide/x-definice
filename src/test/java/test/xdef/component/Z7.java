// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#RozhodnutiDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Z7 implements org.xdef.component.XComponent{
  public org.xdef.sys.SDatetime getDatumRozhodnuti() {return _DatumRozhodnuti;}
  public java.util.Date dateOfDatumRozhodnuti(){return org.xdef.sys.SDatetime.getDate(_DatumRozhodnuti);}
  public java.sql.Timestamp timestampOfDatumRozhodnuti(){return org.xdef.sys.SDatetime.getTimestamp(_DatumRozhodnuti);}
  public java.util.Calendar calendarOfDatumRozhodnuti(){return org.xdef.sys.SDatetime.getCalendar(_DatumRozhodnuti);}
  public String get$value() {return _$value;}
  public void setDatumRozhodnuti(org.xdef.sys.SDatetime x){_DatumRozhodnuti=x;}
  public void setDatumRozhodnuti(java.util.Date x){_DatumRozhodnuti=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumRozhodnuti(java.sql.Timestamp x){_DatumRozhodnuti=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumRozhodnuti(java.util.Calendar x){_DatumRozhodnuti=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void set$value(String x){_$value=x;}
  public String xposOfDatumRozhodnuti(){return XD_XPos+"/@DatumRozhodnuti";}
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
    if (getDatumRozhodnuti() != null)
      el.setAttribute(XD_Name_DatumRozhodnuti, getDatumRozhodnuti().formatDate("d.M.yyyy"));
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
        "SouborD1A#RozhodnutiDN/$text", a, get$value(), _$$value);
    return a;
  }
  public Z7() {}
  public Z7(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Z7(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"E7365B687489FBBA126C707177842884".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_DatumRozhodnuti="DatumRozhodnuti";
  private org.xdef.sys.SDatetime _DatumRozhodnuti;
  private String _$value;
  private char _$$value= (char) -1;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "RozhodnutiDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#RozhodnutiDN";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
  }
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){
    XD_Name_DatumRozhodnuti = x.getNodeName();
    setDatumRozhodnuti(parseResult.getParsedValue().datetimeValue());
  }
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