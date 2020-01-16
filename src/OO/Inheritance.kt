package OO

open class Person3(open val name: String, open var age: Int) {

    init {
        println("Object was created")
    }

    fun speak() {
        println("Hello!")
    }

    fun greet(name: String) {
        println("Hello $name!")
    }

    fun getYearOfBirth() = 2020 - age

}

class Student(override val name: String, override var age: Int, val studentID: Long): Person3(name, age) {
        fun isIntelligent() = true
}

class Employee(override val name: String, override  var age: Int): Person3(name, age) {
    fun receivedPayment() {
        println("The Cash is in !")
    }
}


fun main(args: Array<String>) {
    val person = Person3("Jack", 23)

    person.speak()
    person.greet("Cabeca")
    println(person.getYearOfBirth())

    println(person.name)
    println(person.age)


    println("----- ------ ----- ---")

    val student = Student("Marisa", 56, 909090909090)
    student.speak()
    println(student.name)
}