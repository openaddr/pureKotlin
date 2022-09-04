package kotlinFromCourse

/**
 * 集合的三种遍历方式
 */
fun main() {
    strings.forEach {
        println(it)
    }

    for (string in strings) {
        println(string)
    }

    strings.forEachIndexed { index, s ->
        println("$index $s")
    }
}