package collections

import funExt.lastIndex

fun main() {
    var map = mutableMapOf(
        1 to "one",
        2 to "two",
        3 to "three",
        4 to "four",
        5 to "five",
        6 to "six"
    )
    println(map)
    println(map.filterKeys { it < 5 })
    println(map.filterValues { it[it.lastIndex()] == 'e' })
    println(map.filterValues { it.first() == 'f' })

    var prizeMap = mapOf(
        1 to 20,
        2 to 15,
        3 to 53,
        4 to 13,
        5 to 19,
        6 to 36,
        7 to 14,
        8 to 36,
        9 to 43,
        10 to 36,
        11 to 13,
        12 to 24,
        13 to 33,
        14 to 33,
        15 to 24,
        16 to 15
    )
    println(prizeMap.filter { it.key.toString()[it.key.toString().lastIndex()]=='5'&&it.value>20 })
}