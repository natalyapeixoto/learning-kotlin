package OO

// interfaces defines contract between classes
// classes can implement multiple interfaces.

interface Driveable {
    fun drive()
    val timeDriven: Int
}

class Car(val color: String): Driveable {
    override val timeDriven = 100
    override fun drive() {
        println("Driviung a car")
    }
}

class Motorcycle(val color: String): Driveable {
    override  val timeDriven = 500
    override fun drive() {
        println("Driving a motorcycle")
    }
}