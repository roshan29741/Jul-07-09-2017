//Pass the data as arguments
//Traditional style of coding
calc = new Calculator()
println calc.add(1,2)
println calc.sub(1,2)
println calc.mul(1,2)

//Pass the behaviour as arguments
//Functional style of coding
moderCalc = new ModernCalc(a:10,b:5)
moderCalc.compute {x,y -> 
	//calculate the square of x
	//calculate the square of y
	//Find the square root of x + square root of y
	//Add 1 and 2 with 3
}
moderCalc.compute({x,y -> println x+y})
moderCalc.compute {x,y -> println x-y}
moderCalc.compute {x,y -> println x*y}
moderCalc.compute {x,y -> println x/y}
moderCalc.compute {x,y -> println x*x+y*y+2*x*y}