import java.io.File

/**
 * run函数和apply函数很像，只不过run函数是使用最后一行的返回，apply返回当前自己的对象。
 * run链式调用很好用
 */
fun main() {
    val file = File("E:\\Desktop\\temp.md")
    val run = file.run {
        readText()
    }
    println(run)
    val run1 = CHINA.run {
        isToLong(this)
        isChina(this)
    }.run { assertIt(this) }
    println(run1)
}

val isToLong = { str: String ->
    str.length > 10
}

val isChina = { str: String ->
    str.contains("China")
}

val assertIt = { b: Boolean ->
    when (b) {
        true -> "hhh"
        else -> "www"
    }
}