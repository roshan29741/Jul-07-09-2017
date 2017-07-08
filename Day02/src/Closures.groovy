def product = {x,y -> x*y}
println product(2,1)
println product(2,2)
println product(2,3)

def table2 = product.curry(2)
println table2(1)
println table2(2)
println table2(3)
println table2(4)

def anotherProduct = {x=2,y-> x * y}
println anotherProduct(3)
println anotherProduct(3)
println anotherProduct(4)