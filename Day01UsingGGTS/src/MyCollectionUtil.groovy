class MyCollectionUtil {
	def lst = [1,3,14,66,79,134,23,89,11]

	def compute(block){
		lst.each{
			block(it)
		}
	}
}

