lst = [10,56,34,90,876,2,445,78,92,3,77,22]

//Print the list of all even numbers
lst.findAll {it % 2 == 0} .each { println it }

println()
//Print the list of all odd numbers
lst.findAll {it % 2 != 0} .each { println it }

println()
//Print the squares of all even numbers
lst.findAll {it % 2 == 0} .each { println it*it }

println()
//Print the sum of all numbers
println lst.inject(0) {total,item -> total + item }

println()
//Print the sum of the squares of all odd numbers
println(lst.findAll {it % 2 != 0} .collect {it*it} .inject(0) {total,item -> total + item }) 