class Person{
	//member variables
	String name
	int age
	
	def eat(items){
		int localVar = 10
		println name + " is eating " + items
		return;
	}
	def work(hours){
		name + " is working " + hours + " hours"
	}
	
	/*
	public void eat(String items){
		System.out.println(name + " is eating " + items)
	}
	*/
}