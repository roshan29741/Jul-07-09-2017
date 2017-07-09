package com.acct

class Person {
	int id //by default primary key	
	String firstName
	String lastName
	int age
	
    static constraints = {
    }
	
	static mapping = {
		table "persons"
		version false
		id column:"personid"
		firstName column: "fname"
		lastName column: "lname"
	}
}
