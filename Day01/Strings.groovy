//String interpolation
//${} or $
name = "Ram"
age = 12
message1 = "$name is a nice guy, aged $age years"
message2 = "${name} is a nice guy"
println message1
println message1.class.name
println message2.class.name


str1 = "Hello there"
println str1.class.name

str2 = 'Hello!!! WTH is going on?'
println str2
println str2.class.name

//.equals is not really required to compare 2 strings
if(str1 == str2)
	println "Cool"
else
	println "Not equal"

str3 = '''
	This is a multiline string.
	Understand???
'''
println str3.class.name
println str3