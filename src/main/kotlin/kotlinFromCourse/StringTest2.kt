package kotlinFromCourse

import java.util.*

/**
 * == 与 === 的区别
 *
 * == 对比字符串内容是否相等
 * === 对比对象内存地址是否相等
 */
fun main() {
    var str = "YanNing"
    var str1 = "YanNing"
    println(str == str1)
    println(str === str1)

    var str2 = "yanNing".replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
    var str3 = "yanNing".replace('y', 'Y')

    println(str === str2)
    println(str == str2)

    println(str === str3)
    println(str == str3)
}