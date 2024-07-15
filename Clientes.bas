B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=12.8
@EndOfDesignText@
Sub Class_Globals
	Private Root As B4XView 'ignore
	Private xui As XUI 'ignore
	Private jsonParser As JSONParser
	Private apiJob As HttpJob
	Public apiURL As String
End Sub

'You can add more parameters here.
Public Sub Initialize(url As String)
	apiURL = url
End Sub

'This event will be called once, before the page becomes visible.
Public Sub Create(id As Int, nombre As String, apellido As String, direccion As String, telefono As String) As ResumableSub
	Dim cliente As Cliente
	Dim json As String
	Dim data As Map
    
	cliente.Initialize()
	json = $"{"id": ${id}, "nombre": "${nombre}", "apellido": "${apellido}", "direccion": "${direccion}", "telefono": "${telefono}"}"$
    
	apiJob.Initialize("", Me)
	apiJob.PostString(apiURL, json)
	apiJob.GetRequest.SetContentType("application/json")
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		data = jsonParser.NextObject
		cliente.Id = data.Get("id")
		cliente.Nombre = data.Get("nombre")
		cliente.Apellido = data.Get("apellido")
		cliente.Direccion = data.Get("direccion")
		cliente.Telefono = data.Get("telefono")
	End If
	Return cliente
End Sub

Public Sub Read_All() As ResumableSub
	Dim c1 As List
	Dim c2 As Cliente
	Dim map As Map
	Dim lista As List
    
	c1.Initialize
	c2.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL)
	Wait For(apiJob) JobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		lista = jsonParser.NextArray
		For i = 0 To lista.Size - 1
			map = lista.Get(i)
			Dim c2 As Cliente
			c2.Initialize
			c2.Id = map.Get("id")
			c2.Nombre = map.Get("nombre")
			c2.Apellido = map.Get("apellido")
			c2.Direccion = map.Get("direccion")
			c2.Telefono = map.Get("telefono")
			c1.Add(c2)
		Next
	End If
    
	Return c1
End Sub

Public Sub Read_ById(id As Int) As ResumableSub
	Dim cliente As Cliente
	cliente.Initialize
    
	apiJob.Initialize("", Me)
	apiJob.Download(apiURL & "/" & id)
	Wait For(apiJob) jobDone(resultado As HttpJob)
	If resultado.Success Then
		jsonParser.Initialize(resultado.GetString)
		Dim map As Map = jsonParser.NextObject
		cliente.Id = map.Get("id")
		cliente.Nombre = map.Get("nombre")
		cliente.Apellido = map.Get("apellido")
		cliente.Direccion = map.Get("direccion")
		cliente.Telefono = map.Get("telefono")
	End If
	Return cliente
End Sub

Public Sub Update(id As Int, nombre As String, apellido As String, direccion As String, telefono As String) As ResumableSub
	Dim cliente As Cliente
	Dim json As String
    
	cliente.Initialize()
	json = $"{"id": ${id}, "nombre": "${nombre}", "apellido": "${apellido}", "direccion": "${direccion}", "telefono": "${telefono}"}"$
    
	apiJob.Initialize("", Me)
	apiJob.PutString(apiURL & "/" & id, json)
	apiJob.GetRequest.SetContentType("application/json")
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub

Public Sub Delete(id As Int) As ResumableSub
    
	apiJob.Initialize("", Me)
	apiJob.Delete(apiURL & "/" & id)
    
	Wait For(apiJob) jobDone(resultado As HttpJob)
	Return resultado.Success
End Sub
'You can see the list of page related events in the B4XPagesManager object. The event name is B4XPage.