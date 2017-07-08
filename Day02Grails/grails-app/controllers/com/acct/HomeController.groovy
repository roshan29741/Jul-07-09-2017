package com.acct

class HomeController {
	
	//PalindromeService object will be created and injected
	PalindromeService palindromeService
	
    def index() { 
		
	}
	def dosomething(){
		String word = params.word
		String message = "$word is not a palindrome"
		if (palindromeService.check(word))
			message = "$word is a palindrome"
		render message
	}
}
