class ClassTest {
    var name: String = "hello"
        get() = arrayOf("hello", "world").first()
        //    get() = field.plus(" from YN")
        set(value) {
            field = value.trim()
        }


}

fun main() {
    val classTest = ClassTest()
    classTest.name = "world                  "
    println(classTest.name)
    val arrayOf = arrayOf("hello", "world")
    arrayOf.shuffle()
    arrayOf.forEach { println(it) }
}

class Class1Test {
    var string: String? = "world"
    fun getString() {
        println(string)
    }
}