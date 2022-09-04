package kotlinFromCourse

/**
 * 单例对象
 */
object ApplicationConfig {
    init {
        println("ApplicationConfig loading")
    }

    fun doSth(): Unit {
        println("do something")
    }
}

fun main() {
    //既是类名,也是实例名
//    ApplicationConfig.doSth()
    println(ApplicationConfig)
    println(ApplicationConfig)
}