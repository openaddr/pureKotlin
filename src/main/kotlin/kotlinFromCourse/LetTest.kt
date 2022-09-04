package kotlinFromCourse

/**
 * let函数
 */
fun main() {
    val let = listOf(3, 2, 1).first().let {
        it * it
    }
    println(let)

    val hello1 = hello(null)
    val hello2 = hello("张三")
    println(hello1)
    println(hello2)
}

val hello = { name: String? ->
    name?.let {
        "您好,$name"
    } ?: "您好,请问怎么称呼?"
}