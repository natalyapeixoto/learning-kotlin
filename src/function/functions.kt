package function

import java.util.*

fun hello() {
    println("Hello World!")
}

fun printText(text: String) {
    for (char in text) {
        print(char + " ")
    }
}

fun getCurrentDate(): Date {
    return Date()
}

fun max(a:Int, b:Int) : Int {
    if (a >= b) {
        return a
    } else {
        return b
    }
}

fun main(args: Array<String>) {
    hello()
    printText("Natalya")
    println(getCurrentDate())
    println(max(14,15))
}