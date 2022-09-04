package kotlinFromCourse

import java.io.File

/**
 * todo  let also  with run apply 乱成一锅粥
 * todo  还有 takeIf 和 takeUnless
 *
 */

fun main() {
    var strList: List<String>
    val file = File("E:\\Desktop\\temp.md")
    file.also {
        println(it.name)
    }
        .also {
            strList = it.readLines()
        }
    strList.forEach { println(it) }
    file.run {
        println(this.name)
    }.run {

    }
    with(file) {
        println(this.name)
        println(this.readText())
    }
    println("***************************************")
    with(file) {
        println(this.name)
        println(this.readText())
    }
    file.let { it.name }.let { it.length }

}
