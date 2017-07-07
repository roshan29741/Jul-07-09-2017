acc = new Account(balance:1000)
acc.deposit(200)
6.times { acc.withdraw(100) }
acc.printStatement()
println "Balance: $acc.balance"