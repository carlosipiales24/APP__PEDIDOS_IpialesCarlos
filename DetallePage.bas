B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private lblNombre As B4XView
	Private lstPedidos As B4XView
	Private btnAddPedido As B4XView
	Private ClienteID As Int
	Private API_URL As String = "https://api.example.com" ' URL de tu API
End Sub

'You can add more parameters here.
Public Sub Initialize As Object
	Return Me
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	'load the layout to Root
	Root.LoadLayout("DetallePage")
End Sub

Public Sub LoadCliente(id As Int)
	ClienteID = id
    
	Dim job As HttpJob
	job.Initialize("LoadCliente", Me)
	job.Download(API_URL & $"/clientes/${ClienteID}"$)
End Sub

Sub JobDone (job As HttpJob)
	If job.Success Then
		Select Case job.JobName
			Case "LoadCliente"
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim cliente As Map = parser.NextObject
				lblNombre.Text = cliente.Get("Nombre")
				LoadPedidos
			Case "LoadPedidos"
				Dim parser As JSONParser
				parser.Initialize(job.GetString)
				Dim pedidos As List = parser.NextArray
				lstPedidos.Clear
				For Each pedido As Map In pedidos
					lstPedidos.AddTextItem(pedido.Get("Fecha") & " - " & pedido.Get("Monto"), pedido.Get("PedidoID"))
				Next
			Case "AddPedido"
				LoadPedidos
			Case "DeletePedido"
				LoadPedidos
		End Select
	Else
		Log("Error: " & job.ErrorMessage)
	End If
	job.Release
End Sub

Private Sub LoadPedidos
	Dim job As HttpJob
	job.Initialize("LoadPedidos", Me)
	job.Download(API_URL & $"/clientes/${ClienteID}/pedidos"$)
End Sub

Private Sub btnAddPedido_Click
	B4XPages.ShowPage("AddPedidoPage")
	B4XPages.GetPage("AddPedidoPage").SetClienteID(ClienteID)
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.