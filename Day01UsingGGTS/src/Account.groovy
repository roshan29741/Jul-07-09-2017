class Account {
	double balance
	int withdrawCount;
	def transactions = [] //Object transactions = []
	
	def deposit(amount){ //public Object deposit(...){
		balance += amount
		transactions << new Transaction(amount:amount,type:"Deposit",date:new Date())
	}
	
	def withdraw(amount){
		withdrawCount++
		balance -= amount
		transactions << new Transaction(amount:amount,type:"Withdraw",date:new Date())
		if(withdrawCount > 3){
			balance -= 2
			transactions << new Transaction(amount:2,type:"Fees",date:new Date())
		}
	}
	
	def printStatement(){
		transactions.each {
			println "$it.type : $it.amount ($it.date)"
		}
	}
}
