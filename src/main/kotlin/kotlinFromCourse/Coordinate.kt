package kotlinFromCourse

/**
 * 数据类的toString方法有默认效果
 * 同时重写了equals和hashcode方法
 *
 * 数据类也提供了copy方法
 * 自动支持结构语法
 *
 */

data class Coordinate(var x: Int, var y: Int) {
    val isInBounds = x > 0 && y > 0

    //运算符重载 +号
    operator fun plus(other: Coordinate) = Coordinate(x + other.x, y + other.y)
}

fun main() {
//    val coordinate = Coordinate(10, 30)
//    println(coordinate==Coordinate(10,30))
//
//    val (kotlinFromCourse.getX,y) = Coordinate(10,20)
//    println("$kotlinFromCourse.getX $y")

    val coordinate = Coordinate(10, 20)
    val coordinate1 = Coordinate(10, 20)

    val coordinate2 = coordinate + coordinate1
    println(coordinate2)

}