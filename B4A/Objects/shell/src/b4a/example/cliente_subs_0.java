package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class cliente_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
cliente._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",cliente._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
cliente._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",cliente._xui);
 //BA.debugLineNum = 4;BA.debugLine="Public Id As Int";
cliente._id = RemoteObject.createImmutable(0);__ref.setField("_id",cliente._id);
 //BA.debugLineNum = 5;BA.debugLine="Public Nombre As String";
cliente._nombre = RemoteObject.createImmutable("");__ref.setField("_nombre",cliente._nombre);
 //BA.debugLineNum = 6;BA.debugLine="Public Apellido As String";
cliente._apellido = RemoteObject.createImmutable("");__ref.setField("_apellido",cliente._apellido);
 //BA.debugLineNum = 7;BA.debugLine="Public Direccion As String";
cliente._direccion = RemoteObject.createImmutable("");__ref.setField("_direccion",cliente._direccion);
 //BA.debugLineNum = 8;BA.debugLine="Public Telefono As String";
cliente._telefono = RemoteObject.createImmutable("");__ref.setField("_telefono",cliente._telefono);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (cliente) ","cliente",5,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "cliente","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize As Object";
Debug.ShouldStop(2048);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}