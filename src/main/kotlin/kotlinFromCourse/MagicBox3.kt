package kotlinFromCourse

class MagicBox3<T>(vararg item: T) {

    private var subject: Array<out T> = item

    fun fetch(int: Int): T {
        return subject[int]
    }

    fun <R> myFunc(int: Int, subFunc: (T) -> R): R {
        return subFunc(fetch(int))
    }
}

fun main() {
    val magicBox3 = MagicBox3(Boy("张三", 22), Boy("李四", 22))
    val myFunc = magicBox3.myFunc(0) {
        it.apply {
            age++
        }
    }

    println(myFunc.age)


}