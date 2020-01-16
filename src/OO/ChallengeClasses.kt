package OO


class Book(val title: String, val author:String, val publication: Int, var borrowed: Boolean) {
    fun borrow() {
        if (borrowed) {
            println("Sorry. This book is already borrowed")
        } else {
            borrowed = true
            println("Tomae o livro")
        }

    }

    fun returnBook () {
        if(!borrowed) {
            println("mas o livro nao foi emprestado, querido.")
        } else {
            borrowed = false
            println("Obrigada, estamos a disposicao.")
        }

    }

    fun printItself() {
        println(author)
        println(title)
        println(publication)
    }
}

fun main(args: Array<String>) {
    val harry = Book("pedra filosofal", "J.K. Rowling", 1999, false)

    harry.printItself()

    harry.borrow()
    harry.returnBook()
    harry.borrow()
    harry.borrow()
}