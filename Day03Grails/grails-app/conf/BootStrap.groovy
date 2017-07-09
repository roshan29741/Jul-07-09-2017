import com.acct.Person;

import grails.util.Environment;

class BootStrap {

    def init = { servletContext ->
		switch(Environment.current){
			case Environment.DEVELOPMENT:
			println "Development"
			//initialize database with basic data
			Person p = new Person(firstName:"sam",lastName:"thom",age:12)
			p.save()
			break
			case Environment.TEST:
			println "TEST"
			//initialize database with basic data
			break
			case Environment.PRODUCTION:
			println "production"
			//SEED DATA
			//things like google maps key initialization
			//payment gateway initialization
			//email provider initialization
			break
		}
    }
    def destroy = {
    }
}
