package b4a.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class b4xpagesdelegator extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "b4a.example.b4xpagesdelegator");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", b4a.example.b4xpagesdelegator.class).invoke(this, new Object[] {null});
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
public b4a.example.main _main = null;
public b4a.example.starter _starter = null;
public b4a.example.b4xpages _b4xpages = null;
public b4a.example.b4xcollections _b4xcollections = null;
public b4a.example.httputils2service _httputils2service = null;
public String  _activity_actionbarhomeclick(b4a.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_actionbarhomeclick", true))
	 {return ((String) Debug.delegate(ba, "activity_actionbarhomeclick", null));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub Activity_ActionBarHomeClick";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="B4XPages.GetManager.Activity_ActionBarHomeClick";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._activity_actionbarhomeclick /*String*/ (null);
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="End Sub";
return "";
}
public boolean  _activity_keypress(b4a.example.b4xpagesdelegator __ref,int _keycode) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_keypress", true))
	 {return ((Boolean) Debug.delegate(ba, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Public Sub Activity_KeyPress (KeyCode As Int) As B";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Return B4XPages.GetManager.Activity_KeyPress (Key";
if (true) return _b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._activity_keypress /*boolean*/ (null,_keycode);
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="End Sub";
return false;
}
public String  _activity_pause(b4a.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub Activity_Pause";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="B4XPages.GetManager.Activity_Pause";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._activity_pause /*String*/ (null);
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return "";
}
public String  _activity_permissionresult(b4a.example.b4xpagesdelegator __ref,String _permission,boolean _result) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_permissionresult", true))
	 {return ((String) Debug.delegate(ba, "activity_permissionresult", new Object[] {_permission,_result}));}
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub Activity_PermissionResult (Permission As Strin";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="B4XPages.GetManager.RaiseEvent(B4XPages.GetManage";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._raiseevent /*String*/ (null,_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._gettoppage /*b4a.example.b4xpagesmanager._b4xpageinfo*/ (null),"B4XPage_PermissionResult",new Object[]{(Object)(_permission),(Object)(_result)});
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="End Sub";
return "";
}
public String  _activity_resume(b4a.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "activity_resume", true))
	 {return ((String) Debug.delegate(ba, "activity_resume", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub Activity_Resume";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="B4XPages.GetManager.Activity_Resume";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._activity_resume /*String*/ (null);
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public String  _create_menu(b4a.example.b4xpagesdelegator __ref,Object _menu) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "create_menu", true))
	 {return ((String) Debug.delegate(ba, "create_menu", new Object[] {_menu}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub Create_Menu (Menu As Object)";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="B4XPages.GetManager.CreateMenu(Menu)";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._createmenu /*String*/ (null,_menu);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4a.example.b4xpagesdelegator __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4a.example.b4xpagesdelegator __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="End Sub";
return "";
}
public String  _mainform_resize(b4a.example.b4xpagesdelegator __ref,double _width,double _height) throws Exception{
__ref = this;
RDebugUtils.currentModule="b4xpagesdelegator";
if (Debug.shouldDelegate(ba, "mainform_resize", true))
	 {return ((String) Debug.delegate(ba, "mainform_resize", new Object[] {_width,_height}));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Public Sub MainForm_Resize(Width As Double, Height";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="B4XPages.GetManager.MainForm_Resize(Width, Height";
_b4xpages._getmanager /*b4a.example.b4xpagesmanager*/ (getActivityBA())._mainform_resize /*String*/ (null,_width,_height);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
}