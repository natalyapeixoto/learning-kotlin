import OO.Color
import java.awt.List

interface Lendable {

    fun borrow() :String
}

open class InventoryItem() :Lendable  {

    private var borrowed: Boolean = false

    override fun borrow(): String {
        if (borrowed) {
            return "this item is already borrowed"
        }
        borrowed = true
        return "the item is now borrowed"
    }
}

class DVD(val color: Color, val genre: String, val title: String, val publicationYear: Int, val duration: Double):InventoryItem() {
    override fun toString(): String {
        return "$color, $genre, $title"
    }
}

class Book(val genre: String, val title: String, val publicationYear: Int, val author: String):InventoryItem() {

}

fun main(args: Array<String>) {

    val dvd1 = DVD(Color.GREEN, "Adventure", "Batman",  2100, 2.30)
    val dvd2 = DVD(Color.GREEN, "aventura", "Batman", 2010,  2.10)
    val dvd3 = DVD(Color.GREEN, "comedia", "Batman", 2010,  2.10)
    val dvd4 = DVD(Color.GREEN,"drama", "Batman", 2010,  2.10)

    val book1 = Book("Aventura", "Harry Potter", 2000, "J.K. Rowlling")
    val book2 = Book("Aventura", "Harry Potter", 2000, "J.K. Rowlling")
    val book3 = Book("Aventura", "Harry Potter", 2000, "J.K. Rowlling")
    val book4 = Book("Aventura", "Harry Potter", 2000, "J.K. Rowlling")
    val book5 = Book("Aventura", "Harry Potter", 2000, "J.K. Rowlling")


    println(dvd1.toString())
    println(book1.borrow())
    println(book1.borrow())

}