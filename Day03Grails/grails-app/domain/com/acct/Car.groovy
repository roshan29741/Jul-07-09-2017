package com.acct

class Car {
	int id
	String model
	int year
	static belongsTo = [owner:Person]
	
	static constraints = {
		owner nullable:true
    }
	
	static mapping = {
		table "cars"
		version false
		id column:"carid"
	}
}
