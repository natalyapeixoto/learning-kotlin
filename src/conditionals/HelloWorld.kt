package conditionals

import java.util.*

fun main(args: Array<String>) {
 val random = Random().nextInt(50) + 1


    when (random) {
        in 1..10 -> {
            print("esta entre 1 e 10 o numero é $random")
        }
        in 11..20 -> print("esta entre 11 e 20, o numero é $random")
        in 21..30 -> print("esta entre 21 e 30, o numero é $random")
        in 31..40 -> print("esta entre 31 e 40, o numero é $random")
        in 41..50 -> print("esta entre 41 e 50, o numero é $random")
    }
}

