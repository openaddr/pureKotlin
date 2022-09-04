package kotlinFromCourse

/**
 * if 和 when
 */
fun main() {
    val age = 3
    if (age in 0..3) {
        println("婴儿")
    } else if (age in 3..10) {
        println("少儿")
    }

    when (age) {
        in 0..3 -> println("婴儿")
        in 3..10 -> println("少儿")
    }
}