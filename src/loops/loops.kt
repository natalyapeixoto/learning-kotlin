package loops

fun main(args: Array<String>) {
    for (i in 1..10) {
     println("Aprender Kotlin $i")
    }

    val elements = listOf("abacate", "golden", "silver")

    for (element in elements) {
        println(element)
    }

    for ((index, value) in elements.withIndex()) {
        println("Element in $index is $value")
    }

    var sum = 0L
    for (i in 100..100000L) {
         sum += i
    }
    println(sum)
}