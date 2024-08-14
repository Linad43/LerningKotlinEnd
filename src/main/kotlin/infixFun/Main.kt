package infixFun

fun main(){
    println(5 sum 6)
    println(13 diff 6)
    println(3 mul 4)
    println(12 div 4)

    var person = Person("Saymon")
    person say "что-то"

    var pointA = Point("A")
    var pointB = Point("B")
    pointA isAbove pointB
    pointB.isRightOf(pointA)
}
infix fun Int.sum(value: Int) = this + value
infix fun Int.diff(value: Int) = this - value
infix fun Int.mul(value: Int) = this * value
infix fun Int.div(value: Int) = this / value

class Person(val name: String){
    infix fun say(message:String){
        println("$name говорит: $message")
    }
}
data class Point(public val name: String){
    infix fun isAbove(point:Point) {
        println("Точка ${this.name} выше точки ${point.name}")
    }
    infix fun isRightOf(point:Point) {
        println("Точка ${this.name} правее точки ${point.name}")
    }
}