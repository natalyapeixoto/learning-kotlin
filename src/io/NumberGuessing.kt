package io

import java.util.*

fun main(args: Array<String>) {
    val number = Random().nextInt(100) +1
    var input: String?
    var guess = -1

    while(guess != number) {
        print("Guess a number between 1 and 100: ")
        input = readLine()

        if (input != null) {
            // can throw Number Format Exception
            guess = input.toInt()
        }

        if (guess > number) {
            println("o numero certo é menor")
        }
        if (guess < number) {
            println("o numero certo é maior")
        }
        println(guess)
    }
}