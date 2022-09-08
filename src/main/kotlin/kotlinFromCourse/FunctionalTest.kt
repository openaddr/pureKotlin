package kotlinFromCourse

fun main() {
    val animals = listOf("斑马", "长颈鹿", "大象", "狗子")
    val me = listOf("banma", "changjinglu", "daXiang", "gouZi")
    val zip = animals.zip(me)
    println(zip)
    println(zip.toMap())

    val fold = animals.fold("hello") { x, y ->
        x.plus(y)
    }
    println(fold)

    val reduce = animals.reduce { x, y ->
        x.plus(y)
    }
    println(reduce)
    val map = animals.map {
        "小$it"
    }
    animals.map { "小$it" }

    println(map)

    val listOf = listOf(listOf("1", "2", "3"), listOf("121", "16"))

    val flatten = listOf.flatten()
    listOf.flatMap {
        it
    }
    println(flatten)

    val filter = animals.filter(containMa).map(hello)
    println(filter)
    val some = listOf(7, 4, 8, 4, 3, 22, 18, 11)
    val filter1 = some.filter { num ->
        (2 until num).none {
            num % it == 0
        }
    }
    println(filter1)

    val take = (0..5000).filter { it.isPrime() }.take(1000)
    println(take.size)
    val filter2 = generateSequence(2) { it + 1 }.filter { it.isPrime() }.take(1000)

    println(filter2.toList())
    val two = 1
    println(two.isPrime())
    println("???")
}

val containMa = { str: String ->
    str.contains("马")
}

/**
 * 判断int是否为素数
 */
fun Int.isPrime(): Boolean {
    return when (this) {
        in (0..1) -> false
        else -> {
            (2 until this).none {
                this % it == 0
            }
        }
    }
}