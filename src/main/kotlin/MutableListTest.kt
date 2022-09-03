/**
 * 可变集合
 */
val mutableList = mutableListOf("Hello", "Hi", "Hey")

fun main() {
    mutableList += "Hello,World"
    println(mutableList)
    mutableList -= "Hello"
    println(mutableList)
    mutableList.removeIf { it === "Hi" }
    println(mutableList)
}