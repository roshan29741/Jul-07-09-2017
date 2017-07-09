package com.acct

class Person {
	int id //by default primary key	
	String firstName
	String lastName
	int age
	
	static hasMany = [cars: Car]
	
    static constraints = {
		firstName nullable:false, size: 5..15
		lastName nullable:true
    }
	
	static mapping = {
		table "persons"
		version false
		id column:"personid"
		firstName column: "fname"
		lastName column: "lname"
	}
}
