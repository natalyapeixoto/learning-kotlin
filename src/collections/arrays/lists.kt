package collections.arrays

fun main(args: Array<String>) {
    // --ARRAY
    val array = arrayOf("recife", "sao paulo", "pessoa")
    //nao da pra fazer o println da array toda
    println(array.size)
    array[2] = "Joao Pessoa"
    println(array.contains("recife"))
    val empty: Boolean = array.isEmpty()
    println(empty)
    //nao tem o metodo add


    // -- LIST
    val list = listOf("pizza", "burguer", "sushi")
    val listinha = listOf("trabalho da hora")
    val listona = list + listinha
    println(list)
    println(listona)
    println(listona.size)
    //imutavel


    // -- ARRAYLIST
    var arrayList = arrayListOf("michael", "jonas")
    // essa é mutavel
    arrayList.add("Coxinha")
    arrayList.remove(arrayList[1])
    println(arrayList)
    println(arrayList.size)
}