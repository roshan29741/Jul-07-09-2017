<html>
	<head>
		<meta name="layout" content="main"/>
		
	</head>
	<body>
<g:form action="validationExample" method="POST">
	First Name<g:textField name="first"/><br/>
	Last Name<g:textField name="last"/><br/>
	Age<g:textField name="age"/><br/>
	<g:submitButton name="Create" value="Create person"/>
	<g:hasErrors bean="${person}">
		<g:renderErrors/>
	</g:hasErrors>
</g:form>
	
	</body>
</html>
