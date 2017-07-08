package com.lab01

class GuessingGame {
	int target = (int)(Math.random()*100)
	int attempts
	String message
	boolean gameOver
	
	def	play(guess){
		attempts++
		if(guess > target)
			message = "Aim Lower"
		else if(guess < target)
			message = "Aim Higher"
		else{
			message = "You've got it in $attempts attempts"
			gameOver = true
		}
	}
}
