//Anonymous inner classes
def print = { println("Hello World") }
print()
println (print.class.name)

def eat = { items -> println("Eating $items") }
eat("Biriyani")
println (eat.class.name)

def add = { a,b -> println a+b }
add(1,3)
add(5,6)