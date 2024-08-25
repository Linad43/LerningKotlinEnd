package collections

fun main() {
    val array = arrRand(20)
    println(array.contentDeepToString())
    println(array.filter { it in 3..9 }.sum())

    val numbers = listOf(1, 2, 3, 4)
    println(numbers.fold("") { line, element -> line + element.toString() })

    val playerList = listOf(
        Player("one", (1..10000).random(), (1..1000).random().toDouble()),
        Player("two", (1..10000).random(), (1..1000).random().toDouble()),
        Player("three", (1..10000).random(), (1..1000).random().toDouble()),
        Player("four", (1..10000).random(), (1..1000).random().toDouble()),
        Player("five", (1..10000).random(), (1..1000).random().toDouble())
    )
    playerList.forEach { println(it) }
    val sumExp = playerList.sumOf { it.exp }
    val sumMoney = playerList.sumOf { it.money }
    println("Сумма опыта $sumExp, сумма денег $sumMoney")

    val fruits = listOf("Яблоко", "Абрикос", "Банан", "Виноград", "Вишня", "Кокос", "яблоко")
    println(fruits)
    println(fruits.filter { it.length % 2 == 0 }.groupBy { it.first().toString().lowercase() })
}

fun arrRand(n: Int): Array<Int> {
    val result = IntArray(n)
    for (index in 0..<n) {
        result[index] = (Math.random() * 100).toInt()
    }
    return result.toTypedArray()
}

data class Player(
    val name: String,
    val exp: Int,
    val money: Double
) {
    override fun toString(): String {
        return "Имя $name, опыт $exp, деньги $money."
    }
}