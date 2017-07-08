<html>
	<body>
		<h1>Welcome to the guessing game.</h1>
		<form action="/Day02Grails/game/play">
			<input type="text" placeholder="Enter your guess" name="guess"/>
			<br/>
			<button type="submit" ${flash.disabled}>Play</button>
		</form>
		<h2>${flash.message}</h2>
		<h3>${flash.attempts}</h3>
	</body>
</html>