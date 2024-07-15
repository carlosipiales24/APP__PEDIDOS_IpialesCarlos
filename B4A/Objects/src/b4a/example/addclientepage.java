package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class addclientepage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.addclientepage");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.addclientepage.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtid = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtapellido = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdireccion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttelefono = null;
public b4a.example.clientes _apicliente = null;
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public Object  _initialize(b4a.example.addclientepage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((Object) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Public Sub Initialize As Object";
RDebugUtils.currentLine=983041;
 //BA.debugLineNum = 983041;BA.debugLine="Return Me";
if (true) return this;
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="End Sub";
return null;
}
public String  _b4xpage_created(b4a.example.addclientepage __ref,anywheresoftware.b4a.objects.B4XViewWrapper _root1) throws Exception{
__ref = this;
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "b4xpage_created", false))
	 {return ((String) Debug.delegate(ba, "b4xpage_created", new Object[] {_root1}));}
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Private Sub B4XPage_Created (Root1 As B4XView)";
RDebugUtils.currentLine=1048577;
 //BA.debugLineNum = 1048577;BA.debugLine="Root = Root1";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/  = _root1;
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Root.LoadLayout(\"clientespage\")";
__ref._root /*anywheresoftware.b4a.objects.B4XViewWrapper*/ .LoadLayout("clientespage",ba);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="apiCliente.Initialize(\"https://appwebutn2.azurewe";
__ref._apicliente /*b4a.example.clientes*/ ._initialize /*String*/ (null,ba,"https://appwebutn2.azurewebsites.net/api/Clientes");
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="End Sub";
return "";
}
public void  _btnactualizar_click(b4a.example.addclientepage __ref) throws Exception{
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "btnactualizar_click", false))
	 {Debug.delegate(ba, "btnactualizar_click", null); return;}
ResumableSub_btnActualizar_Click rsub = new ResumableSub_btnActualizar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnActualizar_Click extends BA.ResumableSub {
public ResumableSub_btnActualizar_Click(b4a.example.addclientepage parent,b4a.example.addclientepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.addclientepage __ref;
b4a.example.addclientepage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addclientepage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Wait For (apiCliente.Update(txtId.Text, txtNombre";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "addclientepage", "btnactualizar_click"), __ref._apicliente /*b4a.example.clientes*/ ._update /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText())),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtapellido /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtdireccion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txttelefono /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="Msgbox(\"Registro Actualizado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Actualizado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btnbuscar_click(b4a.example.addclientepage __ref) throws Exception{
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "btnbuscar_click", false))
	 {Debug.delegate(ba, "btnbuscar_click", null); return;}
ResumableSub_btnBuscar_Click rsub = new ResumableSub_btnBuscar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnBuscar_Click extends BA.ResumableSub {
public ResumableSub_btnBuscar_Click(b4a.example.addclientepage parent,b4a.example.addclientepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.addclientepage __ref;
b4a.example.addclientepage parent;
b4a.example.cliente _r = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addclientepage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Wait For (apiCliente.Read_ById(txtId.Text)) Compl";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "addclientepage", "btnbuscar_click"), __ref._apicliente /*b4a.example.clientes*/ ._read_byid /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (b4a.example.cliente) result[1];
;
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="If r.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="txtId.Text = r.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._id /*int*/ ));
RDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="txtNombre.Text = r.Nombre";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._nombre /*String*/ ));
RDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="txtApellido.Text = r.Apellido";
__ref._txtapellido /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._apellido /*String*/ ));
RDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="txtDireccion.Text = r.Direccion";
__ref._txtdireccion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._direccion /*String*/ ));
RDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="txtTelefono.Text = r.Telefono";
__ref._txttelefono /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_r._telefono /*String*/ ));
RDebugUtils.currentLine=1179656;
 //BA.debugLineNum = 1179656;BA.debugLine="Msgbox(\"Registro Encontrado con éxito\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Encontrado con éxito"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1179658;
 //BA.debugLineNum = 1179658;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1179661;
 //BA.debugLineNum = 1179661;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btncrear_click(b4a.example.addclientepage __ref) throws Exception{
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "btncrear_click", false))
	 {Debug.delegate(ba, "btncrear_click", null); return;}
ResumableSub_btnCrear_Click rsub = new ResumableSub_btnCrear_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnCrear_Click extends BA.ResumableSub {
public ResumableSub_btnCrear_Click(b4a.example.addclientepage parent,b4a.example.addclientepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.addclientepage __ref;
b4a.example.addclientepage parent;
b4a.example.cliente _c = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addclientepage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Wait For (apiCliente.Create(0, txtNombre.Text, tx";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "addclientepage", "btncrear_click"), __ref._apicliente /*b4a.example.clientes*/ ._create /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int) (0),__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtapellido /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txtdireccion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText(),__ref._txttelefono /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_c = (b4a.example.cliente) result[1];
;
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If c.Id > 0 Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_c._id /*int*/ >0) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="txtId.Text = c.Id";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(_c._id /*int*/ ));
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="Msgbox(\"Registro Creado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Creado"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="Msgbox(\"No se pudo crear el registro\",\"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No se pudo crear el registro"),BA.ObjectToCharSequence("OK"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public void  _btneliminar_click(b4a.example.addclientepage __ref) throws Exception{
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "btneliminar_click", false))
	 {Debug.delegate(ba, "btneliminar_click", null); return;}
ResumableSub_btnEliminar_Click rsub = new ResumableSub_btnEliminar_Click(this,__ref);
rsub.resume(ba, null);
}
public static class ResumableSub_btnEliminar_Click extends BA.ResumableSub {
public ResumableSub_btnEliminar_Click(b4a.example.addclientepage parent,b4a.example.addclientepage __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.addclientepage __ref;
b4a.example.addclientepage parent;
boolean _r = false;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="addclientepage";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1310721;
 //BA.debugLineNum = 1310721;BA.debugLine="Wait For (apiCliente.Delete(txtId.Text)) Complete";
parent.__c.WaitFor("complete", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "addclientepage", "btneliminar_click"), __ref._apicliente /*b4a.example.clientes*/ ._delete /*anywheresoftware.b4a.keywords.Common.ResumableSubWrapper*/ (null,(int)(Double.parseDouble(__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .getText()))));
this.state = 7;
return;
case 7:
//C
this.state = 1;
_r = (Boolean) result[1];
;
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="If r = True Then";
if (true) break;

case 1:
//if
this.state = 6;
if (_r==parent.__c.True) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="Msgbox(\"Registro Eliminado\", \"OK\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("Registro Eliminado"),BA.ObjectToCharSequence("OK"),ba);
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="txtId.Text = \"\"";
__ref._txtid /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="txtNombre.Text = \"\"";
__ref._txtnombre /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="txtApellido.Text = \"\"";
__ref._txtapellido /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="txtDireccion.Text = \"\"";
__ref._txtdireccion /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310728;
 //BA.debugLineNum = 1310728;BA.debugLine="txtTelefono.Text = \"\"";
__ref._txttelefono /*anywheresoftware.b4a.objects.EditTextWrapper*/ .setText(BA.ObjectToCharSequence(""));
 if (true) break;

case 5:
//C
this.state = 6;
RDebugUtils.currentLine=1310730;
 //BA.debugLineNum = 1310730;BA.debugLine="Msgbox(\"No hay datos\",\"Error\")";
parent.__c.Msgbox(BA.ObjectToCharSequence("No hay datos"),BA.ObjectToCharSequence("Error"),ba);
 if (true) break;

case 6:
//C
this.state = -1;
;
RDebugUtils.currentLine=1310732;
 //BA.debugLineNum = 1310732;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _btnmenu_click(b4a.example.addclientepage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addclientepage";
if (Debug.shouldDelegate(ba, "btnmenu_click", false))
	 {return ((String) Debug.delegate(ba, "btnmenu_click", null));}
RDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Private Sub btnMenu_Click";
RDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="B4XPages.ShowPage(\"MainPagePedidos\")";
_b4xpages._showpage /*String*/ (ba,"MainPagePedidos");
RDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.addclientepage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="addclientepage";
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Private txtId As EditText";
_txtid = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="Private txtNombre As EditText";
_txtnombre = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Private txtApellido As EditText";
_txtapellido = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Private txtDireccion As EditText";
_txtdireccion = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Private txtTelefono As EditText";
_txttelefono = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="Private apiCliente As Clientes";
_apicliente = new b4a.example.clientes();
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="End Sub";
return "";
}
}