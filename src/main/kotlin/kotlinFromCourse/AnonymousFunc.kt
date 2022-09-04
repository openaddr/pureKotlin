package kotlinFromCourse

/**
 * 匿名函数
 */
fun main() {
    val s = "ssssaaaaccc"
    val count = s.count()
    //可以传入匿名函数
    val count1 = s.count({ x -> x == 's' })

    val count2 = s.count(x)

    println(count)
    println(count1)
    println(count2)

    //声明变量的类型为匿名函数
    val y: (Char) -> Boolean
    //给变量赋函数
    y = {
        it == 's'
    }
    val count3 = s.count(y)
    println(count3)

    val count4 = s.count({ x -> x(x) })
    println(count4)
    val count5 = s.count(yy)
    println(count5)

    println(z())
    println(yy('s'))
    println(
        yyy("你好啊,", 2022)
    )
    println(
        yyyy("你好啊,", 2022)
    )
}


val x = fun(c: Char): Boolean {
    return c == 's'
}

/**
 * 声明一个函数
 */
fun x(c: Char): Boolean {
    return c == 's'
}

/**
 * 声明一个变量,类型为匿名函数
 */
val yy: (Char) -> Boolean = {
    //x为传入的参数
        x ->
    //匿名函数的最后一行就是返回值
    x == 's'
    //如果传入的参数只有一个,则可以用it表示参数名
//    it=='s'
}


/**
 * 声明一个变量,类型为匿名函数
 */
/**
 * 如果已经把匿名函数赋予给了变量,则变量类型可以不写,函数返回结果可以进行类型推断
 *
 * z是一个匿名函数,没有入参
 *
 */
val z = {
    println("我是一个匿名函数")
    "我是返回值,被自动推断了类型"
}


/**
 * 如果有入参,又想要进行结果的类型推断,这么写
 */
val yyyy = { msg: String, year: Int ->
    "$msg $year"
}

/**
 * 上一个变量的完整写法如下
 */
val yyy: (String, Int) -> String = { msg, year ->
    "$msg $year"
}