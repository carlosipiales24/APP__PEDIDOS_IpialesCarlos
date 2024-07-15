B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=9.85
@EndOfDesignText@
#Region Shared Files
#CustomBuildAction: folders ready, %WINDIR%\System32\Robocopy.exe,"..\..\Shared Files" "..\Files"
'Ctrl + click to sync files: ide://run?file=%WINDIR%\System32\Robocopy.exe&args=..\..\Shared+Files&args=..\Files&FilesSync=True
#End Region

'Ctrl + click to export as zip: ide://run?File=%B4X%\Zipper.jar&Args=Project.zip

Sub Class_Globals
	Private Root As B4XView
	Private xui As XUI
	Private Button1 As Button
	Private Button2 As Button
End Sub

Public Sub Initialize
'	B4XPages.GetManager.LogEvents = True
End Sub

'This event will be called once, before the page becomes visible.
Private Sub B4XPage_Created (Root1 As B4XView)
	Root = Root1
	Root.LoadLayout("MainPagePedidos")
End Sub

'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.



Private Sub btnClientes_Click
	Dim PageClientes As AddClientePage
	PageClientes.Initialize
	B4XPages.AddPageAndCreate("clientespage", PageClientes)
	
	B4XPages.ShowPage("clientespage")
End Sub

Private Sub btnPedidos_Click
	Dim PagePedidos As AddPedidoPage
	PagePedidos.Initialize
	
	B4XPages.AddPageAndCreate("pedidospage", PagePedidos)
	
	B4XPages.ShowPage("pedidospage")
	
End Sub