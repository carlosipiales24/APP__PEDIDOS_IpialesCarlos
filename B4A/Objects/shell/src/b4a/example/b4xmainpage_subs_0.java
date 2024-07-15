package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4xmainpage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "b4xmainpage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 22;BA.debugLine="Root.LoadLayout(\"MainPagePedidos\")";
Debug.ShouldStop(2097152);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("MainPagePedidos")),__ref.getField(false, "ba"));
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnclientes_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnClientes_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("btnclientes_click")) { return __ref.runUserSub(false, "b4xmainpage","btnclientes_click", __ref);}
RemoteObject _pageclientes = RemoteObject.declareNull("b4a.example.addclientepage");
 BA.debugLineNum = 29;BA.debugLine="Private Sub btnClientes_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 30;BA.debugLine="Dim PageClientes As AddClientePage";
Debug.ShouldStop(536870912);
_pageclientes = RemoteObject.createNew ("b4a.example.addclientepage");Debug.locals.put("PageClientes", _pageclientes);
 BA.debugLineNum = 31;BA.debugLine="PageClientes.Initialize";
Debug.ShouldStop(1073741824);
_pageclientes.runClassMethod (b4a.example.addclientepage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 32;BA.debugLine="B4XPages.AddPageAndCreate(\"clientespage\", PageCli";
Debug.ShouldStop(-2147483648);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("clientespage")),(Object)((_pageclientes)));
 BA.debugLineNum = 34;BA.debugLine="B4XPages.ShowPage(\"clientespage\")";
Debug.ShouldStop(2);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("clientespage")));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnpedidos_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnPedidos_Click (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("btnpedidos_click")) { return __ref.runUserSub(false, "b4xmainpage","btnpedidos_click", __ref);}
RemoteObject _pagepedidos = RemoteObject.declareNull("b4a.example.addpedidopage");
 BA.debugLineNum = 37;BA.debugLine="Private Sub btnPedidos_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="Dim PagePedidos As AddPedidoPage";
Debug.ShouldStop(32);
_pagepedidos = RemoteObject.createNew ("b4a.example.addpedidopage");Debug.locals.put("PagePedidos", _pagepedidos);
 BA.debugLineNum = 39;BA.debugLine="PagePedidos.Initialize";
Debug.ShouldStop(64);
_pagepedidos.runClassMethod (b4a.example.addpedidopage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 41;BA.debugLine="B4XPages.AddPageAndCreate(\"pedidospage\", PagePedi";
Debug.ShouldStop(256);
b4xmainpage._b4xpages.runVoidMethod ("_addpageandcreate" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("pedidospage")),(Object)((_pagepedidos)));
 BA.debugLineNum = 43;BA.debugLine="B4XPages.ShowPage(\"pedidospage\")";
Debug.ShouldStop(1024);
b4xmainpage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("pedidospage")));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 8;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Private Root As B4XView";
b4xmainpage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",b4xmainpage._root);
 //BA.debugLineNum = 10;BA.debugLine="Private xui As XUI";
b4xmainpage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",b4xmainpage._xui);
 //BA.debugLineNum = 11;BA.debugLine="Private Button1 As Button";
b4xmainpage._button1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button1",b4xmainpage._button1);
 //BA.debugLineNum = 12;BA.debugLine="Private Button2 As Button";
b4xmainpage._button2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");__ref.setField("_button2",b4xmainpage._button2);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xmainpage) ","b4xmainpage",1,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xmainpage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}