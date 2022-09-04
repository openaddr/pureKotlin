package kotlinFromCourse

/**
 * 函数
 * private fun doSomething(age:Int,flag:Boolean):String
 */

fun main() {
    val doSomething = doSomething(10, true)
    println(doSomething)    //hello

    //不传参数会有默认值
    val doSomething1 = doSomething1()
    println(doSomething1) //hello 2 true

    //抛出异常
    doNothing()
    //抛出异常,TODO方法返回Nothing类型
    TODO("i dont know")

    //可以指定传哪个参数
    val doSomething11 = doSomething1(flag = false)
    println(doSomething11)  //hello 2 false

    //没有返回值
    println(doSthWithoutReturn()) //kotlin.Unit
}

private fun doSomething(age: Int, flag: Boolean): String {
    return "hello"
}

private fun doSomething1(age: Int = 2, flag: Boolean = true): String {
    return "hello $age $flag"
}

private fun doSthWithoutReturn() {
}

private fun doNothing(): Nothing {
    return TODO("我故意的")
}