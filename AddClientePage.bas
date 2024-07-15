B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private txtId As EditText
	Private txtNombre As EditText
	Private txtApellido As EditText
	Private txtDireccion As EditText
	Private txtTelefono As EditText
	Private apiCliente As Clientes
	
	
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("clientespage")
	apiCliente.Initialize("https://appwebutn2.azurewebsites.net/api/Clientes")
End Sub


'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.

Private Sub btnCrear_Click
	Wait For (apiCliente.Create(0, txtNombre.Text, txtApellido.Text, txtDireccion.Text, txtTelefono.Text)) Complete (c As Cliente)
	If c.Id > 0 Then
		txtId.Text = c.Id
		Msgbox("Registro Creado", "OK")
	Else
		Msgbox("No se pudo crear el registro","OK")
	End If
End Sub

Private Sub btnBuscar_Click
	Wait For (apiCliente.Read_ById(txtId.Text)) Complete (r As Cliente)
	If r.Id > 0 Then
		txtId.Text = r.Id
		txtNombre.Text = r.Nombre
		txtApellido.Text = r.Apellido
		txtDireccion.Text = r.Direccion
		txtTelefono.Text = r.Telefono
		Msgbox("Registro Encontrado con éxito", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
	
End Sub

Private Sub btnActualizar_Click
	Wait For (apiCliente.Update(txtId.Text, txtNombre.Text, txtApellido.Text, txtDireccion.Text, txtTelefono.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Actualizado", "OK")
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub btnEliminar_Click
	Wait For (apiCliente.Delete(txtId.Text)) Complete (r As Boolean)
	If r = True Then
		Msgbox("Registro Eliminado", "OK")
		txtId.Text = ""
		txtNombre.Text = ""
		txtApellido.Text = ""
		txtDireccion.Text = ""
		txtTelefono.Text = ""
	Else
		Msgbox("No hay datos","Error")
	End If
End Sub

Private Sub btnMenu_Click
	B4XPages.ShowPage("MainPagePedidos")
End Sub