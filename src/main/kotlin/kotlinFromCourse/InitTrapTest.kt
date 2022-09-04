package kotlinFromCourse

class Player5(_name: String) {

    var yourName = init()
    var name = _name
    private fun init() = name
}

fun main() {
    val player5 = Player5("zhangsan")
    println(player5.yourName)
}