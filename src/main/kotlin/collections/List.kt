package collections

fun main() {
    var first = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    println(first)
    println("Первый элемент списка first ${first.first()}")
    println("Первый элемент списка first ${first[0]}")

    var average = 0.0
    var sum = 0
    var sumIndex = 0
    var count = 0
    var sumTwoLast = 0 //сумма двух последних чисел
    var countSum = 2 //количество последних чисел необходимых просуммировать
    for (index in first.indices) {
        sum += first[index]
        sumIndex+=index
        count++
        if(index in first.lastIndex-countSum+1..first.lastIndex){
            sumTwoLast += first[index]
        }
    }

    average = sum / count.toDouble()
    println("Среднее значение: $average")
    println("Среднее значение: ${first.average()}")

    println("Сумма элементов: $sum")
    println("Сумма элементов: ${first.sum()}")

    println("Кол-во элементов: $count")
    println("Кол-во элементов: ${first.count()}")

    println("Сумма последних двух элементов: $sumTwoLast")
    println("Сумма последних двух элементов: ${first.takeLast(2).sum()}")

    println("Сумма индексов: $sumIndex")
    println("Сумма индексов: ${first.indices.sum()}")
}