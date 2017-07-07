arr = "hello hi how are you".split(" ")
println arr

cf = 3.4..4.5 //ObjectRange
println cf.class.name

//Doesn't loop to the next item
for(confusion in 3.4 .. 3.7){
	println confusion
}
str = "I am hungry"
println str[0..4]
println str[-1]
println str[-1..-3]

for(al in 'a'..'j'){
	println al
}
i = 1 .. 10 //IntRange
println i.class.name

for(j in 5..10){
	if(j % 2 == 0)
		println j
}