package kotlinFromCourse

/**
 * 测试Kotlin中的String功能
 */
const val NAME = "YanNing's friend"
const val CHINA = "The people's Republic of China"


fun main() {

    //字符串截取
    val index = NAME.indexOf('\'')
    //Java模式写法
    val substring = NAME.substring(0, index)
    println(substring)

    //kotlin新写法
    //子字符串
    val substring1 = NAME.substring(0 until index)
    println(substring1)
    //分割为集合,获取第一个
    val split = NAME.split("'")
    println(split[0])
    //分割为集合,获取每一个(解构写法,变量个数<=解构后的个数,按顺序获取)
    val (person, friend) = NAME.split("'s")
    println("$person  $friend")


    //字符串替换
    val replace = CHINA.replace(Regex("[aoeiu]")) {
        when (it.value) {
            "a" -> "1"
            "o" -> "2"
            "e" -> "3"
            "i" -> "4"
            "u" -> "5"
            else -> it.value
        }
    }
    println(replace)

}