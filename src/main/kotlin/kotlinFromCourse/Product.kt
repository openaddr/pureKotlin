package kotlinFromCourse

import cn.hutool.json.JSONUtil

open class Product(val name: String) {
    fun description() = "Product: $name"
    open fun load() = "Nothing..."
}

class GooDProduct : Product("张三") {
    override fun load() = "something.."

    fun childFun() = "child fun"
}

fun main() {
    val product = Product("李四")
    val toJsonStr = JSONUtil.toJsonStr(product)
    println(toJsonStr)

    val gooDProduct: Product = GooDProduct()
//    println(gooDProduct is Product)
//    println(gooDProduct is GooDProduct)
//    println(gooDProduct is File)
    if (gooDProduct is GooDProduct) {
        val childFun = gooDProduct.childFun()
        println(childFun)
    }

    when (gooDProduct) {
//        is GooDProduct -> {
//            println(gooDProduct.childFun())
//        }
        is Any -> {
            println(gooDProduct.load())
            println(gooDProduct)
        }
    }
}