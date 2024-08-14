package scopeFun

fun main(){
    var text: String? = null
    text?.let { println("$it (${it.length})") }
    val city = City("City", null)
    city.apply { this.population = 10000 }
    println(city)
    var array = arrayOf(1,2,3,4,5,6,7,8,9,0)
    with(array) {
        println(this.contentDeepToString())
        println("lenth = ${this.size}; sum = ${this.sum()}")
    }
}
data class City(val name:String, var population: Int?)