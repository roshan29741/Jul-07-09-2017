package com.acct

import org.grails.datastore.gorm.finders.MethodExpression.Like;

import grails.converters.JSON;

class GormController {

	//WRONG
	String name
	int age
	
	//Scope of a controller
	//Scope of a service
	
	def act1(){
		//render object as JSON
		//render(view:"act2")
		//forward(action:"act2")
		//redirect(action:"act2")
		//redirect(controller:"somecontroller",action:"someaction")
	}
	def act2(){
		
	}
	
    def index() { 
		
	}
	
	def validationExample(){
		def p = new Person(firstName:params.first,
			lastName:params.last,
			age:Integer.parseInt(params.age))
		p.validate()
		
		if(p.hasErrors()){
			p.errors.each {
				println it
			}
			render(view:"index",model:["person":p])
		}
		else
			render "Created"
		
	}
	
	
	
	//find all the persons whose age is greater than 20
	def do1(){
		//def persons = Person.findAllByAgeGreaterThan(20)
		def persons = Person.findAll {
			(age > 20)
		}
		render persons as JSON
	}
	//find all the persons whose age is greater than 20 and firstname starts with A
	def do2(){
		//def persons = Person.findAllByAgeGreaterThanAndFirstNameLike(20,"A%")
		
		def criteria = Person.createCriteria()
		def persons = criteria {
			and {
				gt("age",20)
				like("firstName","A%")
			}
		}
		render persons as JSON
	}
	//find all the persons who have atleast 2 cars
	def do3(){
		def criteria = Person.createCriteria()
		def persons = criteria {
			sizeGt("cars",2)
		}
		render persons as JSON
	}
	//all the persons name startsWith A and age > 20 
	//OR 
	//name startsWith B and age <20
	def do4(){
		def criteria = Person.createCriteria()
		def persons = criteria {
			or{
				and{
					gt("age",20)
					like("firstName","A%")
				}
				and{
					lt("age",20)
					like("firstName","B%")
				}
			}
		}
		render persons as JSON
	}
	
	//http://localhost:8080/Day03Grails/gorm/listPersons
	def listPersons(){
		//List all the persons and render
		def persons = Person.list()
		def output = [:]
		def records = persons.collect { 
			[id:it.id,firstname:it.firstName,lastname:it.lastName,age:it.age] 
		}
		output.persons = records
		render output as JSON
	}
	
	//http://localhost:8080/Day03Grails/gorm/removeCar?carid=1
	def removeCar(){
		//params.carid
		//Car car = Car.get(params.carid)
		Car car = Car.findById(params.carid)
		if(!car){
			println "Car not found"
		}
		else{
			println "Car found"
		}
		car?.delete(flush: true)
		render "Deleted"
		//Get the Car record corresponding to carid and delete the object
		//render the result
	}
	
	
	def createPerson(){
		Person p = new Person(firstName:params.first,
			lastName:params.last,
			age:params.age)
		Car c1 = new Car(model:"BMW",year:2017)
		c1.owner = p
		Car c2 = new Car(model:"Micra",year:2016)
		c2.owner = p
		p.cars = [c1,c2]
		p.save()
		render "Person with id: $p.id created successfully"
	}
	
}

/*
 * ADD CUSTOM MESSAGE 
 * user.errors.reject(
        'user.password.doesnotmatch',
        ['password', 'class User'] as Object[],
        '[Property [{0}] of class [{1}] does not match confirmation]')

    user.errors.rejectValue(
        'password',
        'user.password.doesnotmatch')
 * 
 * 
 * */
