package kotlinFromCourse

interface Movable {
    val maxSpeed: Int
        get() = (1..500).shuffled().last()
    var wheels: Int
    fun move(movable: Movable): String
}

class Car(_name: String, override var wheels: Int = 4) : Movable {
    override fun move(movable: Movable): String {
        TODO("Not yet implemented")
    }
}

fun main() {
    val car = Car("拖拉机")
    println(car.maxSpeed)
}