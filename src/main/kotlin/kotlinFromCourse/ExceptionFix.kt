package kotlinFromCourse

/**
 * 异常捕获
 */
fun main() {
    val num: Int? = null
    try {
        checkOperation(num)
        num!!.plus(1)
    } catch (e: Exception) {
        println(e)
    }
}


fun checkOperation(num: Int?) {
    //检查num是否为null,如果是null 抛出自定义异常
//    num?:throw MyFirstException()
    //检查num是否为null,如果是null,输出自定义信息
    checkNotNull(num) { println("哎呀,又空了") }
}

//自定义异常类
class MyFirstException : IllegalArgumentException("请仔细检查您的参数")

/**
 * checkNotNull 是否为null
 * require 是否为false
 * requireNotNull 是否为null
 * error 是否为null
 * assert 是否为false
 */