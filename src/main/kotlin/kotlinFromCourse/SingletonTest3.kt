package kotlinFromCourse

import java.io.File

open class ConfigMap {
    //相当于java中的static属性和方法,但不会在类加载时就出现
    //只有实例化ConfigMap,或者调用此对象的方法时,此对象才会实例化
    //无论调用多少次,他始终是单例的
    companion object {
        private const val PATH = "xxxx"
        fun load() = File(PATH).readBytes()
    }
}

fun main() {
    ConfigMap.load()
}