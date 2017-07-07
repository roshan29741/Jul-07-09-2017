myCollectionUtil = new MyCollectionUtil()

//Print the maximum of all the numbers
int max = -1
myCollectionUtil.compute { x ->
	if(x > max)
		max = x
}
println("Max is $max")

//Print all even numbers
myCollectionUtil.compute { x -> 
	if(x % 2 == 0)
		println x
}
println()

//Print all numbers greater than any number "x"
myCollectionUtil.compute { x ->
	if(x > 100)
		println x
}
println()
myCollectionUtil.compute { x ->
	if(x > 25)
		println x
}
