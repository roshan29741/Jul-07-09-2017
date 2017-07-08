package com.lab01

class GameController {
	GameService gameService
	
    def index() {
		if(!session.game){
			GuessingGame game = new GuessingGame()
			session.game = game
			println game.target
		}
	}
	def play(){
		GuessingGame game = session.game
		gameService.play(game, Integer.parseInt(params.guess))
		if(game.gameOver){
			flash.disabled = "disabled"
			session.game = null
		}
		flash.attempts = "Attempts: $game.attempts"
		flash.message = game.message
		forward(action:"index")
	}
}
