package kotlinFromCourse

import java.io.File

fun main() {
    val file = File("E:\\Desktop\\temp.md")
    file.setReadable(true)
    file.setWritable(true)
    file.setExecutable(false)
    /**
     * apply函数可以看做一个配置函数
     * 传入一个接受者,然后调用一系列函数来配置它以便使用.
     *
     * 如果提供lambda给apply函数执行,他会返回配置好的接受者
     *
     * 来着网友的解释:
     * 调用某对象的apply函数,在函数范围内,可以任意调用该对象的方法,最后返回该对象
     */

    //似乎又是知识盲区:apply的参数似乎不是值,也不函数,而是一个函数的执行过程(或者叫函数体,不包含参数和返回值,因为参数和返回值已经确定死了)
    File("E:\\Desktop\\temp.md").apply {
        setReadable(true)
        setWritable(true)
        setExecutable(false)
    }

    val s = "hello"
    val apply = s.apply {
        let {
            it.plus(",world")
        }
    }
    val let = s.let {
        it.plus(",world")
    }
    var one = 1
    val apply1 = one.apply {
        one += 1
    }
    println(one)
    //todo 这里为什么不是2
    println(apply1)
    val let1 = one.let {
        val i = it + 1
        it + 1
    }
    println(let1)

    println(apply)
    println(let)
}