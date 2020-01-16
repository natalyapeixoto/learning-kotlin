package OO

class House(val height:Double, val color:String, val price: Int = 50000) {
    fun print() {
        println("House [height=$height color=$color, price=$price]")
    }
}

fun main(args: Array<String>) {
    val house = House(height = 3.4, color = "Blue", price = 1500000)
    val redHouse = House(color = "red", price = 3000000, height = 5.6)
    val yellowHouse = House(color = "yellow", height = 3.5)

    house.print()
    redHouse.print()
    yellowHouse.print()
}