package sort

fun main() {
    var people = listOf(
        Employe("nameOne", 25, 2000.0),
        Employe("nameTwo", 18, 1200.0),
        Employe("nameTree", 20, 3000.0),
        Employe("nameFour", 19, 2500.0)
    )
    println(people.sortedBy { it.name })
    println(people.sortedBy { it.age })
    println(people.sortedBy { it.salary })


    val matrix = arrayOf(
        arrayOf(2, 5, 9, 6),
        arrayOf(3, 1, 6, 3),
        arrayOf(5, 2, 3, 6)
    )
    println(matrix.contentDeepToString())
    for (index in matrix.indices){
        if (isSaw(matrix[index])){
            println("Строка ${index+1} пилообразна")
        }else{
            println("Строка ${index+1} не пилообразна")
        }
    }
    for (index in matrix.indices) {
        matrix[index].sort()
    }
    println(matrix.contentDeepToString())


}

data class Employe(
    val name: String,
    val age: Int,
    val salary: Double
)

fun isSaw(array: Array<Int>): Boolean {
    for (index in 1..<array.size - 1) {
        if (array[index - 1] > array[index] && array[index + 1] > array[index] || array[index - 1] < array[index] && array[index + 1] < array[index])
            continue
        else
            return false
    }
    return true
}