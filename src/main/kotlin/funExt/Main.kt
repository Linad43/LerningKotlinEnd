package funExt

import kotlin.math.pow
import kotlin.math.sqrt

const val DELTA = 0.0001


fun main() {
    println(3.pow(4))
    println(3.0.pow((4.0)))
    println("Hello".plus(",", " ", "world", "!"))
    println("Last index".lastIndex())
    println(sqrt(5.0))
    println(5.sqrt())
}

fun Int.pow(b: Int): Int {
    var result = 1
    for (i in 1..b) {
        result *= this
    }
    return result
}

fun String.plus(vararg a: Any): String {
    var result = this
    for (i in a) {
        result += i.toString()
    }
    return result
}

fun String.lastIndex() = this.length - 1
fun Int.sqrt(): Double {
    if (this < 0) {
        throw RuntimeException()
    }
    var i = 0
    while (i * i <= this) {
        i++
    }
    if (i * i == this) {
        return i.toDouble()
    }
    return iterForm(this, i - 1)
}

fun iterForm(a: Int, i: Int): Double {
    var fractEx: Array<Int> = arrayOf(i, 1)
    var fractCurrent: Array<Int>
    var delta: Double
    do {
        fractCurrent = delFract(arrayOf(a, 1), fractEx)
        fractCurrent = sumFract(fractEx, fractCurrent)
        fractCurrent = mulFract(arrayOf(1, 2), fractCurrent)
        delta = (((fractCurrent[0]) / (fractCurrent[1].toDouble())) - ((fractEx[0]) / (fractEx[1].toDouble())))
        fractEx = fractCurrent
        if (delta < 0) {
            delta = -delta
        }
    } while (delta > DELTA)
    return fractCurrent[0] / fractCurrent[1].toDouble()
}

fun mulFract(fractA: Array<Int>, fractB: Array<Int>) = arrayOf(fractA[0] * fractB[0], fractA[1] * fractB[1])
fun delFract(fractA: Array<Int>, fractB: Array<Int>) = mulFract(fractA, arrayOf(fractB[1], fractB[0]))

fun sumFract(fractA: Array<Int>, fractB: Array<Int>): Array<Int> {
    var resultUp: Int
    var resultDown = nok(fractA[1], fractB[1])
    resultUp = fractA[0] * (resultDown / fractA[1]) + fractB[0] * (resultDown / fractB[1])
    var result = arrayOf(resultUp, resultDown)
    result = reduct(result)
    return result
}

fun reduct(result: Array<Int>) = arrayOf(result[0] / nod(result[0], result[1]), result[1] / nod(result[0], result[1]))

fun nod(a: Int, b: Int): Int {
    var bufA = a
    var bufB = b
    while (bufA > 0 && bufB > 0) {
        if (bufA >= bufB) {
            bufA %= bufB
        } else {
            bufB %= bufA
        }
    }
    return Math.max(bufA, bufB)
}

fun nok(a: Int, b: Int): Int {
    var result: Int
    if (a > b) {
        result = a
        while (result % b != 0) {
            result += a
        }
    } else if (b > a) {
        result = b
        while (result % a != 0) {
            result += b
        }
    } else {
        return a
    }
    return result
}