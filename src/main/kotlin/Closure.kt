fun main() {
    val returnAFun = returnAFun()
    val returnAFun1 = returnAFun("hello")
    println(returnAFun)
    println(returnAFun1)
}

fun returnAFun(): (String) -> String {
    return {
        "$it 返回了一个函数"
    }
}