package kotlinFromCourse

/**
 * 内部类
 *
 * 如果一个类逻辑上是不会脱离另一个类存在的,那么将其嵌入到另外一个类中是合理的
 */
class Player7 {
    class Equipment(var name: String) {
        fun showEquipment() = println("看看我的大宝贝 $name")
    }

    fun fight(): Unit {

    }
}

fun main() {
    val equipment = Player7.Equipment("双刀")
    equipment.showEquipment()
}