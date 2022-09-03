/**
 * 集合创建和元素获取
 */
val strings = listOf("Hello", "Hi", "Hey","Hello")
fun main() {

    println(strings.getOrNull(3)?:"China")
    println(strings.getOrElse(3){"China"})
    println(strings[3])
}