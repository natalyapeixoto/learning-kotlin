fun main(args: Array<String>) {
    val favBooks = listOf("harry potter", "agua viva", "crepusculo")

    for (element in favBooks) {
        if (element.contains('e')) {
            for (c in element) {
                println(c)
            }
        }
        println()
    }
}