package kotlinFromCourse

fun main() {
    val animals = listOf("斑马", "长颈鹿", "大象", "狗子")

    val map = animals.map {
        "小$it"
    }
    animals.map { "小$it" }

    println(map)
}