package collections

fun main() {
    println(arrayToMap(arrayOf(1, 21, 3, 4, 5, 6, 5, 6, 3, 7, 9, 6, 3)))

    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
    println(people)
    deleteToInput(people, "Петр")
    println(people)

    var personHashMap = mutableMapOf(
        1 to Person("name1", 20, "post1"),
        2 to Person("name2", 22, "post2"),
        3 to Person("name3", 23, "post3"),
        4 to Person("name4", 21, "post4")
    )
    for (element in personHashMap){
        println(element)
    }
}

fun <T> arrayToMap(array: Array<T>): Map<T, Int> {
    val result = mutableMapOf<T, Int>()
    for (element in array) {
        if (result.containsKey(element)) {
            result[element] = (result[element]!! + 1)
        } else {
            result[element] = 1
        }
    }
    return result
}

fun deleteToInput(map: MutableMap<Int, String>, name: String) {
    for (element in map) {
        if (element.value == name) {
            map.remove(element.key)
            break
        }
    }
}

data class Person(
    val name: String,
    val age: Int,
    val post: String
)