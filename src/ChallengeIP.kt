import java.io.File

fun main(args: Array<String>) {
    val ipsToCode = mutableMapOf<String, Int>()
    File("src/60.ips.txt").forEachLine {
         if(ipsToCode.contains(it)) {
             val prev = ipsToCode.getOrDefault(it,0)
             ipsToCode.put(it, prev + 1)
         } else {
             ipsToCode.put(it, 1)
         }
    }

    val (maxIp, maxCount) = ipsToCode.entries.maxBy { it.value }!!
//    var max = ipsToCode.keys.first()
//    println(max)
//    var maxCount = 0
//
//    for ((ip, count) in ipsToCode.entries) {
//        if (count > maxCount) {
//            maxCount = count
//            max = ip
//        }
//
//    }
    println("$maxIp, $maxCount vezes")

}
