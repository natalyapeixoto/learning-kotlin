package OO

abstract class Course(val topic: String, val price: Double) {
    open fun learn() {
        println("learn a $topic")
    }
}

interface Learnable {
    fun learn() {
        println("Learning some kotlin")
    }
}


//keyword final can specify that a method can no longer be override

// to get rid of the ambiguious learn method, we can use super<name of class>

open class KotlinCouse() : Course("Kotlin", 999.9), Learnable {
    override fun learn() {
        super<Learnable>.learn()
        println("Curso de Kotlin")
    }
}

fun main(args: Array<String>) {
    val course = KotlinCouse()
    course.learn()
}