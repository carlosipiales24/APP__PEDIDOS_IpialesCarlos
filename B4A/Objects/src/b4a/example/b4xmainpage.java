package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xmainpage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xmainpage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xmainpage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _root = null;
public anywheresoftware.b4a.objects.B4XViewWrapper.XUI _xui = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _button2 = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _b4xpage_created(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=720897;
 //BA.debugLineNum = 720897;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Root.LoadLayout(\"MainPagePedidos\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("MainPagePedidos",ba);
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="End Sub";
return "";
}
public String  _btnclientes_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnclientes_click", false))
	 {return ((String) Debug.delegate(ba, "btnclientes_click", null));}
b4a.example.addclientepage _pageclientes = null;
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Private Sub btnClientes_Click";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="Dim PageClientes As AddClientePage";
_pageclientes = new b4a.example.addclientepage();
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="PageClientes.Initialize";
_pageclientes._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="B4XPages.AddPageAndCreate(\"clientespage\", PageCli";
_b4xpages._addpageandcreate /*String*/ (ba,"clientespage",(Object)(_pageclientes));
RDebugUtils.currentLine=786437;
 //BA.debugLineNum = 786437;BA.debugLine="B4XPages.ShowPage(\"clientespage\")";
_b4xpages._showpage /*String*/ (ba,"clientespage");
RDebugUtils.currentLine=786438;
 //BA.debugLineNum = 786438;BA.debugLine="End Sub";
return "";
}
public String  _btnpedidos_click(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "btnpedidos_click", false))
	 {return ((String) Debug.delegate(ba, "btnpedidos_click", null));}
b4a.example.addpedidopage _pagepedidos = null;
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Private Sub btnPedidos_Click";
RDebugUtils.currentLine=851969;
 //BA.debugLineNum = 851969;BA.debugLine="Dim PagePedidos As AddPedidoPage";
_pagepedidos = new b4a.example.addpedidopage();
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="PagePedidos.Initialize";
_pagepedidos._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="B4XPages.AddPageAndCreate(\"pedidospage\", PagePedi";
_b4xpages._addpageandcreate /*String*/ (ba,"pedidospage",(Object)(_pagepedidos));
RDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="B4XPages.ShowPage(\"pedidospage\")";
_b4xpages._showpage /*String*/ (ba,"pedidospage");
RDebugUtils.currentLine=851976;
 //BA.debugLineNum = 851976;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xmainpage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xmainpage";
RDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=589825;
 //BA.debugLineNum = 589825;BA.debugLine="Private Root As B4XView";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="Private xui As XUI";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Private Button1 As Button";
_button1 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Private Button2 As Button";
_button2 = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xmainpage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xmainpage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="End Sub";
return "";
}
}