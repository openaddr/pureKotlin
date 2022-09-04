package kotlinFromCourse

import java.io.File

fun main() {
    //创建int数组
    val ints = intArrayOf(
        10, 20, 40
    )
    //list转数组
    val ints1 = listOf(10, 20, 40).toIntArray()

    //创建File数组
    val files = arrayOf(File("aaa"), File("xxx"))
}