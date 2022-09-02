import java.io.File


val file = File("E:\\Desktop\\temp.md")

/**
 * takeIf, 如果lambda返回true,则执行任务,否则返回null
 */
fun main() {
    val takeIf = file.takeUnless {
        it.isAbsolute
    }

    println(takeIf)
}