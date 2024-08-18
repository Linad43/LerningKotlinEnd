package collections

fun main() {
    val numbers = (1..20).toList()
    println(numbers)
    println(numbers.
        drop(numbers.size-5).
        filter { it%2==0 }.
        count())
    println(numbers.
        take(7).
        sum())
    val numString = mutableListOf("one", "two", "three")
    println(numString.
        map { it.toCharArray().
            map { it.toString() }}.
        flatten())
    println(numString.maxBy { it.length })

    val listProduct = listOf(
        Product("first", (1..100).random()),
        Product("second", (1..100).random()),
        Product("third", (1..100).random())
    )
    listProduct.forEach { println(it) }
    println(listProduct.sumOf { it.count })
}
class Product(
    val name:String,
    val count:Int
){
    override fun toString(): String {
        return "name = $name,\t count = $count"
    }
}