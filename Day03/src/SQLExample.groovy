import groovy.sql.Sql;

@Grab("mysql:mysql-connector-java:5.1.25")
@GrabConfig(systemClassLoader = true)

sql = Sql.newInstance("jdbc:mysql://localhost/training", 
				"root",
				"durasoft","com.mysql.jdbc.Driver")

sql.eachRow("select * from persons") {
	println "$it.personid $it.fname $it.lname $it.age"	
}