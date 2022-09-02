/**
 * 空安全问题
 * x?.方法()
 * 这样的格式,如果x为null,则此方法就不会执行
 * x!!.方法()
 * 这样的格式,如果x为null,则此方法会坚持执行,抛出空指针异常
 */
fun main() {
    var str: String? = "hello"
    str = str?.let {
        if (it.isNotBlank()) {
            it
        } else {
            "world"
        }
    }
    println(str)


    var str1: String? = null

    //这样写是不能编译通过的,因为str1是null
//    str1.last()
    //如果非要写,应该断言它(坚持访问!)
//    str1!!.last()

    //安全访问,如果危险发生,则不会访问
    val plus = str1?.last()?.plus("112")
    println(plus)

    str = null
    println(str ?: "差点就空了")
    // ?: 符号表示,如果目标为空,则会返回冒号右边的值
    str = str ?: "差点就空了"
    println(str)
}

