package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class clientes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.clientes");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.clientes.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.JSONParser _jsonparser = null;
public b4a.example.httpjob _apijob = null;
public String _apiurl = "";
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _initialize(b4a.example.clientes __ref,anywheresoftware.b4a.BA _ba,String _url) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_url}));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Public Sub Initialize(url As String)";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="apiURL = url";
__ref._apiurl /*String*/  = _url;
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _update(b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _telefono) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "update", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "update", new Object[] {_id,_nombre,_apellido,_direccion,_telefono}));}
ResumableSub_Update rsub = new ResumableSub_Update(this,__ref,_id,_nombre,_apellido,_direccion,_telefono);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Update extends BA.ResumableSub {
public ResumableSub_Update(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._telefono = _telefono;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _apellido;
String _direccion;
String _telefono;
b4a.example.cliente _cliente = null;
String _json = "";
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim cliente As Cliente";
_cliente = new b4a.example.cliente();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="cliente.Initialize()";
_cliente._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ap";
_json = ("{\"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+", \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\", \"apellido\": \""+parent.__c.SmartStringFormatter("",(Object)(_apellido))+"\", \"direccion\": \""+parent.__c.SmartStringFormatter("",(Object)(_direccion))+"\", \"telefono\": \""+parent.__c.SmartStringFormatter("",(Object)(_telefono))+"\"}");
RDebugUtils.currentLine=1966087;
 //BA.debugLineNum = 1966087;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="apiJob.PutString(apiURL & \"/\" & id, json)";
__ref._apijob /*b4a.example.httpjob*/ ._putstring /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id),_json);
RDebugUtils.currentLine=1966089;
 //BA.debugLineNum = 1966089;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1966091;
 //BA.debugLineNum = 1966091;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "update"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=1966093;
 //BA.debugLineNum = 1966093;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_byid(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "read_byid", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_byid", new Object[] {_id}));}
ResumableSub_Read_ById rsub = new ResumableSub_Read_ById(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_ById extends BA.ResumableSub {
public ResumableSub_Read_ById(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.cliente _cliente = null;
b4a.example.httpjob _resultado = null;
anywheresoftware.b4a.objects.collections.Map _map = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim cliente As Cliente";
_cliente = new b4a.example.cliente();
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="cliente.Initialize";
_cliente._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="apiJob.Download(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "read_byid"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="Dim map As Map = jsonParser.NextObject";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="cliente.Id = map.Get(\"id\")";
_cliente._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="cliente.Nombre = map.Get(\"nombre\")";
_cliente._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=1900556;
 //BA.debugLineNum = 1900556;BA.debugLine="cliente.Apellido = map.Get(\"apellido\")";
_cliente._apellido /*String*/  = BA.ObjectToString(_map.Get((Object)("apellido")));
RDebugUtils.currentLine=1900557;
 //BA.debugLineNum = 1900557;BA.debugLine="cliente.Direccion = map.Get(\"direccion\")";
_cliente._direccion /*String*/  = BA.ObjectToString(_map.Get((Object)("direccion")));
RDebugUtils.currentLine=1900558;
 //BA.debugLineNum = 1900558;BA.debugLine="cliente.Telefono = map.Get(\"telefono\")";
_cliente._telefono /*String*/  = BA.ObjectToString(_map.Get((Object)("telefono")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1900560;
 //BA.debugLineNum = 1900560;BA.debugLine="Return cliente";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_cliente));return;};
RDebugUtils.currentLine=1900561;
 //BA.debugLineNum = 1900561;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _create(b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _telefono) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "create", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "create", new Object[] {_id,_nombre,_apellido,_direccion,_telefono}));}
ResumableSub_Create rsub = new ResumableSub_Create(this,__ref,_id,_nombre,_apellido,_direccion,_telefono);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Create extends BA.ResumableSub {
public ResumableSub_Create(b4a.example.clientes parent,b4a.example.clientes __ref,int _id,String _nombre,String _apellido,String _direccion,String _telefono) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this._nombre = _nombre;
this._apellido = _apellido;
this._direccion = _direccion;
this._telefono = _telefono;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
String _nombre;
String _apellido;
String _direccion;
String _telefono;
b4a.example.cliente _cliente = null;
String _json = "";
anywheresoftware.b4a.objects.collections.Map _data = null;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="Dim cliente As Cliente";
_cliente = new b4a.example.cliente();
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="cliente.Initialize()";
_cliente._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="json = $\"{\"id\": ${id}, \"nombre\": \"${nombre}\", \"ap";
_json = ("{\"id\": "+parent.__c.SmartStringFormatter("",(Object)(_id))+", \"nombre\": \""+parent.__c.SmartStringFormatter("",(Object)(_nombre))+"\", \"apellido\": \""+parent.__c.SmartStringFormatter("",(Object)(_apellido))+"\", \"direccion\": \""+parent.__c.SmartStringFormatter("",(Object)(_direccion))+"\", \"telefono\": \""+parent.__c.SmartStringFormatter("",(Object)(_telefono))+"\"}");
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="apiJob.PostString(apiURL, json)";
__ref._apijob /*b4a.example.httpjob*/ ._poststring /*String*/ (null,__ref._apiurl /*String*/ ,_json);
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="apiJob.GetRequest.SetContentType(\"application/jso";
__ref._apijob /*b4a.example.httpjob*/ ._getrequest /*anywheresoftware.b4h.okhttp.OkHttpClientWrapper.OkHttpRequest*/ (null).SetContentType("application/json");
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "create"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 5;
return;
case 5:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 4;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="data = jsonParser.NextObject";
_data = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextObject();
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="cliente.Id = data.Get(\"id\")";
_cliente._id /*int*/  = (int)(BA.ObjectToNumber(_data.Get((Object)("id"))));
RDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="cliente.Nombre = data.Get(\"nombre\")";
_cliente._nombre /*String*/  = BA.ObjectToString(_data.Get((Object)("nombre")));
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="cliente.Apellido = data.Get(\"apellido\")";
_cliente._apellido /*String*/  = BA.ObjectToString(_data.Get((Object)("apellido")));
RDebugUtils.currentLine=1769490;
 //BA.debugLineNum = 1769490;BA.debugLine="cliente.Direccion = data.Get(\"direccion\")";
_cliente._direccion /*String*/  = BA.ObjectToString(_data.Get((Object)("direccion")));
RDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="cliente.Telefono = data.Get(\"telefono\")";
_cliente._telefono /*String*/  = BA.ObjectToString(_data.Get((Object)("telefono")));
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="Return cliente";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_cliente));return;};
RDebugUtils.currentLine=1769494;
 //BA.debugLineNum = 1769494;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _delete(b4a.example.clientes __ref,int _id) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "delete", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "delete", new Object[] {_id}));}
ResumableSub_Delete rsub = new ResumableSub_Delete(this,__ref,_id);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Delete extends BA.ResumableSub {
public ResumableSub_Delete(b4a.example.clientes parent,b4a.example.clientes __ref,int _id) {
this.parent = parent;
this.__ref = __ref;
this._id = _id;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
int _id;
b4a.example.httpjob _resultado = null;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = -1;
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="apiJob.Delete(apiURL & \"/\" & id)";
__ref._apijob /*b4a.example.httpjob*/ ._delete /*String*/ (null,__ref._apiurl /*String*/ +"/"+BA.NumberToString(_id));
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="Wait For(apiJob) jobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "delete"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 1;
return;
case 1:
//C
this.state = -1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="Return resultado.Success";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_resultado._success /*boolean*/ ));return;};
RDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public String  _class_globals(b4a.example.clientes __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="clientes";
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Private Root As B4XView 'ignore";
_root = new anywheresoftware.b4a.objects.B4XViewWrapper();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Private xui As XUI 'ignore";
_xui = new anywheresoftware.b4a.objects.B4XViewWrapper.XUI();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="Private jsonParser As JSONParser";
_jsonparser = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Private apiJob As HttpJob";
_apijob = new b4a.example.httpjob();
RDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Public apiURL As String";
_apiurl = "";
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.keywords.Common.ResumableSubWrapper  _read_all(b4a.example.clientes __ref) throws Exception{
RDebugUtils.currentModule="clientes";
if (Debug.shouldDelegate(ba, "read_all", false))
	 {return ((anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) Debug.delegate(ba, "read_all", null));}
ResumableSub_Read_All rsub = new ResumableSub_Read_All(this,__ref);
rsub.resume(ba, null);
return (anywheresoftware.b4a.keywords.Common.ResumableSubWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.keywords.Common.ResumableSubWrapper(), rsub);
}
public static class ResumableSub_Read_All extends BA.ResumableSub {
public ResumableSub_Read_All(b4a.example.clientes parent,b4a.example.clientes __ref) {
this.parent = parent;
this.__ref = __ref;
this.__ref = parent;
}
b4a.example.clientes __ref;
b4a.example.clientes parent;
anywheresoftware.b4a.objects.collections.List _c1 = null;
b4a.example.cliente _c2 = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _lista = null;
b4a.example.httpjob _resultado = null;
int _i = 0;
int step13;
int limit13;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="clientes";

    while (true) {
        switch (state) {
            case -1:
{
parent.__c.ReturnFromResumableSub(this,null);return;}
case 0:
//C
this.state = 1;
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Dim c1 As List";
_c1 = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim c2 As Cliente";
_c2 = new b4a.example.cliente();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="c1.Initialize";
_c1.Initialize();
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="c2.Initialize";
_c2._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="apiJob.Initialize(\"\", Me)";
__ref._apijob /*b4a.example.httpjob*/ ._initialize /*String*/ (null,ba,"",parent);
RDebugUtils.currentLine=1835018;
 //BA.debugLineNum = 1835018;BA.debugLine="apiJob.Download(apiURL)";
__ref._apijob /*b4a.example.httpjob*/ ._download /*String*/ (null,__ref._apiurl /*String*/ );
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="Wait For(apiJob) JobDone(resultado As HttpJob)";
parent.__c.WaitFor("jobdone", ba, new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "clientes", "read_all"), (Object)(__ref._apijob /*b4a.example.httpjob*/ ));
this.state = 9;
return;
case 9:
//C
this.state = 1;
_resultado = (b4a.example.httpjob) result[1];
;
RDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="If resultado.Success Then";
if (true) break;

case 1:
//if
this.state = 8;
if (_resultado._success /*boolean*/ ) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="jsonParser.Initialize(resultado.GetString)";
__ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .Initialize(_resultado._getstring /*String*/ (null));
RDebugUtils.currentLine=1835022;
 //BA.debugLineNum = 1835022;BA.debugLine="lista = jsonParser.NextArray";
_lista = __ref._jsonparser /*anywheresoftware.b4a.objects.collections.JSONParser*/ .NextArray();
RDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="For i = 0 To lista.Size - 1";
if (true) break;

case 4:
//for
this.state = 7;
step13 = 1;
limit13 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
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
if (true) break;

case 6:
//C
this.state = 11;
RDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="map = lista.Get(i)";
_map = (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (java.util.Map)(_lista.Get(_i)));
RDebugUtils.currentLine=1835025;
 //BA.debugLineNum = 1835025;BA.debugLine="Dim c2 As Cliente";
_c2 = new b4a.example.cliente();
RDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="c2.Initialize";
_c2._initialize /*Object*/ (null,ba);
RDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="c2.Id = map.Get(\"id\")";
_c2._id /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("id"))));
RDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="c2.Nombre = map.Get(\"nombre\")";
_c2._nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("nombre")));
RDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="c2.Apellido = map.Get(\"apellido\")";
_c2._apellido /*String*/  = BA.ObjectToString(_map.Get((Object)("apellido")));
RDebugUtils.currentLine=1835030;
 //BA.debugLineNum = 1835030;BA.debugLine="c2.Direccion = map.Get(\"direccion\")";
_c2._direccion /*String*/  = BA.ObjectToString(_map.Get((Object)("direccion")));
RDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="c2.Telefono = map.Get(\"telefono\")";
_c2._telefono /*String*/  = BA.ObjectToString(_map.Get((Object)("telefono")));
RDebugUtils.currentLine=1835032;
 //BA.debugLineNum = 1835032;BA.debugLine="c1.Add(c2)";
_c1.Add((Object)(_c2));
 if (true) break;
if (true) break;

case 7:
//C
this.state = 8;
;
 if (true) break;

case 8:
//C
this.state = -1;
;
RDebugUtils.currentLine=1835036;
 //BA.debugLineNum = 1835036;BA.debugLine="Return c1";
if (true) {
parent.__c.ReturnFromResumableSub(this,(Object)(_c1));return;};
RDebugUtils.currentLine=1835037;
 //BA.debugLineNum = 1835037;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
}