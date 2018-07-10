// This file was generated by cz.syntea.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#VozidloDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class VozidloDN implements cz.syntea.xdef.component.XComponent{
  public String getCisloDokladuPojisteni() {return _CisloDokladuPojisteni;}
  public String getCisloZK() {return _CisloZK;}
  public cz.syntea.xdef.sys.SDatetime getDatumUhradyHP() {return _DatumUhradyHP;}
  public java.util.Date dateOfDatumUhradyHP() {
    return cz.syntea.xdef.sys.SDatetime.getDate(_DatumUhradyHP);
  }
  public java.sql.Timestamp timestampOfDatumUhradyHP() {
    return cz.syntea.xdef.sys.SDatetime.getTimestamp(_DatumUhradyHP);
  }
  public java.util.Calendar calendarOfDatumUhradyHP() {
    return cz.syntea.xdef.sys.SDatetime.getCalendar(_DatumUhradyHP);
  }
  public String getDruhVozidla() {return _DruhVozidla;}
  public String getKodPojistitele() {return _KodPojistitele;}
  public String getMPZ() {return _MPZ;}
  public cz.syntea.xdef.sys.SDatetime getMesicSTKDo() {return _MesicSTKDo;}
  public java.util.Date dateOfMesicSTKDo() {
    return cz.syntea.xdef.sys.SDatetime.getDate(_MesicSTKDo);
  }
  public java.sql.Timestamp timestampOfMesicSTKDo() {
    return cz.syntea.xdef.sys.SDatetime.getTimestamp(_MesicSTKDo);
  }
  public java.util.Calendar calendarOfMesicSTKDo() {
    return cz.syntea.xdef.sys.SDatetime.getCalendar(_MesicSTKDo);
  }
  public String getMistoUhradyHP() {return _MistoUhradyHP;}
  public String getNazevPojistitele() {return _NazevPojistitele;}
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getPlatnostSTK() {return _PlatnostSTK;}
  public cz.syntea.xdef.sys.SDatetime getPlatnostZKDo() {return _PlatnostZKDo;}
  public java.util.Date dateOfPlatnostZKDo() {
    return cz.syntea.xdef.sys.SDatetime.getDate(_PlatnostZKDo);
  }
  public java.sql.Timestamp timestampOfPlatnostZKDo() {
    return cz.syntea.xdef.sys.SDatetime.getTimestamp(_PlatnostZKDo);
  }
  public java.util.Calendar calendarOfPlatnostZKDo() {
    return cz.syntea.xdef.sys.SDatetime.getCalendar(_PlatnostZKDo);
  }
  public cz.syntea.xdef.sys.SDatetime getPlatnostZKOd() {return _PlatnostZKOd;}
  public java.util.Date dateOfPlatnostZKOd() {
    return cz.syntea.xdef.sys.SDatetime.getDate(_PlatnostZKOd);
  }
  public java.sql.Timestamp timestampOfPlatnostZKOd() {
    return cz.syntea.xdef.sys.SDatetime.getTimestamp(_PlatnostZKOd);
  }
  public java.util.Calendar calendarOfPlatnostZKOd() {
    return cz.syntea.xdef.sys.SDatetime.getCalendar(_PlatnostZKOd);
  }
  public String getPojisteniText() {return _PojisteniText;}
  public Long getPojistneHPKc() {return _PojistneHPKc;}
  public cz.syntea.xdef.sys.SDatetime getRokVyroby() {return _RokVyroby;}
  public java.util.Date dateOfRokVyroby() {
    return cz.syntea.xdef.sys.SDatetime.getDate(_RokVyroby);
  }
  public java.sql.Timestamp timestampOfRokVyroby() {
    return cz.syntea.xdef.sys.SDatetime.getTimestamp(_RokVyroby);
  }
  public java.util.Calendar calendarOfRokVyroby() {
    return cz.syntea.xdef.sys.SDatetime.getCalendar(_RokVyroby);
  }
  public String getSPZ() {return _SPZ;}
  public String getStavBrzd() {return _StavBrzd;}
  public String getTypBrzd() {return _TypBrzd;}
  public String getTypVozidla() {return _TypVozidla;}
  public String getVIN() {return _VIN;}
  public String getVydalZK() {return _VydalZK;}
  public String getZnacka() {return _Znacka;}
  public Z3 getSkoda() {return _Skoda;}
  public Z3 getJinaSkoda() {return _JinaSkoda;}
  public VozidloDN.Drzitel getDrzitel() {return _Drzitel;}
  public void setCisloDokladuPojisteni(String x) {_CisloDokladuPojisteni = x;}
  public void setCisloZK(String x) {_CisloZK = x;}
  public void setDatumUhradyHP(cz.syntea.xdef.sys.SDatetime x) {_DatumUhradyHP = x;}
  public void setDatumUhradyHP(java.util.Date x) {
    _DatumUhradyHP=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setDatumUhradyHP(java.sql.Timestamp x) {
    _DatumUhradyHP=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setDatumUhradyHP(java.util.Calendar x) {
    _DatumUhradyHP=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setDruhVozidla(String x) {_DruhVozidla = x;}
  public void setKodPojistitele(String x) {_KodPojistitele = x;}
  public void setMPZ(String x) {_MPZ = x;}
  public void setMesicSTKDo(cz.syntea.xdef.sys.SDatetime x) {_MesicSTKDo = x;}
  public void setMesicSTKDo(java.util.Date x) {
    _MesicSTKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setMesicSTKDo(java.sql.Timestamp x) {
    _MesicSTKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setMesicSTKDo(java.util.Calendar x) {
    _MesicSTKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setMistoUhradyHP(String x) {_MistoUhradyHP = x;}
  public void setNazevPojistitele(String x) {_NazevPojistitele = x;}
  public void setOznSegmentu(String x) {_OznSegmentu = x;}
  public void setPlatnostSTK(String x) {_PlatnostSTK = x;}
  public void setPlatnostZKDo(cz.syntea.xdef.sys.SDatetime x) {_PlatnostZKDo = x;}
  public void setPlatnostZKDo(java.util.Date x) {
    _PlatnostZKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPlatnostZKDo(java.sql.Timestamp x) {
    _PlatnostZKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPlatnostZKDo(java.util.Calendar x) {
    _PlatnostZKDo=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPlatnostZKOd(cz.syntea.xdef.sys.SDatetime x) {_PlatnostZKOd = x;}
  public void setPlatnostZKOd(java.util.Date x) {
    _PlatnostZKOd=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPlatnostZKOd(java.sql.Timestamp x) {
    _PlatnostZKOd=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPlatnostZKOd(java.util.Calendar x) {
    _PlatnostZKOd=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setPojisteniText(String x) {_PojisteniText = x;}
  public void setPojistneHPKc(Long x) {_PojistneHPKc = x;}
  public void setRokVyroby(cz.syntea.xdef.sys.SDatetime x) {_RokVyroby = x;}
  public void setRokVyroby(java.util.Date x) {
    _RokVyroby=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setRokVyroby(java.sql.Timestamp x) {
    _RokVyroby=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setRokVyroby(java.util.Calendar x) {
    _RokVyroby=x==null ? null : new cz.syntea.xdef.sys.SDatetime(x);
  }
  public void setSPZ(String x) {_SPZ = x;}
  public void setStavBrzd(String x) {_StavBrzd = x;}
  public void setTypBrzd(String x) {_TypBrzd = x;}
  public void setTypVozidla(String x) {_TypVozidla = x;}
  public void setVIN(String x) {_VIN = x;}
  public void setVydalZK(String x) {_VydalZK = x;}
  public void setZnacka(String x) {_Znacka = x;}
  public void setSkoda(Z3 x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "Skoda", null, "SouborD1A#VozidloDN/$mixed/Skoda");
    _Skoda = x;
  }
  public void setJinaSkoda(Z3 x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "JinaSkoda", null, "SouborD1A#VozidloDN/$mixed/JinaSkoda");
    _JinaSkoda = x;
  }
  public void setDrzitel(VozidloDN.Drzitel x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "Drzitel", null, "SouborD1A#VozidloDN/$mixed/Drzitel");
    _Drzitel = x;
  }
  public String xposOfCisloDokladuPojisteni(){return XD_XPos + "/@CisloDokladuPojisteni";}
  public String xposOfCisloZK(){return XD_XPos + "/@CisloZK";}
  public String xposOfDatumUhradyHP(){return XD_XPos + "/@DatumUhradyHP";}
  public String xposOfDruhVozidla(){return XD_XPos + "/@DruhVozidla";}
  public String xposOfKodPojistitele(){return XD_XPos + "/@KodPojistitele";}
  public String xposOfMPZ(){return XD_XPos + "/@MPZ";}
  public String xposOfMesicSTKDo(){return XD_XPos + "/@MesicSTKDo";}
  public String xposOfMistoUhradyHP(){return XD_XPos + "/@MistoUhradyHP";}
  public String xposOfNazevPojistitele(){return XD_XPos + "/@NazevPojistitele";}
  public String xposOfOznSegmentu(){return XD_XPos + "/@OznSegmentu";}
  public String xposOfPlatnostSTK(){return XD_XPos + "/@PlatnostSTK";}
  public String xposOfPlatnostZKDo(){return XD_XPos + "/@PlatnostZKDo";}
  public String xposOfPlatnostZKOd(){return XD_XPos + "/@PlatnostZKOd";}
  public String xposOfPojisteniText(){return XD_XPos + "/@PojisteniText";}
  public String xposOfPojistneHPKc(){return XD_XPos + "/@PojistneHPKc";}
  public String xposOfRokVyroby(){return XD_XPos + "/@RokVyroby";}
  public String xposOfSPZ(){return XD_XPos + "/@SPZ";}
  public String xposOfStavBrzd(){return XD_XPos + "/@StavBrzd";}
  public String xposOfTypBrzd(){return XD_XPos + "/@TypBrzd";}
  public String xposOfTypVozidla(){return XD_XPos + "/@TypVozidla";}
  public String xposOfVIN(){return XD_XPos + "/@VIN";}
  public String xposOfVydalZK(){return XD_XPos + "/@VydalZK";}
  public String xposOfZnacka(){return XD_XPos + "/@Znacka";}
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
    if (getCisloDokladuPojisteni() != null)
      el.setAttribute("CisloDokladuPojisteni", getCisloDokladuPojisteni());
    if (getCisloZK() != null)
      el.setAttribute("CisloZK", getCisloZK());
    if (getDatumUhradyHP() != null)
      el.setAttribute("DatumUhradyHP", getDatumUhradyHP().formatDate("d.M.yyyy"));
    if (getDruhVozidla() != null)
      el.setAttribute("DruhVozidla", getDruhVozidla());
    if (getKodPojistitele() != null)
      el.setAttribute("KodPojistitele", getKodPojistitele());
    if (getMPZ() != null)
      el.setAttribute("MPZ", getMPZ());
    if (getMesicSTKDo() != null)
      el.setAttribute("MesicSTKDo", getMesicSTKDo().formatDate("M/yyyy"));
    if (getMistoUhradyHP() != null)
      el.setAttribute("MistoUhradyHP", getMistoUhradyHP());
    if (getNazevPojistitele() != null)
      el.setAttribute("NazevPojistitele", getNazevPojistitele());
    if (getOznSegmentu() != null)
      el.setAttribute("OznSegmentu", getOznSegmentu());
    if (getPlatnostSTK() != null)
      el.setAttribute("PlatnostSTK", getPlatnostSTK());
    if (getPlatnostZKDo() != null)
      el.setAttribute("PlatnostZKDo", getPlatnostZKDo().formatDate("d.M.yyyy"));
    if (getPlatnostZKOd() != null)
      el.setAttribute("PlatnostZKOd", getPlatnostZKOd().formatDate("d.M.yyyy"));
    if (getPojisteniText() != null)
      el.setAttribute("PojisteniText", getPojisteniText());
    if (getPojistneHPKc() != null)
      el.setAttribute("PojistneHPKc", String.valueOf(getPojistneHPKc()));
    if (getRokVyroby() != null)
      el.setAttribute("RokVyroby", getRokVyroby().formatDate("yyyy"));
    if (getSPZ() != null)
      el.setAttribute("SPZ", getSPZ());
    if (getStavBrzd() != null)
      el.setAttribute("StavBrzd", getStavBrzd());
    if (getTypBrzd() != null)
      el.setAttribute("TypBrzd", getTypBrzd());
    if (getTypVozidla() != null)
      el.setAttribute("TypVozidla", getTypVozidla());
    if (getVIN() != null)
      el.setAttribute("VIN", getVIN());
    if (getVydalZK() != null)
      el.setAttribute("VydalZK", getVydalZK());
    if (getZnacka() != null)
      el.setAttribute("Znacka", getZnacka());
    for (cz.syntea.xdef.component.XComponent x: XD_List==null?xGetNodeList():XD_List)
      el.appendChild(x.toXml(doc));
    XD_List = null;
    return el;
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<cz.syntea.xdef.component.XComponent> a =
      new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getSkoda());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getJinaSkoda());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getDrzitel());
    return XD_List = a;
  }
  public VozidloDN() {}
  public VozidloDN(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public VozidloDN(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"939DFD736F5213FD74465A6F9006AD71".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _CisloDokladuPojisteni;
  private String _CisloZK;
  private cz.syntea.xdef.sys.SDatetime _DatumUhradyHP;
  private String _DruhVozidla;
  private String _KodPojistitele;
  private String _MPZ;
  private cz.syntea.xdef.sys.SDatetime _MesicSTKDo;
  private String _MistoUhradyHP;
  private String _NazevPojistitele;
  private String _OznSegmentu;
  private String _PlatnostSTK;
  private cz.syntea.xdef.sys.SDatetime _PlatnostZKDo;
  private cz.syntea.xdef.sys.SDatetime _PlatnostZKOd;
  private String _PojisteniText;
  private Long _PojistneHPKc;
  private cz.syntea.xdef.sys.SDatetime _RokVyroby;
  private String _SPZ;
  private String _StavBrzd;
  private String _TypBrzd;
  private String _TypVozidla;
  private String _VIN;
  private String _VydalZK;
  private String _Znacka;
  private Z3 _Skoda;
  private Z3 _JinaSkoda;
  private VozidloDN.Drzitel _Drzitel;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "VozidloDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#VozidloDN";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {
    if (xx.getXMNode().getXDPosition().endsWith("/@CisloDokladuPojisteni"))
      setCisloDokladuPojisteni(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@CisloZK"))
      setCisloZK(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@DatumUhradyHP"))
      setDatumUhradyHP(parseResult.getParsedValue().datetimeValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@DruhVozidla"))
      setDruhVozidla(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@KodPojistitele"))
      setKodPojistitele(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@MPZ"))
      setMPZ(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@MesicSTKDo"))
      setMesicSTKDo(parseResult.getParsedValue().datetimeValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@MistoUhradyHP"))
      setMistoUhradyHP(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@NazevPojistitele"))
      setNazevPojistitele(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@OznSegmentu"))
      setOznSegmentu(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PlatnostSTK"))
      setPlatnostSTK(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PlatnostZKDo"))
      setPlatnostZKDo(parseResult.getParsedValue().datetimeValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PlatnostZKOd"))
      setPlatnostZKOd(parseResult.getParsedValue().datetimeValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PojisteniText"))
      setPojisteniText(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PojistneHPKc"))
      setPojistneHPKc(parseResult.getParsedValue().longValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@RokVyroby"))
      setRokVyroby(parseResult.getParsedValue().datetimeValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@SPZ"))
      setSPZ(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@StavBrzd"))
      setStavBrzd(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@TypBrzd"))
      setTypBrzd(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@TypVozidla"))
      setTypVozidla(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@VIN"))
      setVIN(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@VydalZK"))
      setVydalZK(parseResult.getParsedValue().stringValue());
    else setZnacka(parseResult.getParsedValue().stringValue());
  }
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx) {
    String s = xx.getXMElement().getXDPosition();
    if ("SouborD1A#VozidloDN/$mixed/Drzitel".equals(s))
      return new Drzitel(this, xx);
    if ("SouborD1A#VozidloDN/$mixed/JinaSkoda".equals(s))
      return new test.xdef.component.Z3(this, xx);
    return new test.xdef.component.Z3(this, xx); // SouborD1A#VozidloDN/$mixed/Skoda
  }
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {
    xc.xSetNodeIndex(XD_ndx++);
    String s = xc.xGetModelPosition();
    if ("SouborD1A#VozidloDN/$mixed/Drzitel".equals(s))
      setDrzitel((Drzitel) xc);
    else if ("SouborD1A#VozidloDN/$mixed/JinaSkoda".equals(s))
      setJinaSkoda((test.xdef.component.Z3) xc);
    else
      setSkoda((test.xdef.component.Z3) xc); //SouborD1A#VozidloDN/$mixed/Skoda
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class Drzitel implements cz.syntea.xdef.component.XComponent{
  public String get$value() {return _$value;}
  public void set$value(String x) {_$value = x;}
  public String xposOf$value(){return XD_XPos + "/$text";}
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
    org.w3c.dom.Element el;
    if (doc == null) {
      doc = cz.syntea.xdef.xml.KXmlUtils.newDocument(
        XD_NamespaceURI, XD_NodeName, null);
      el = doc.getDocumentElement();
    } else {
      el = doc.createElementNS(XD_NamespaceURI, XD_NodeName);
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
        "SouborD1A#text/$text", a, get$value(), _$$value);
    return XD_List = a;
  }
  public Drzitel() {}
  public Drzitel(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Drzitel(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"0FCCB2E8708248A360CA91FE9422D1B7".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Drzitel";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#VozidloDN/$mixed/Drzitel";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {
    _$$value=(char) XD_ndx++;
    set$value(parseResult.getParsedValue().stringValue());
  }
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