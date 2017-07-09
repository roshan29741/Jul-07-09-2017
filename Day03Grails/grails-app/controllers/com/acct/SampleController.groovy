package com.acct

class SampleController {

    def index() { 
		
	}
	def create(){
		Person p = new Person(firstName:"sdsa",lastName:"kjdsfh",age:12)
		p.save()
		render "saved"
	}
	def save(){
		redirect(controller:"home",action:"index")
	}
	def bye(){
		String name = params.name
		render "Bye $name"
	}
	def hello(){
		render "Hi"
	}
}
