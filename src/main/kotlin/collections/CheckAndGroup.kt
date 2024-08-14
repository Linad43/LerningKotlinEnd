package collections

fun main() {
    val list = listOf("one", "two", "three", "four", "five")
    println(list)
    println(list.groupBy { it[0] })
    println(list.groupBy { it.length })
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    for (element in phoneToYear) {
        println(element)
    }
    println(phoneToYear.groupBy { it.second })
}