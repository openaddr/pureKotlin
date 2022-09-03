import cn.hutool.json.JSONUtil

open class Product(val name: String) {
    fun description() = "Product: $name"
    open fun load() = "Nothing..."
}

class GooDProduct : Product("张三") {
    override fun load() = "something.."

}

fun main() {
    val product = Product("李四")
    val toJsonStr = JSONUtil.toJsonStr(product)
    println(toJsonStr)
}