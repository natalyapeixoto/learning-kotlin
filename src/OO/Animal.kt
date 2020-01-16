package OO


//private means visible inside this class only (including all its members);
//protected — same as private + visible in subclasses too;
//internal — any client inside this module who sees the declaring class sees its internal members;
//public — any client who sees the declaring class sees its public members.

open class Animal {
    var age: Int = 0
        get() = field
        set(value) {
            if (value >=2) {
                field = value
            }
        }

    private var cpf : Int = 89
    protected open var name: String = "Natalya"
}

class Gato: Animal() {
    fun greet(): String {
        return "$name"
    }
 }
fun main(args: Array<String>) {
    val animal = Animal()
    val miau = Gato()
    println(miau.greet())
    animal.age = 8
    println(animal.age)
}