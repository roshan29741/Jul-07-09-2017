class Person {
	String name
	int age
	def dynamicProps = [:]
	
	def printProps(){
		dynamicProps.each {
			println "$it.key : $it.value"
		}
	}
	def propertyMissing(String propertyName,value){
		dynamicProps[propertyName] = value
		println "$propertyName is not available"
	}
	
//	def propertyMissing(String propertyName,value){
//		println "$propertyName is not available"
//	}
	def methodMissing(String methodName,args){
		println "$methodName is not available"
		println "Are you looking to sleep?"
	}
	
	def	eat(){
		"Eating"
	}
}
