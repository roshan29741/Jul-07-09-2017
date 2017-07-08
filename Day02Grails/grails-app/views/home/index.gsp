<html>
	<body>
		<form method="POST" action="/Day02Grails/home/dosomething">
			<input type="text" placeholder="Word" name="word">
			<g:hasErrors>
    				<g:eachError><p><g:message error="${it}"/></p></g:eachError>
			</g:hasErrors>
			<br/>
			<button type="submit">Submit</button>
		</form>
		<h1>${flash.biriyani}</h1>
	</body>
</html>