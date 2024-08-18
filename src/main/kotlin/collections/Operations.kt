package collections

fun main(){
    val list = mutableListOf("one", "two", "three")
    list.forEach { print(it.reversed()+" ") }
    println()

    val listNum: MutableList<Int> = arrayOf(
        (1..10).random(),
        (1..10).random(),
        (1..10).random(),
        (1..10).random(),
        (1..10).random()
    ).toMutableList()
    val listTwo = listNum
    println(listNum)
    listTwo.replaceAll { it -> it*it }
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