package OO

//Generics

class Stack<E>(vararg val items: E) {

    val elements = items.toMutableList()

    fun push(element: E) {
        elements.add(element)
    }

    fun pop() : E {
       return elements.removeAt(elements.size - 1)
    }
}

fun <T> stackOf(vararg elements: T): Stack<T> {
    // spread operator *
    return Stack(*elements)
}

fun main(args: Array<String>) {
    val stack = Stack(4,5, 23, 24, 45, 5, 6, 5)
    println(stack.pop())
    println(stack.pop())
    println(stack.push(90))
    println(stack.elements)

    val stack2 = stackOf("hi", "hey", "hello")
    println(stack2.elements)
}