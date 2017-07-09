def books = '''
	<Catalog>
		<Book isbn="231213">
			<Title>Ajax hacks</Title>
			<Price>234</Price>
		</Book>
		<Book isbn="98798">
			<Title>Programming Groovy</Title>
			<Price>200</Price>
		</Book>
		<Book isbn="dsf897897">
			<Title>Programming Scala</Title>
			<Price>399</Price>
		</Book>
	</Catalog>
'''
def xml = new XmlParser().parseText(books)
xml.children().each {
	def title = it.Title.text()
	def isbn = it.@isbn 
	def price = it.Price.text()
	println "$title(isbn: $isbn)->$price"
}