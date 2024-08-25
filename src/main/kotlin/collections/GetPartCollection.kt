package collections

fun main() {
    val numbers = (1..20).toList()
    println(numbers)
    val numEx1 = numbers.
    drop(4).
    filter { it%2==0 }.
    count()
    println(numEx1)
    println(numbers.
        take(7).
        sum())
    val numString = mutableListOf("one", "two", "three")
    //Пытался исправить на flatMap, но не знаю как правильно его использовать
    //и numString.flatMap { it } выдает ошибку компиляции
    println(numString.
        map { it.toCharArray().
            map { it.toString() }}.
        flatten())
    println(numString.maxByOrNull { it.length })

    val listProduct = listOf(
        Product("first", (1..100).random()),
        Product("second", (1..100).random()),
        Product("third", (1..100).random())
    )
    listProduct.forEach { println(it) }
    println(listProduct.map { it.count }.fold(0) {sum, element-> sum+element})
}
class Product(
    val name:String,
    val count:Int
){
    override fun toString(): String {
        return "name = $name,\t count = $count"
    }
}