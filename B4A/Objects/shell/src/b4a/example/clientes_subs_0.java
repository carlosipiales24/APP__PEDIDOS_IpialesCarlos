package b4a.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class clientes_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private Root As B4XView 'ignore";
clientes._root = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");__ref.setField("_root",clientes._root);
 //BA.debugLineNum = 3;BA.debugLine="Private xui As XUI 'ignore";
clientes._xui = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper.XUI");__ref.setField("_xui",clientes._xui);
 //BA.debugLineNum = 4;BA.debugLine="Private jsonParser As JSONParser";
clientes._jsonparser = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");__ref.setField("_jsonparser",clientes._jsonparser);
 //BA.debugLineNum = 5;BA.debugLine="Private apiJob As HttpJob";
clientes._apijob = RemoteObject.createNew ("b4a.example.httpjob");__ref.setField("_apijob",clientes._apijob);
 //BA.debugLineNum = 6;BA.debugLine="Public apiURL As String";
clientes._apiurl = RemoteObject.createImmutable("");__ref.setField("_apiurl",clientes._apiurl);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _create(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _telefono) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("create")) { return __ref.runUserSub(false, "clientes","create", __ref, _id, _nombre, _apellido, _direccion, _telefono);}
ResumableSub_Create rsub = new ResumableSub_Create(null,__ref,_id,_nombre,_apellido,_direccion,_telefono);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._telefono = _telefono;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _apellido;
RemoteObject _direccion;
RemoteObject _telefono;
RemoteObject _cliente = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Create (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,15);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("apellido", _apellido);
Debug.locals.put("direccion", _direccion);
Debug.locals.put("telefono", _telefono);
 BA.debugLineNum = 16;BA.debugLine="Dim cliente As Cliente";
Debug.ShouldStop(32768);
_cliente = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cliente", _cliente);
 BA.debugLineNum = 17;BA.debugLine="Dim json As String";
Debug.ShouldStop(65536);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 18;BA.debugLine="Dim data As Map";
Debug.ShouldStop(131072);
_data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("data", _data);
 BA.debugLineNum = 20;BA.debugLine="cliente.Initialize()";
Debug.ShouldStop(524288);
_cliente.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 21;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ap";
Debug.ShouldStop(1048576);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(", \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\", \"apellido\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_apellido))),RemoteObject.createImmutable("\", \"direccion\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_direccion))),RemoteObject.createImmutable("\", \"telefono\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_telefono))),RemoteObject.createImmutable("\"}")));Debug.locals.put("json", _json);
 BA.debugLineNum = 23;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 24;BA.debugLine="apiJob.PostString(apiURL, json)";
Debug.ShouldStop(8388608);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )),(Object)(_json));
 BA.debugLineNum = 25;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(16777216);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 26;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(33554432);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "create"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 27;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(67108864);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 28;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="data = jsonParser.NextObject";
Debug.ShouldStop(268435456);
_data = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("data", _data);
 BA.debugLineNum = 30;BA.debugLine="cliente.Id = data.Get(\"id\")";
Debug.ShouldStop(536870912);
_cliente.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 31;BA.debugLine="cliente.Nombre = data.Get(\"nombre\")";
Debug.ShouldStop(1073741824);
_cliente.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 32;BA.debugLine="cliente.Apellido = data.Get(\"apellido\")";
Debug.ShouldStop(-2147483648);
_cliente.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 33;BA.debugLine="cliente.Direccion = data.Get(\"direccion\")";
Debug.ShouldStop(1);
_cliente.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 34;BA.debugLine="cliente.Telefono = data.Get(\"telefono\")";
Debug.ShouldStop(2);
_cliente.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_data.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 36;BA.debugLine="Return cliente";
Debug.ShouldStop(8);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_cliente));return;};
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
public static void  _jobdone(RemoteObject __ref,RemoteObject _resultado) throws Exception{
}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "clientes","delete", __ref, _id);}
ResumableSub_Delete rsub = new ResumableSub_Delete(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Delete (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,104);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 106;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(512);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 107;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_delete" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 109;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(4096);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "delete"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 110;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(8192);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "clientes","initialize", __ref, _ba, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("url", _url);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(url As String)";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="apiURL = url";
Debug.ShouldStop(1024);
__ref.setField ("_apiurl" /*RemoteObject*/ ,_url);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read_all(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Read_All (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("read_all")) { return __ref.runUserSub(false, "clientes","read_all", __ref);}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(null,__ref);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.clientes parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _c1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _c2 = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_All (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,39);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 40;BA.debugLine="Dim c1 As List";
Debug.ShouldStop(128);
_c1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("c1", _c1);
 BA.debugLineNum = 41;BA.debugLine="Dim c2 As Cliente";
Debug.ShouldStop(256);
_c2 = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 42;BA.debugLine="Dim map As Map";
Debug.ShouldStop(512);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 43;BA.debugLine="Dim lista As List";
Debug.ShouldStop(1024);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 45;BA.debugLine="c1.Initialize";
Debug.ShouldStop(4096);
_c1.runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="c2.Initialize";
Debug.ShouldStop(8192);
_c2.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 48;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(32768);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 49;BA.debugLine="apiJob.Download(apiURL)";
Debug.ShouldStop(65536);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_apiurl" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
Debug.ShouldStop(131072);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "read_all"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 51;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(262144);
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 52;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(524288);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="lista = jsonParser.NextArray";
Debug.ShouldStop(1048576);
_lista = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextArray");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 54;BA.debugLine="For i = 0 To lista.Size - 1";
Debug.ShouldStop(2097152);
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = RemoteObject.solve(new RemoteObject[] {_lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 10;
if (true) break;

case 10:
//C
this.state = 7;
if ((step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13)) this.state = 6;
if (true) break;

case 11:
//C
this.state = 10;
_i = ((int)(0 + _i + step13)) ;
Debug.locals.put("i", _i);
if (true) break;

case 6:
//C
this.state = 11;
 BA.debugLineNum = 55;BA.debugLine="map = lista.Get(i)";
Debug.ShouldStop(4194304);
_map = RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 56;BA.debugLine="Dim c2 As Cliente";
Debug.ShouldStop(8388608);
_c2 = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("c2", _c2);
 BA.debugLineNum = 57;BA.debugLine="c2.Initialize";
Debug.ShouldStop(16777216);
_c2.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 58;BA.debugLine="c2.Id = map.Get(\"id\")";
Debug.ShouldStop(33554432);
_c2.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 59;BA.debugLine="c2.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(67108864);
_c2.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 60;BA.debugLine="c2.Apellido = map.Get(\"apellido\")";
Debug.ShouldStop(134217728);
_c2.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 61;BA.debugLine="c2.Direccion = map.Get(\"direccion\")";
Debug.ShouldStop(268435456);
_c2.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 62;BA.debugLine="c2.Telefono = map.Get(\"telefono\")";
Debug.ShouldStop(536870912);
_c2.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 BA.debugLineNum = 63;BA.debugLine="c1.Add(c2)";
Debug.ShouldStop(1073741824);
_c1.runVoidMethod ("Add",(Object)((_c2)));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
Debug.locals.put("i", _i);
;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 67;BA.debugLine="Return c1";
Debug.ShouldStop(4);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_c1));return;};
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
public static RemoteObject  _read_byid(RemoteObject __ref,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("read_byid")) { return __ref.runUserSub(false, "clientes","read_byid", __ref, _id);}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(null,__ref,_id);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _cliente = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Read_ById (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,70);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
 BA.debugLineNum = 71;BA.debugLine="Dim cliente As Cliente";
Debug.ShouldStop(64);
_cliente = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cliente", _cliente);
 BA.debugLineNum = 72;BA.debugLine="cliente.Initialize";
Debug.ShouldStop(128);
_cliente.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 74;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(512);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 75;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
Debug.ShouldStop(1024);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_download" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)));
 BA.debugLineNum = 76;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(2048);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "read_byid"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 77;BA.debugLine="If resultado.Success Then";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado.getField(true,"_success" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 78;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
Debug.ShouldStop(8192);
__ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)(_resultado.runClassMethod (b4a.example.httpjob.class, "_getstring" /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="Dim map As Map = jsonParser.NextObject";
Debug.ShouldStop(16384);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map = __ref.getField(false,"_jsonparser" /*RemoteObject*/ ).runMethod(false,"NextObject");Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 80;BA.debugLine="cliente.Id = map.Get(\"id\")";
Debug.ShouldStop(32768);
_cliente.setField ("_id" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("id"))))));
 BA.debugLineNum = 81;BA.debugLine="cliente.Nombre = map.Get(\"nombre\")";
Debug.ShouldStop(65536);
_cliente.setField ("_nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombre"))))));
 BA.debugLineNum = 82;BA.debugLine="cliente.Apellido = map.Get(\"apellido\")";
Debug.ShouldStop(131072);
_cliente.setField ("_apellido" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("apellido"))))));
 BA.debugLineNum = 83;BA.debugLine="cliente.Direccion = map.Get(\"direccion\")";
Debug.ShouldStop(262144);
_cliente.setField ("_direccion" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("direccion"))))));
 BA.debugLineNum = 84;BA.debugLine="cliente.Telefono = map.Get(\"telefono\")";
Debug.ShouldStop(524288);
_cliente.setField ("_telefono" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("telefono"))))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 86;BA.debugLine="Return cliente";
Debug.ShouldStop(2097152);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_cliente));return;};
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _telefono) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "clientes","update", __ref, _id, _nombre, _apellido, _direccion, _telefono);}
ResumableSub_Update rsub = new ResumableSub_Update(null,__ref,_id,_nombre,_apellido,_direccion,_telefono);
rsub.remoteResumableSub = anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSubForFilter();
rsub.resume(null, null);
return RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.keywords.Common.ResumableSubWrapper"), rsub.remoteResumableSub);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,RemoteObject __ref,RemoteObject _id,RemoteObject _nombre,RemoteObject _apellido,RemoteObject _direccion,RemoteObject _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._telefono = _telefono;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4a.example.clientes parent;
RemoteObject _id;
RemoteObject _nombre;
RemoteObject _apellido;
RemoteObject _direccion;
RemoteObject _telefono;
RemoteObject _cliente = RemoteObject.declareNull("b4a.example.cliente");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _resultado = RemoteObject.declareNull("b4a.example.httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Update (clientes) ","clientes",4,__ref.getField(false, "ba"),__ref,89);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,RemoteObject.createImmutable(null));return;}
case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("id", _id);
Debug.locals.put("nombre", _nombre);
Debug.locals.put("apellido", _apellido);
Debug.locals.put("direccion", _direccion);
Debug.locals.put("telefono", _telefono);
 BA.debugLineNum = 90;BA.debugLine="Dim cliente As Cliente";
Debug.ShouldStop(33554432);
_cliente = RemoteObject.createNew ("b4a.example.cliente");Debug.locals.put("cliente", _cliente);
 BA.debugLineNum = 91;BA.debugLine="Dim json As String";
Debug.ShouldStop(67108864);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 93;BA.debugLine="cliente.Initialize()";
Debug.ShouldStop(268435456);
_cliente.runClassMethod (b4a.example.cliente.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 94;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ap";
Debug.ShouldStop(536870912);
_json = (RemoteObject.concat(RemoteObject.createImmutable("{\"id\": "),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_id))),RemoteObject.createImmutable(", \"nombre\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nombre))),RemoteObject.createImmutable("\", \"apellido\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_apellido))),RemoteObject.createImmutable("\", \"direccion\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_direccion))),RemoteObject.createImmutable("\", \"telefono\": \""),parent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_telefono))),RemoteObject.createImmutable("\"}")));Debug.locals.put("json", _json);
 BA.debugLineNum = 96;BA.debugLine="apiJob.Initialize(\"\", Me)";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(__ref));
 BA.debugLineNum = 97;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
Debug.ShouldStop(1);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_putstring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_apiurl" /*RemoteObject*/ ),RemoteObject.createImmutable("/"),_id)),(Object)(_json));
 BA.debugLineNum = 98;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
Debug.ShouldStop(2);
__ref.getField(false,"_apijob" /*RemoteObject*/ ).runClassMethod (b4a.example.httpjob.class, "_getrequest" /*RemoteObject*/ ).runVoidMethod ("SetContentType",(Object)(RemoteObject.createImmutable("application/json")));
 BA.debugLineNum = 100;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
Debug.ShouldStop(8);
parent.__c.runVoidMethod ("WaitFor","jobdone", __ref.getField(false, "ba"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "clientes", "update"), (__ref.getField(false,"_apijob" /*RemoteObject*/ )));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (RemoteObject) result.getArrayElement(false,RemoteObject.createImmutable(1));Debug.locals.put("resultado", _resultado);
;
 BA.debugLineNum = 101;BA.debugLine="Return resultado.Success";
Debug.ShouldStop(16);
if (true) {
parent.__c.runVoidMethod ("ReturnFromResumableSub",this.remoteResumableSub,(_resultado.getField(true,"_success" /*RemoteObject*/ )));return;};
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
}