package collections

fun main() {
    var list = mutableListOf(1, 1, 1, 4, 6, 8, 8, 9, 7, 5, 3, 3, 3)
    val first = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val chet = mutableSetOf<Int>()
    val neChet = mutableSetOf<Int>()
    val newSet = mutableSetOf<Int>()
    for (num in first) {
        if (num % 2 == 0) {
            chet.add(num)
        } else {
            neChet.add(num)
        }
        if ((num * 2) % 5 == 0) {
            newSet.add(num * 2)
        }
    }
    println(first)
    println(chet)
    println(neChet)
    println(newSet)
    println(list)
    println(removeDuplicates(list))

    list = mutableListOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    println(list)
    //firstEndZeros(list)
    secondEndZeros(list)
    println(list)

}

fun <T> removeDuplicates(collection: Collection<T>?) = collection?.toSet()
fun firstEndZeros(list: MutableList<Int>) {
    var flag = true
    while (flag) {
        flag = false
        for (index in 0..<list.lastIndex) {
            if (list[index] == 0 && list[index + 1] != 0){
                list[index] = list[index+1]
                list[index+1] = 0
                flag = true
            }
        }
    }
}
fun secondEndZeros(list: MutableList<Int>) {
    var count = 0
    for (index in list.indices){
        if (list[index]==0){
            count++
        }
    }
    while (count!=0){
        list.remove(0)
        list.add(0)
        count--
    }
}