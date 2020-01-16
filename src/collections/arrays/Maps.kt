package collections.arrays

fun main(args: Array<String>) {
    val namesToAges = mapOf(Pair("Peter", 30), Pair("Frank", 12))

    val namesToAges2 = mapOf(
        "Peter" to 30,
        "Frank" to 12
    )
    println(namesToAges == namesToAges2)
    println(namesToAges.values)
    println(namesToAges.keys)
    println(namesToAges.entries)

    val contryToInhabitants = mutableMapOf(
        "Germany" to 80_000_00,
        "Brazil" to 200_000_00
    )

    contryToInhabitants.putIfAbsent("USA", 300_000_00)

    println(contryToInhabitants)

    namesToAges.entries.forEach {
        println("${it.key} is ${it.value} years old")
    }
}