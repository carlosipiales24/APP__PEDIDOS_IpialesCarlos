package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class addclientepage_subs_0 {


public static RemoteObject  _b4xpage_created(RemoteObject __ref,RemoteObject _root1) throws Exception{
try {
		Debug.PushSubsStack("B4XPage_Created (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("b4xpage_created")) { return __ref.runUserSub(false, "addclientepage","b4xpage_created", __ref, _root1);}
Debug.locals.put("Root1", _root1);
 BA.debugLineNum = 20;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="Root = Root1";
Debug.ShouldStop(1048576);
__ref.setField ("_root" /*RemoteObject*/ ,_root1);
 BA.debugLineNum = 23;BA.debugLine="Root.LoadLayout(\"clientespage\")";
Debug.ShouldStop(4194304);
__ref.getField(false,"_root" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout",(Object)(RemoteObject.createImmutable("clientespage")),__ref.getField(false, "ba"));
 BA.debugLineNum = 24;BA.debugLine="apiCliente.Initialize(\"https://appwebutn2.azurewe";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apicliente" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("https://appwebutn2.azurewebsites.net/api/Clientes")));
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnactualizar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("btnactualizar_click")) { __ref.runUserSub(false, "addclientepage","btnactualizar_click", __ref); return;}
ResumableSub_btnActualizar_Click rsub = new ResumableSub_btnActualizar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnActualizar_Click extends BA.ResumableSub {
public ResumableSub_btnActualizar_Click(b4a.example.addclientepage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.addclientepage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnActualizar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,55);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 56;BA.debugLine="Wait For (apiCliente.Update(txtId.Text, txtNombre";
Debug.ShouldStop(8388608);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "addclientepage", "btnactualizar_click"), __ref.getField(false,"_apicliente" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_update" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText"))),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 57;BA.debugLine="If r = True Then";
Debug.ShouldStop(16777216);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 58;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Actualizado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 60;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(134217728);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _complete(RemoteObject __ref,RemoteObject _r) throws Exception{
}
public static void  _btnbuscar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("btnbuscar_click")) { __ref.runUserSub(false, "addclientepage","btnbuscar_click", __ref); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.addclientepage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.addclientepage parent;
RemoteObject _r = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBuscar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,40);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 41;BA.debugLine="Wait For (apiCliente.Read_ById(txtId.Text)) Compl";
Debug.ShouldStop(256);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "addclientepage", "btnbuscar_click"), __ref.getField(false,"_apicliente" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_read_byid" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 42;BA.debugLine="If r.Id > 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_r.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 43;BA.debugLine="txtId.Text = r.Id";
Debug.ShouldStop(1024);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="txtNombre.Text = r.Nombre";
Debug.ShouldStop(2048);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_nombre" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="txtApellido.Text = r.Apellido";
Debug.ShouldStop(4096);
__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_apellido" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="txtDireccion.Text = r.Direccion";
Debug.ShouldStop(8192);
__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_direccion" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="txtTelefono.Text = r.Telefono";
Debug.ShouldStop(16384);
__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_r.getField(true,"_telefono" /*RemoteObject*/ )));
 BA.debugLineNum = 48;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
Debug.ShouldStop(32768);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Encontrado con éxito")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 50;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(131072);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btncrear_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCrear_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("btncrear_click")) { __ref.runUserSub(false, "addclientepage","btncrear_click", __ref); return;}
ResumableSub_btnCrear_Click rsub = new ResumableSub_btnCrear_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnCrear_Click extends BA.ResumableSub {
public ResumableSub_btnCrear_Click(b4a.example.addclientepage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.addclientepage parent;
RemoteObject _c = RemoteObject.declareNull("b4a.example.cliente");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnCrear_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,30);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 31;BA.debugLine="Wait For (apiCliente.Create(0, txtNombre.Text, tx";
Debug.ShouldStop(1073741824);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "addclientepage", "btncrear_click"), __ref.getField(false,"_apicliente" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_create" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethod(true,"getText")),(Object)(__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethod(true,"getText"))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("c", _c);
;
 BA.debugLineNum = 32;BA.debugLine="If c.Id > 0 Then";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean(">",_c.getField(true,"_id" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 33;BA.debugLine="txtId.Text = c.Id";
Debug.ShouldStop(1);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_c.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 34;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
Debug.ShouldStop(2);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Creado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 36;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"OK\")";
Debug.ShouldStop(8);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se pudo crear el registro")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btneliminar_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("btneliminar_click")) { __ref.runUserSub(false, "addclientepage","btneliminar_click", __ref); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.addclientepage parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.addclientepage parent;
RemoteObject _r = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnEliminar_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,64);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 65;BA.debugLine="Wait For (apiCliente.Delete(txtId.Text)) Complete";
Debug.ShouldStop(1);
parent.__c.runVoidMethod ("WaitFor","complete", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "addclientepage", "btneliminar_click"), __ref.getField(false,"_apicliente" /*RemoteObject*/ ).runClassMethod (b4a.example.clientes.class, "_delete" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, __ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethod(true,"getText")))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("r", _r);
;
 BA.debugLineNum = 66;BA.debugLine="If r = True Then";
Debug.ShouldStop(2);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",_r,parent.__c.getField(true,"True"))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
Debug.ShouldStop(4);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Registro Eliminado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("OK"))),__ref.getField(false, "ba"));
 BA.debugLineNum = 68;BA.debugLine="txtId.Text = \"\"";
Debug.ShouldStop(8);
__ref.getField(false,"_txtid" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 69;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(16);
__ref.getField(false,"_txtnombre" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 70;BA.debugLine="txtApellido.Text = \"\"";
Debug.ShouldStop(32);
__ref.getField(false,"_txtapellido" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 71;BA.debugLine="txtDireccion.Text = \"\"";
Debug.ShouldStop(64);
__ref.getField(false,"_txtdireccion" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 72;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(128);
__ref.getField(false,"_txttelefono" /*RemoteObject*/ ).runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 74;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
Debug.ShouldStop(512);
parent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay datos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),__ref.getField(false, "ba"));
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btnmenu_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnMenu_Click (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("btnmenu_click")) { return __ref.runUserSub(false, "addclientepage","btnmenu_click", __ref);}
 BA.debugLineNum = 78;BA.debugLine="Private Sub btnMenu_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 79;BA.debugLine="B4XPages.ShowPage(\"MainPagePedidos\")";
Debug.ShouldStop(16384);
addclientepage._b4xpages.runVoidMethod ("_showpage" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("MainPagePedidos")));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
addclientepage._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",addclientepage._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
addclientepage._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",addclientepage._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private txtId As EditText";
addclientepage._txtid = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtid",addclientepage._txtid);
 //BA.debugLineNum = 5;BA.debugLine="Private txtNombre As EditText";
addclientepage._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtnombre",addclientepage._txtnombre);
 //BA.debugLineNum = 6;BA.debugLine="Private txtApellido As EditText";
addclientepage._txtapellido = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtapellido",addclientepage._txtapellido);
 //BA.debugLineNum = 7;BA.debugLine="Private txtDireccion As EditText";
addclientepage._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txtdireccion",addclientepage._txtdireccion);
 //BA.debugLineNum = 8;BA.debugLine="Private txtTelefono As EditText";
addclientepage._txttelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");__ref.setField("_txttelefono",addclientepage._txttelefono);
 //BA.debugLineNum = 9;BA.debugLine="Private apiCliente As Clientes";
addclientepage._apicliente = RemoteObject.createNew ("b4a.example.clientes");__ref.setField("_apicliente",addclientepage._apicliente);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (addclientepage) ","addclientepage",2,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "addclientepage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.ShouldStop(32768);
if (true) return __ref;
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}