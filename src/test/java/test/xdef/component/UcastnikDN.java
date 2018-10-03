// This file was generated by cz.syntea.xdef.component.GenXComponent.
// XDPosition: "SouborD1A#UcastnikDN".
// Any modifications to this file will be lost upon recompilation.
package test.xdef.component;
public class UcastnikDN implements cz.syntea.xdef.component.XComponent{
  public String getOznSegmentu() {return _OznSegmentu;}
  public String getTypUcastnika() {return _TypUcastnika;}
  public Integer getPraxeRizeni() {return _PraxeRizeni;}
  public String getAlkoholDech() {return _AlkoholDech;}
  public String getAlkoholKrev() {return _AlkoholKrev;}
  public String getZraneni() {return _Zraneni;}
  public String getZdravPojistovna() {return _ZdravPojistovna;}
  public Integer getPokutaKc() {return _PokutaKc;}
  public String getPokutaZapl() {return _PokutaZapl;}
  public String getPachatel() {return _Pachatel;}
  public String getPoskozeny() {return _Poskozeny;}
  public Z3 getJinaSkoda() {return _JinaSkoda;}
  public Z4 getOsoba() {return _Osoba;}
  public Z5 getFirma() {return _Firma;}
  public java.util.List<Z6> listOfDoklad() {return _Doklad;}
  public UcastnikDN.PoruseniZakProvoz getPoruseniZakProvoz() {return _PoruseniZakProvoz;}
  public UcastnikDN.PoruseniZakPrest getPoruseniZakPrest() {return _PoruseniZakPrest;}
  public UcastnikDN.PoruseniZakTrest getPoruseniZakTrest() {return _PoruseniZakTrest;}
  public UcastnikDN.PoruseniZakOst getPoruseniZakOst() {return _PoruseniZakOst;}
  public UcastnikDN.Vazba getVazba() {return _Vazba;}
  public void setOznSegmentu(String x) {_OznSegmentu = x;}
  public void setTypUcastnika(String x) {_TypUcastnika = x;}
  public void setPraxeRizeni(Integer x) {_PraxeRizeni = x;}
  public void setAlkoholDech(String x) {_AlkoholDech = x;}
  public void setAlkoholKrev(String x) {_AlkoholKrev = x;}
  public void setZraneni(String x) {_Zraneni = x;}
  public void setZdravPojistovna(String x) {_ZdravPojistovna = x;}
  public void setPokutaKc(Integer x) {_PokutaKc = x;}
  public void setPokutaZapl(String x) {_PokutaZapl = x;}
  public void setPachatel(String x) {_Pachatel = x;}
  public void setPoskozeny(String x) {_Poskozeny = x;}
  public void setJinaSkoda(Z3 x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "JinaSkoda", null, "SouborD1A#UcastnikDN/$mixed/JinaSkoda");
    _JinaSkoda = x;
  }
  public void setOsoba(Z4 x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "Osoba", null, "SouborD1A#UcastnikDN/$mixed/Osoba");
    _Osoba = x;
  }
  public void setFirma(Z5 x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "Firma", null, "SouborD1A#UcastnikDN/$mixed/Firma");
    _Firma = x;
  }
  public void addDoklad(Z6 x) {
    if (x != null) {
        if (x.xGetXPos() == null)
          x.xInit(this, "Doklad", null, "SouborD1A#UcastnikDN/$mixed/Doklad");
      _Doklad.add(x);
    }
  }
  public void setPoruseniZakProvoz(UcastnikDN.PoruseniZakProvoz x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakProvoz", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz");
    _PoruseniZakProvoz = x;
  }
  public void setPoruseniZakPrest(UcastnikDN.PoruseniZakPrest x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakPrest", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest");
    _PoruseniZakPrest = x;
  }
  public void setPoruseniZakTrest(UcastnikDN.PoruseniZakTrest x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakTrest", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest");
    _PoruseniZakTrest = x;
  }
  public void setPoruseniZakOst(UcastnikDN.PoruseniZakOst x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "PoruseniZakOst", null, "SouborD1A#UcastnikDN/$mixed/PoruseniZakOst");
    _PoruseniZakOst = x;
  }
  public void setVazba(UcastnikDN.Vazba x) {
    if (x != null && x.xGetXPos() == null)
      x.xInit(this, "Vazba", null, "SouborD1A#UcastnikDN/$mixed/Vazba");
    _Vazba = x;
  }
  public String xposOfOznSegmentu(){return XD_XPos + "/@OznSegmentu";}
  public String xposOfTypUcastnika(){return XD_XPos + "/@TypUcastnika";}
  public String xposOfPraxeRizeni(){return XD_XPos + "/@PraxeRizeni";}
  public String xposOfAlkoholDech(){return XD_XPos + "/@AlkoholDech";}
  public String xposOfAlkoholKrev(){return XD_XPos + "/@AlkoholKrev";}
  public String xposOfZraneni(){return XD_XPos + "/@Zraneni";}
  public String xposOfZdravPojistovna(){return XD_XPos + "/@ZdravPojistovna";}
  public String xposOfPokutaKc(){return XD_XPos + "/@PokutaKc";}
  public String xposOfPokutaZapl(){return XD_XPos + "/@PokutaZapl";}
  public String xposOfPachatel(){return XD_XPos + "/@Pachatel";}
  public String xposOfPoskozeny(){return XD_XPos + "/@Poskozeny";}
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
    if (getOznSegmentu() != null)
      el.setAttribute("OznSegmentu", getOznSegmentu());
    if (getTypUcastnika() != null)
      el.setAttribute("TypUcastnika", getTypUcastnika());
    if (getPraxeRizeni() != null)
      el.setAttribute("PraxeRizeni", String.valueOf(getPraxeRizeni()));
    if (getAlkoholDech() != null)
      el.setAttribute("AlkoholDech", getAlkoholDech());
    if (getAlkoholKrev() != null)
      el.setAttribute("AlkoholKrev", getAlkoholKrev());
    if (getZraneni() != null)
      el.setAttribute("Zraneni", getZraneni());
    if (getZdravPojistovna() != null)
      el.setAttribute("ZdravPojistovna", getZdravPojistovna());
    if (getPokutaKc() != null)
      el.setAttribute("PokutaKc", String.valueOf(getPokutaKc()));
    if (getPokutaZapl() != null)
      el.setAttribute("PokutaZapl", getPokutaZapl());
    if (getPachatel() != null)
      el.setAttribute("Pachatel", getPachatel());
    if (getPoskozeny() != null)
      el.setAttribute("Poskozeny", getPoskozeny());
    for (cz.syntea.xdef.component.XComponent x: XD_List==null?xGetNodeList():XD_List)
      el.appendChild(x.toXml(doc));
    XD_List = null;
    return el;
  }
  @Override
  public java.util.List<cz.syntea.xdef.component.XComponent> xGetNodeList() {
    java.util.ArrayList<cz.syntea.xdef.component.XComponent> a =
      new java.util.ArrayList<cz.syntea.xdef.component.XComponent>();
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getJinaSkoda());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getOsoba());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getFirma());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, listOfDoklad());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getPoruseniZakProvoz());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getPoruseniZakPrest());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getPoruseniZakTrest());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getPoruseniZakOst());
    cz.syntea.xdef.component.XComponentUtil.addXC(a, getVazba());
    return XD_List = a;
  }
  public UcastnikDN() {}
  public UcastnikDN(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public UcastnikDN(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"0B1FF45E0EB6E84AA76C1C1417E84960".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _OznSegmentu;
  private String _TypUcastnika;
  private Integer _PraxeRizeni;
  private String _AlkoholDech;
  private String _AlkoholKrev;
  private String _Zraneni;
  private String _ZdravPojistovna;
  private Integer _PokutaKc;
  private String _PokutaZapl;
  private String _Pachatel;
  private String _Poskozeny;
  private Z3 _JinaSkoda;
  private Z4 _Osoba;
  private Z5 _Firma;
  private final java.util.List<Z6> _Doklad = new java.util.ArrayList<Z6>();
  private UcastnikDN.PoruseniZakProvoz _PoruseniZakProvoz;
  private UcastnikDN.PoruseniZakPrest _PoruseniZakPrest;
  private UcastnikDN.PoruseniZakTrest _PoruseniZakTrest;
  private UcastnikDN.PoruseniZakOst _PoruseniZakOst;
  private UcastnikDN.Vazba _Vazba;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "UcastnikDN";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN";
  @Override
  public void xSetText(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {}
  @Override
  public void xSetAttr(cz.syntea.xdef.proc.XXNode xx,
    cz.syntea.xdef.XDParseResult parseResult) {
    if (xx.getXMNode().getXDPosition().endsWith("/@AlkoholDech"))
      setAlkoholDech(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@AlkoholKrev"))
      setAlkoholKrev(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@OznSegmentu"))
      setOznSegmentu(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@Pachatel"))
      setPachatel(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PokutaKc"))
      setPokutaKc(parseResult.getParsedValue().intValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PokutaZapl"))
      setPokutaZapl(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@Poskozeny"))
      setPoskozeny(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@PraxeRizeni"))
      setPraxeRizeni(parseResult.getParsedValue().intValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@TypUcastnika"))
      setTypUcastnika(parseResult.getParsedValue().stringValue());
    else if (xx.getXMNode().getXDPosition().endsWith("/@ZdravPojistovna"))
      setZdravPojistovna(parseResult.getParsedValue().stringValue());
    else setZraneni(parseResult.getParsedValue().stringValue());
  }
  @Override
  public cz.syntea.xdef.component.XComponent xCreateXChild(cz.syntea.xdef.proc.XXNode xx) {
    String s = xx.getXMElement().getXDPosition();
    if ("SouborD1A#UcastnikDN/$mixed/Doklad".equals(s))
      return new test.xdef.component.Z6(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/Firma".equals(s))
      return new test.xdef.component.Z5(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/JinaSkoda".equals(s))
      return new test.xdef.component.Z3(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/Osoba".equals(s))
      return new test.xdef.component.Z4(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakOst".equals(s))
      return new PoruseniZakOst(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest".equals(s))
      return new PoruseniZakPrest(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz".equals(s))
      return new PoruseniZakProvoz(this, xx);
    if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest".equals(s))
      return new PoruseniZakTrest(this, xx);
    return new Vazba(this, xx); // SouborD1A#UcastnikDN/$mixed/Vazba
  }
  @Override
  public void xAddXChild(cz.syntea.xdef.component.XComponent xc) {
    xc.xSetNodeIndex(XD_ndx++);
    String s = xc.xGetModelPosition();
    if ("SouborD1A#UcastnikDN/$mixed/Doklad".equals(s))
      listOfDoklad().add((test.xdef.component.Z6) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/Firma".equals(s))
      setFirma((test.xdef.component.Z5) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/JinaSkoda".equals(s))
      setJinaSkoda((test.xdef.component.Z3) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/Osoba".equals(s))
      setOsoba((test.xdef.component.Z4) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakOst".equals(s))
      setPoruseniZakOst((PoruseniZakOst) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest".equals(s))
      setPoruseniZakPrest((PoruseniZakPrest) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz".equals(s))
      setPoruseniZakProvoz((PoruseniZakProvoz) xc);
    else if ("SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest".equals(s))
      setPoruseniZakTrest((PoruseniZakTrest) xc);
    else
      setVazba((Vazba) xc); //SouborD1A#UcastnikDN/$mixed/Vazba
  }
  @Override
  public void xSetAny(org.w3c.dom.Element el) {}
// </editor-fold>
public static class PoruseniZakProvoz implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 5;}
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
  public PoruseniZakProvoz() {}
  public PoruseniZakProvoz(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakProvoz(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"4DFC03ACF3E95404A09F28C955B74323".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakProvoz";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakProvoz";
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
public static class PoruseniZakPrest implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 6;}
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
  public PoruseniZakPrest() {}
  public PoruseniZakPrest(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakPrest(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"4DFC03ACF3E95404A09F28C955B74323".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakPrest";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakPrest";
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
public static class PoruseniZakTrest implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 7;}
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
  public PoruseniZakTrest() {}
  public PoruseniZakTrest(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakTrest(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"4DFC03ACF3E95404A09F28C955B74323".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakTrest";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakTrest";
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
public static class PoruseniZakOst implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 8;}
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
  public PoruseniZakOst() {}
  public PoruseniZakOst(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public PoruseniZakOst(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"4DFC03ACF3E95404A09F28C955B74323".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "PoruseniZakOst";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/PoruseniZakOst";
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
public static class Vazba implements cz.syntea.xdef.component.XComponent{
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
  public int xGetModelIndex() {return 9;}
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
  public Vazba() {}
  public Vazba(cz.syntea.xdef.component.XComponent p,
    String name, String ns, String xPos, String XDPos) {
    XD_NodeName=name; XD_NamespaceURI=ns;
    XD_XPos=xPos;
    XD_Model=XDPos;
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
  }
  public Vazba(cz.syntea.xdef.component.XComponent p, cz.syntea.xdef.proc.XXNode xx){
    org.w3c.dom.Element el=xx.getElement();
    XD_NodeName=el.getNodeName(); XD_NamespaceURI=el.getNamespaceURI();
    XD_XPos=xx.getXPos();
    XD_Model=xx.getXMElement().getXDPosition();
    XD_Object = (XD_Parent=p)!=null ? p.xGetObject() : null;
    if (!"4DFC03ACF3E95404A09F28C955B74323".equals(
      xx.getXMElement().getDigest())) { //incompatible element model
      throw new cz.syntea.xdef.sys.SRuntimeException(
        cz.syntea.xdef.msg.XDEF.XDEF374);
    }
  }
  private String _$value;
  private char _$$value= (char) -1;
  private cz.syntea.xdef.component.XComponent XD_Parent;
  private Object XD_Object;
  private String XD_NodeName = "Vazba";
  private String XD_NamespaceURI;
  private int XD_Index = -1;
  private int XD_ndx;
  private String XD_XPos;
  private java.util.List<cz.syntea.xdef.component.XComponent> XD_List;
  private String XD_Model="SouborD1A#UcastnikDN/$mixed/Vazba";
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