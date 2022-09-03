/**
 * 可变map
 */
val mutableMap = mutableMapOf("key1" to "value1", "key2" to "value2")

fun main() {

    mutableMap += "key3" to "value3"

    val orPut = mutableMap.getOrPut("key4") { "defaultValue" }
    println(orPut)
}