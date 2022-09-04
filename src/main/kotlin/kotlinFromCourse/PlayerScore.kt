package kotlinFromCourse

class PlayerScore(val exp: Int, val level: Int) {
    operator fun component1() = exp
    operator fun component2() = level

}

fun main() {

    val (x, y) = PlayerScore(10, 5)

    println(x)
    println(y)

}