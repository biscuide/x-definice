// This file was generated by org.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#Osoba".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class Z4 implements org.xdef.component.XComponent{
  public String getJmeno() {return _Jmeno;}
  public String getPrijmeni() {return _Prijmeni;}
  public String getRodnePrijmeni() {return _RodnePrijmeni;}
  public String getTitulPred() {return _TitulPred;}
  public String getTitulZa() {return _TitulZa;}
  public String getRC() {return _RC;}
  public String getPohlavi() {return _Pohlavi;}
  public String getOsobniStav() {return _OsobniStav;}
  public org.xdef.sys.SDatetime getDatumNarozeni() {return _DatumNarozeni;}
  public java.util.Date dateOfDatumNarozeni(){return org.xdef.sys.SDatetime.getDate(_DatumNarozeni);}
  public java.sql.Timestamp timestampOfDatumNarozeni(){return org.xdef.sys.SDatetime.getTimestamp(_DatumNarozeni);}
  public java.util.Calendar calendarOfDatumNarozeni(){return org.xdef.sys.SDatetime.getCalendar(_DatumNarozeni);}
  public String getMistoNarozeni() {return _MistoNarozeni;}
  public String getStatNarozeni() {return _StatNarozeni;}
  public String getStatniPrislusnost() {return _StatniPrislusnost;}
  public String getProfese() {return _Profese;}
  public Z9 getTrvalyPobyt() {return _TrvalyPobyt;}
  public Z9 getPrechodnyPobyt() {return _PrechodnyPobyt;}
  public void setJmeno(String x){_Jmeno=x;}
  public void setPrijmeni(String x){_Prijmeni=x;}
  public void setRodnePrijmeni(String x){_RodnePrijmeni=x;}
  public void setTitulPred(String x){_TitulPred=x;}
  public void setTitulZa(String x){_TitulZa=x;}
  public void setRC(String x){_RC=x;}
  public void setPohlavi(String x){_Pohlavi=x;}
  public void setOsobniStav(String x){_OsobniStav=x;}
  public void setDatumNarozeni(org.xdef.sys.SDatetime x){_DatumNarozeni=x;}
  public void setDatumNarozeni(java.util.Date x){_DatumNarozeni=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumNarozeni(java.sql.Timestamp x){_DatumNarozeni=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setDatumNarozeni(java.util.Calendar x){_DatumNarozeni=x==null?null:new org.xdef.sys.SDatetime(x);}
  public void setMistoNarozeni(String x){_MistoNarozeni=x;}
  public void setStatNarozeni(String x){_StatNarozeni=x;}
  public void setStatniPrislusnost(String x){_StatniPrislusnost=x;}
  public void setProfese(String x){_Profese=x;}
  public void setTrvalyPobyt(Z9 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "TrvalyPobyt", null, "SouborD1A#Osoba/$mixed/TrvalyPobyt");
    _TrvalyPobyt=x;
  }
  public void setPrechodnyPobyt(Z9 x){
    if (x!=null && x.xGetXPos() == null)
      x.xInit(this, "PrechodnyPobyt", null, "SouborD1A#Osoba/$mixed/PrechodnyPobyt");
    _PrechodnyPobyt=x;
  }
  public String xposOfJmeno(){return XD_XPos+"/@Jmeno";}
  public String xposOfPrijmeni(){return XD_XPos+"/@Prijmeni";}
  public String xposOfRodnePrijmeni(){return XD_XPos+"/@RodnePrijmeni";}
  public String xposOfTitulPred(){return XD_XPos+"/@TitulPred";}
  public String xposOfTitulZa(){return XD_XPos+"/@TitulZa";}
  public String xposOfRC(){return XD_XPos+"/@RC";}
  public String xposOfPohlavi(){return XD_XPos+"/@Pohlavi";}
  public String xposOfOsobniStav(){return XD_XPos+"/@OsobniStav";}
  public String xposOfDatumNarozeni(){return XD_XPos+"/@DatumNarozeni";}
  public String xposOfMistoNarozeni(){return XD_XPos+"/@MistoNarozeni";}
  public String xposOfStatNarozeni(){return XD_XPos+"/@StatNarozeni";}
  public String xposOfStatniPrislusnost(){return XD_XPos+"/@StatniPrislusnost";}
  public String xposOfProfese(){return XD_XPos+"/@Profese";}
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
    if (getJmeno() != null)
      el.setAttribute(XD_Name_Jmeno, getJmeno());
    if (getPrijmeni() != null)
      el.setAttribute(XD_Name_Prijmeni, getPrijmeni());
    if (getRodnePrijmeni() != null)
      el.setAttribute(XD_Name_RodnePrijmeni, getRodnePrijmeni());
    if (getTitulPred() != null)
      el.setAttribute(XD_Name_TitulPred, getTitulPred());
    if (getTitulZa() != null)
      el.setAttribute(XD_Name_TitulZa, getTitulZa());
    if (getRC() != null)
      el.setAttribute(XD_Name_RC, getRC());
    if (getPohlavi() != null)
      el.setAttribute(XD_Name_Pohlavi, getPohlavi());
    if (getOsobniStav() != null)
      el.setAttribute(XD_Name_OsobniStav, getOsobniStav());
    if (getDatumNarozeni() != null)
      el.setAttribute(XD_Name_DatumNarozeni, getDatumNarozeni().formatDate("d.M.yy"));
    if (getMistoNarozeni() != null)
      el.setAttribute(XD_Name_MistoNarozeni, getMistoNarozeni());
    if (getStatNarozeni() != null)
      el.setAttribute(XD_Name_StatNarozeni, getStatNarozeni());
    if (getStatniPrislusnost() != null)
      el.setAttribute(XD_Name_StatniPrislusnost, getStatniPrislusnost());
    if (getProfese() != null)
      el.setAttribute(XD_Name_Profese, getProfese());
    for (org.xdef.component.XComponent x: xGetNodeList())
      el.appendChild(x.toXml(doc));
    return el;
  }
  @Override
  public java.util.List<org.xdef.component.XComponent> xGetNodeList() {
    java.util.List<org.xdef.component.XComponent> a=
      new java.util.ArrayList<org.xdef.component.XComponent>();
    org.xdef.component.XComponentUtil.addXC(a, getTrvalyPobyt());
    org.xdef.component.XComponentUtil.addXC(a, getPrechodnyPobyt());
    return a;
  }
  public Z4() {}
  public Z4(org.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Z4(org.xdef.component.XComponent p,org.xdef.proc.XXNode x){
    org.w3c.dom.Element el=x.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=x.getXPos();
    XD_Model=x.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"7AE9EB136AB2113A55BB5A4659161C98".equals(
      x.getXMElement().getDigest())) { //incompatible element model
      throw new org.xdef.sys.SRuntimeException(
        org.xdef.msg.XDEF.XDEF374);
    }
  }
  private String XD_Name_Jmeno="Jmeno";
  private String _Jmeno;
  private String XD_Name_Prijmeni="Prijmeni";
  private String _Prijmeni;
  private String XD_Name_RodnePrijmeni="RodnePrijmeni";
  private String _RodnePrijmeni;
  private String XD_Name_TitulPred="TitulPred";
  private String _TitulPred;
  private String XD_Name_TitulZa="TitulZa";
  private String _TitulZa;
  private String XD_Name_RC="RC";
  private String _RC;
  private String XD_Name_Pohlavi="Pohlavi";
  private String _Pohlavi;
  private String XD_Name_OsobniStav="OsobniStav";
  private String _OsobniStav;
  private String XD_Name_DatumNarozeni="DatumNarozeni";
  private org.xdef.sys.SDatetime _DatumNarozeni;
  private String XD_Name_MistoNarozeni="MistoNarozeni";
  private String _MistoNarozeni;
  private String XD_Name_StatNarozeni="StatNarozeni";
  private String _StatNarozeni;
  private String XD_Name_StatniPrislusnost="StatniPrislusnost";
  private String _StatniPrislusnost;
  private String XD_Name_Profese="Profese";
  private String _Profese;
  private Z9 _TrvalyPobyt;
  private Z9 _PrechodnyPobyt;
  private org.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Osoba";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private String XD_Model="SouborD1A#Osoba";
  @Override
  public void xSetText(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult){}
  @Override
  public void xSetAttr(org.xdef.proc.XXNode x,
    org.xdef.XDParseResult parseResult) {
    if (x.getXMNode().getXDPosition().endsWith("/@DatumNarozeni")) {
      XD_Name_DatumNarozeni = x.getNodeName();
      setDatumNarozeni(parseResult.getParsedValue().datetimeValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Jmeno")) {
      XD_Name_Jmeno = x.getNodeName();
      setJmeno(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@MistoNarozeni")) {
      XD_Name_MistoNarozeni = x.getNodeName();
      setMistoNarozeni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@OsobniStav")) {
      XD_Name_OsobniStav = x.getNodeName();
      setOsobniStav(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Pohlavi")) {
      XD_Name_Pohlavi = x.getNodeName();
      setPohlavi(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Prijmeni")) {
      XD_Name_Prijmeni = x.getNodeName();
      setPrijmeni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@Profese")) {
      XD_Name_Profese = x.getNodeName();
      setProfese(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@RC")) {
      XD_Name_RC = x.getNodeName();
      setRC(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@RodnePrijmeni")) {
      XD_Name_RodnePrijmeni = x.getNodeName();
      setRodnePrijmeni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@StatNarozeni")) {
      XD_Name_StatNarozeni = x.getNodeName();
      setStatNarozeni(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@StatniPrislusnost")) {
      XD_Name_StatniPrislusnost = x.getNodeName();
      setStatniPrislusnost(parseResult.getParsedValue().stringValue());
    } else if (x.getXMNode().getXDPosition().endsWith("/@TitulPred")) {
      XD_Name_TitulPred = x.getNodeName();
      setTitulPred(parseResult.getParsedValue().stringValue());
    } else {
      XD_Name_TitulZa = x.getNodeName();
      setTitulZa(parseResult.getParsedValue().stringValue());
    }
  }
  @Override
  public org.xdef.component.XComponent xCreateXChild(org.xdef.proc.XXNode x) {
    String s = x.getXMElement().getXDPosition();
    if ("SouborD1A#Osoba/$mixed/PrechodnyPobyt".equals(s))
      return new test.xdef.component.Z9(this, x);
    return new test.xdef.component.Z9(this, x); // SouborD1A#Osoba/$mixed/TrvalyPobyt
  }
  @Override
  public void xAddXChild(org.xdef.component.XComponent x){
    x.xSetNodeIndex(XD_ndx++);
    String s = x.xGetModelPosition();
    if ("SouborD1A#Osoba/$mixed/PrechodnyPobyt".equals(s))
      setPrechodnyPobyt((test.xdef.component.Z9)x);
    else
      setTrvalyPobyt((test.xdef.component.Z9)x); //SouborD1A#Osoba/$mixed/TrvalyPobyt
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
}