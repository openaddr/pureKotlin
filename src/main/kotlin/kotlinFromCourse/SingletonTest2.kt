package kotlinFromCourse

open class Player6 {
    open fun load() = "Player6 is loading"
}

fun main() {
    val p = object : Player6() {
        override fun load() = "anonymous nothing"
    }

    println(p.load())
}