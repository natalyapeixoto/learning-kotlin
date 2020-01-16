package io

fun main(args: Array<String>) {
    print("Enter word to guess: ")
    val word = readLine()

    if (word == null) {
        println("Sem palavra, sem jogo!")
        return
    }

    for (i in 1..100) {
        println()
    }

    val letters  = word.toLowerCase().toCharArray().toHashSet()
    val correctGuesses = mutableSetOf<Char>()
    var fails = 0

    while(letters != correctGuesses) {
        printExploredWord(word, correctGuesses)
        println("Wrong guesses $fails\n")

        val  input = readLine()
        if (input == null) {
            continue
        } else if (input.length != 1) {
            println("please enter only 1 letter")
            continue
        }
        if(word.toLowerCase().contains(input.toLowerCase())) {
            correctGuesses.add(input[0].toLowerCase())
        } else {
            fails++
        }

    }

    println("Number of wrong guesses $fails\n")
    println("Well done!!")
}

fun printExploredWord(word: String, correctGuesses: Set<Char>) {
    for(char in word.toLowerCase()) {
        if(correctGuesses.contains(char)) {
            print("$char ")
        } else {
            print("_ ")
        }
    }
}