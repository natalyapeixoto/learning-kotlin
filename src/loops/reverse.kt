package loops

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 8)
    println(reverse(numbers))
    println(simpleReverse((numbers)))
}

fun reverse(list: List<Int>) :List<Int> {
    val result = arrayListOf<Int>()
    for ( i in 0..list.size-1) {
        result.add(list.get(list.size-1-i))
    }
    return result
}

fun simpleReverse(list: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    for ( i in list.size-1 downTo 0) {
        result.add(list.get(i))
    }
    return result
}