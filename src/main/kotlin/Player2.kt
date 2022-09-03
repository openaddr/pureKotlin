class Player2 {
    lateinit var equipment: String

    fun ready() {
        println("磨刀不误砍柴工,我正在打造兵器!...")
        equipment = "阔刀"
    }

    fun fight() {
        if (::equipment.isInitialized)
            println("我正在用${equipment}作战!")

    }

}

class Player3 {

    //懒汉式
    val equipment by lazy {
        println("磨刀不误砍柴工,我正在打造兵器!...")
        "阔刀"
    }

    fun fight() {
        println("我正在用${equipment}作战!")

    }

    fun sleep() {
        println("我正在睡觉...")
    }

}

class Player4 {

    //饿汉式
    val equipment = ready()

    fun ready(): String {
        println("磨刀不误砍柴工,我正在打造兵器!...")
        return "阔刀"
    }

    fun fight() {
        println("我正在用${equipment}作战!")

    }

    fun sleep() {
        println("我正在睡觉...")
    }

}

fun main() {
//    val player2 = Player2()
//    player2.ready()
//    player2.fight()
    val player3 = Player3()
//    player3.fight()
    player3.sleep()
    val player4 = Player4()
//    player4.fight()
}