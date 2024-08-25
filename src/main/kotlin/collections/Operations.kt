package collections

fun main(){
    val list = mutableListOf("one", "two", "three")
    val listRevers = list.map { it.reversed() }
    println(listRevers)

    /*val listNum: MutableList<Int> = arrayOf(
        (1..10).random(),
        (1..10).random(),
        (1..10).random(),
        (1..10).random(),
        (1..10).random()
    ).toMutableList()*/
    val listNum: Array<Int> = arrayOf(1,2,3,4,5)
    val listTwo = listNum.filter { it<=3 }.map { it*it }
    println(listNum)
    println(listTwo)

    val enColor = listOf("red", "blue", "white")
    val ruColor = listOf("красный", "синий", "белый")
    println(enColor.zip(ruColor) {enColorElement, ruColorElement ->
        "Значение: $enColorElement, перевод: $ruColorElement"
    })

    val mounth = listOf("Jan", "Feb", "Mar", "Apr", "May")
    println(mounth)
    println(mounth.sumOf { it.length })
}