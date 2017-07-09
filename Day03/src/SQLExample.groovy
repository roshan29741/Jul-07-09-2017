import groovy.sql.Sql;

@Grapes([
	@Grab("mysql:mysql-connector-java:5.1.25"),
	@Grab("log4j:log4j:1.2.17")
])
@GrabConfig(systemClassLoader = true)

sql = Sql.newInstance("jdbc:mysql://localhost/training", 
				"root",
				"durasoft","com.mysql.jdbc.Driver")

sql.eachRow("select * from persons") {
	println "$it.personid $it.fname $it.lname $it.age"	
}