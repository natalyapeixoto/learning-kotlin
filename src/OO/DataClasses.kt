package OO

// the data class has an implicit toString() method, we can override it

data class DataBook(val title: String, val author: String, val publicationYear: Int, var price: Double) {

}

class HistoryBook(val title :String, val author : String, val publicationYear: Int, var price: Double) {

    override fun toString() : String {
        return "title=$title, author=$author, publicationYear=$publicationYear, price=$price"
    }
}

fun main(args: Array<String>) {
    val book = DataBook("Wonder Woman", "GiGI", 2009, 20.00)
    val book2 =  DataBook("Wonder Woman", "GiGI", 2009, 20.00)
    val copyBook = book.copy(price = 100.00)
    
    val (title, author, year, price) = book
    val set = hashSetOf(book, book2)
    println(set)
    println(author)
    println(copyBook)
    println(book)

    val historyBook = HistoryBook("superman", "jonas malta", 1300, 80.00)
    val historyBook2 = HistoryBook("superman", "jonas malta", 1300, 80.00)
    println(historyBook.toString())


    println(book.equals(book2))

    println(historyBook.equals(historyBook2))
}