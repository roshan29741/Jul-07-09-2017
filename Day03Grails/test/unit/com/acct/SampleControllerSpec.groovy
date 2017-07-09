package com.acct

import grails.test.mixin.TestFor
import spock.lang.Specification


@TestFor(SampleController)
@Mock(Person)
class SampleControllerSpec extends Specification {

	void "test create person"(){
		when:
			controller.create()
		then:
			response.text == "saved"	
	}
	void "test save"(){
		when:
			controller.save()
		then:
			response.redirectedUrl == "/home/index"	
	}
	
	void "test bye"(){
		when:
			controller.params.name = "Sam"
			controller.bye()
		then	:
			response.text == "Bye Sam"
	}
    void "test hello"() {
		when:
			controller.hello()
		then:
			response.text == "Hi"	
    }
}
