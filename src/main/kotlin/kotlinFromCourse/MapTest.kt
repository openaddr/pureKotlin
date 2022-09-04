package kotlinFromCourse

/**
 * map的创建与读取
 */
fun main() {
    //创建map
    val map = mapOf("key1" to "value1", "key2" to "value2")
    println(map)
    val map1 = mapOf(Pair("key1", "value1"), Pair("key2", "value2"))
    println(map1)

    //读取map
    println(map["key1"])
    println(map.getValue("key1"))
    println(map.getOrElse("key3") { "你干嘛~诶呦" })
    println(map.getOrDefault("key3", "忌你太美"))

    map.forEach { (t, u) ->
        println("$t $u")
    }
}