B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private btnAddCliente As B4XView
	Private lstClientes As B4XView
	Private API_CLIENTES As String = "https://appwebutn2.azurewebsites.net/api/Clientes"
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("MainPage")
	LoadClientes
	
End Sub

Private Sub LoadClientes
	Dim job As HttpJob
	job.Initialize("LoadClientes", Me)
	job.Download(API_CLIENTES)
End Sub

Sub JobDone (job As HttpJob)
	If job.Success Then
		Select Case job.JobName
			Case "LoadClientes"
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim clientes As List = parser.NextArray
				lstClientes.Clear
				For Each cliente As Map In clientes
					lstClientes.AddTextItem(cliente.Get("Nombre"), cliente.Get("ClienteID"))
				Next
			Case "AddCliente"
				LoadClientes
			Case "DeleteCliente"
				LoadClientes
		End Select
	Else
		Log("Error: " & job.ErrorMessage)
	End If
	job.Release
End Sub

Private Sub btnAddCliente_Click
	B4XPages.ShowPage("AddClientePage")
End Sub

Private Sub lstClientes_ItemClick (Index As Int, Value As Object)
	Dim ClienteID As Int = Value
	B4XPages.ShowPage("DetallePage")
	B4XPages.GetPage("DetallePage").LoadCliente(ClienteID)
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.