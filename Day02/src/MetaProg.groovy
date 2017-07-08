Integer.metaClass.daysFromToday = {
	new Date() + delegate	
}
println 15.daysFromToday()
println ((-1).daysFromToday())
println 5.daysFromToday()

List.metaClass.even = {
	delegate.findAll { it % 2 == 0}
}
List.metaClass.average = {
	delegate.sum()/delegate.size()
}
List.metaClass.static.merge = {arg1,arg2 ->
	def output = []
	arg1.each { output << it }
	arg2.each { output << it }
	output
}
def lst = [1,2,3,4,5,6,7]
println lst.even()
println lst.average()

def lst2 = [8,9,10,11]
println List.merge(lst,lst2)

String.metaClass.u = {
	delegate.toUpperCase()
}
str = "hello"
println str.u()

Integer.metaClass.inc = {
	++delegate
}

int i = 10
i = i.inc()
println i