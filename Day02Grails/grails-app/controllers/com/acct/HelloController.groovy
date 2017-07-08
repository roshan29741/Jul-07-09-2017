package com.acct

//http://server:port/AppName/<controllername>/<actionmethodname>
//Look for <actionmethodname>.gsp in views/<controllernamefolder>
class HelloController {

	def contact(){
		
	}
	//Default Action method
    def index() { 
		render "Hello World"
	}
	
	def weekend(){
		render "Today is saturday and I am in office"
	}
}
