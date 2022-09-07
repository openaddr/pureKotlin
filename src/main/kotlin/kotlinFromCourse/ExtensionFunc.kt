package kotlinFromCourse

//导入自定义的方法,并重命名为myUtil
import java.io.File
import kotlinFromCourse.randomTake as myUtil
//自定义扩展函数
fun String.addExt(num: Int): String {
    return plus("!".repeat(num))
}
//自定义扩展属性
val String.yuanYinCount
    get() = this.count{"aoeiu".contains(it)}

//可空类型扩展函数
fun String?.printWithDefault(default:String) = println(this?:default)
//中缀表达式
infix fun String?.printWithDefaultWithIn(default:String) = println(this?:default)



fun main() {
    println("abc".addExt(3))

    println(CHINA.yuanYinCount)

    val s:String? = null
    s.printWithDefault("default")
    s printWithDefaultWithIn "default"


    val list = listOf("Hello", "Hi", "Hey")

    val randomTake = list.myUtil()
    println(randomTake)

    list.apply {  }

}

fun File.ext( ) {

}