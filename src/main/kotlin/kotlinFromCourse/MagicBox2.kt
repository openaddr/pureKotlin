package kotlinFromCourse

class MagicBox2<T>(item: T) {

    var available = false
    private var subject: T = item
    fun fetch(): T? {
        return subject.takeIf { available }
    }

    /**
     * 泛型方法
     * 此方法参数为一个子函数,子函数的入参为T,返回值为R
     */
    fun <R> fetch2(subFunc: (T) -> R):R {
        return subFunc(subject)
    }
}

fun main() {
    val magicBox2 = MagicBox2(Boy("张三", 23))
    magicBox2.available = true
    magicBox2.fetch()?.run {
        println("我是$name")
    }
    val fetch2 = magicBox2.fetch2 {
        it.apply { it.age++ }
    }
    println(fetch2.age)
}