package kotlinFromCourse

class MagicBox<T>(item: T) {
    private var subject: T = item
}

class Boy(val name: String, var age: Int)

class Dog(val weight: Int)


fun main() {
    val magicBox = MagicBox(Boy("闫宁", 23))
    val magicBox1 = MagicBox(Dog(20))
    println(magicBox)
    println(magicBox1)
}