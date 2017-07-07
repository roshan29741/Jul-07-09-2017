println "Welcome to the Guessing Game. Enter a number between 1 and 100"
game = new Game()
sc = new Scanner(System.in)
while(!game.gameOver){
	int guess = sc.nextInt()
	game.play(guess)
	println game.message
}