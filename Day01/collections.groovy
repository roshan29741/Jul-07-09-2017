// No Generics support
// Use as keyword to specify type of collection you want
// it is the keyword and shortcut for "item" while looping
// << and += are just methods in the collection classes

//"hello".to_u //RUBY
//12.to_s//Ruby

"hello".toUpperCase()

langs = ["Scala":"Functional","Groovy":"Dynamic"]
langs.each { println it.key + ": " + it.value}


capitals = [:] as Hashtable
capitals += ["India":"New Delhi"]
capitals += ["France":"Paris"]
capitals += ["Italy":"Rome"]
capitals -= ["India":"New Delhi"]//capitals.remove("France")

capitals.each { println it.key + ": " + it.value}
println capitals.getClass().name


/*
Map<String,String> capitals = new HashMap<String,String>();
capitals.put("India","New Delhi");
capitals.put("Spain","Madrid");
capitals.put("France","Paris");
Iterator<String> keys = capitals.keySet().iterator();
while(keys.hasNext()){
	String key = keys.next();
	System.out.println(key + " : " + capitals.get(key))
}
*/



numbers = [1,2,3,4,false, new Person()] as Vector //as Set
println numbers.class.name
numbers.each{ println it.hashCode()}

countries = []
countries << "India"
countries << "USA"
countries << "UK" //countries.<<("UK")
countries += "Spain" //countries.+=("Spain")

countries.each{
	String firstChar = it.substring(0,1)
	println firstChar
}

countries.each { println it }
println countries.class.name

cities = ["Hyd","Pune","Chennai"]
println cities.class.name
println	cities.size

/*
ArrayList<String> countries = new ArrayList<String>();
countries.add("India");
countries.add("USA");
countries.add("UK");
for(int i=0;i<countries.size();i++){
	System.out.println(countries.get(i)) 
}
*/