package kotlinFromCourse

/**
 * 转化
 */
fun main() {
    //去重旧方法
    val distinct = strings.toSet().toList()

    //去重新方法
    val newDistinct = strings.distinct()

    println(distinct)
    println(newDistinct)
}