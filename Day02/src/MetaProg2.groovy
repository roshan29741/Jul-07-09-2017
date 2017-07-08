Car.metaClass.invokeMethod = {methodName,args ->
	println "***Before calling $methodName***"
	def actualMethod = Car.metaClass.getMetaMethod(methodName, args)
	if(actualMethod)
		actualMethod.invoke(delegate, args)
	else {
		if(methodName == "what")
			println "Model of the car is $delegate.model"
		else	 if(methodName == "who")
			println "Owner of the car is $delegate.owner"
		else
			println "${methodName}() is not available"
	}
}
c1 = new Car(model:"BMW",owner:"Sam")
c1.start()
c1.drive()
c1.applyBrakes()
c1.what()
c1.updateInsurance()
c1.ramIntoAnotherCar()
c1.sell()
c1.who()
