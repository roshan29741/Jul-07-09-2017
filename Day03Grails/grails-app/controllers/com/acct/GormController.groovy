package com.acct

class GormController {

    def index() { 
		
	}
	def createPerson(){
		Person p = new Person(firstName:params.first,
			lastName:params.last,
			age:params.age)
		p.save()
		render "Person with id: $p.id created successfully"
	}
	
}
