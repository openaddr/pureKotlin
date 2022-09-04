package kotlinFromCourse

/**
 * 函数的入参是参数
 */
fun main() {
    val getDiscountWords = { goodsName: String, num: Int ->
        "$num 个$goodsName"
    }
    showOnBoard("苹果干", getDiscountWords)

    //如果函数的lambda参数排在最后一个,则可以这样写:
    showOnBoard("苹果干") { name: String, num: Int -> "$num 个$name" }

    //如果不需要用入参,则可以用横线空出来
    showOnBoard2 { _, _ -> "world" }
    showOnBoard("苹果干") { _, _ -> "我根本就不想用入参" }

    //如果函数的lambda参数不在最后一个,则不能这么写,会报错:
//    kotlinFromCourse.showOnBoard1("苹果干") { name: String, num: Int -> "$num 个$name" }

    //入参为函数时,也可以传入具名函数
    showOnBoard1(::get, "100")

}

/**
 * 入参为一个String和一个函数
 * 出参为String
 */
fun showOnBoard(goodName: String, getDiscountWords: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodName, hour))
}

fun showOnBoard1(getDiscountWords: (String, Int) -> String, goodName: String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords(goodName, hour))
}

fun showOnBoard2(getDiscountWords: (String, Int) -> String) {
    val hour = (1..24).shuffled().last()
    println(getDiscountWords("goodName", hour))
}

val ax = { _: Int ->
    "s"
}

private fun get(n: String, a: Int): String {
    return "hello,kotlinFromCourse.get()"
}