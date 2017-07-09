/*
Pizza {
	size large
	quantity 5
	toppings Mushroom
	address {
		city "Bangalore"
		street "24, Richmond Circle"
	}
	name "Joe"
}
*/

def number
def is = {arg -> number = arg}

Integer.metaClass.even = {
	println delegate % 2 == 0
}
Integer.metaClass.odd = {
	println delegate % 2 != 0
}

//buy "Bucket" from "KFC"
is 5 even() //is(5).even()
is 10 odd()//is(10).odd()

def wish = {arg ->
	println "Good Evening $arg"
}
wish "Sam" //wish("Sam")
wish "Ram"
wish "John"

def add = { x,y -> println x+y }
def subtract = { x,y -> println x-y }
def multiply = { x,y -> println x*y }
def calculate = { block -> block() }

calculate {
	add 1,2
	subtract 2,3
	multiply 4,5
}
