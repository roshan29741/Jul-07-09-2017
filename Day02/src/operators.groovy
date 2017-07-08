//No need to use == or != for null check

//safe navigation operator ?

person = null
person?.car?.engine?.power = 1000

/*
if(person != null){
	if(person.car != null){
		if(person.car.engine != null){
			person.car.engine.power = 1000
		}
	}
}
*/

person?.eat() //if(person != null){ person.eat() }

//ERROR
//person.eat()


p1 = new Person()

if(p1){ //if(p1 == null)
	
}

if(!p1){ //if(p1 !=null)
	
}