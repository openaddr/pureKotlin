package kotlinFromCourse

/**
 * Set集合
 */
val set = setOf("China", "Canada", "china", "China")
val mutableSet = mutableSetOf("China", "Canada", "china", "China")
fun main() {
    println(set)
    println(set.elementAt(2))
    //报错
//    println(set.elementAt(3))

    println(mutableSet)
    mutableSet += "India"
    println(mutableSet)
}