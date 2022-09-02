import kotlin.math.roundToInt

/**
 * 数值转换
 */
fun main() {
    //这样转失败会抛异常
//    val toInt :Int = "8.98".toInt()

    //这样转失败会返回null
    val toInt :Int? = "8.98".toIntOrNull()
    println(toInt)

    //double转int
    //返回小数点之前的值
    println(8.648787.toInt())
    //返回四舍五入的值
    println(8.648787.roundToInt())

    //格式化
    val format = "%.2f".format(8.648787)
    println(format)

}