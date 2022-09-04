package kotlinFromCourse

enum class Direction(private val coordinate: Coordinate) {
    EAST(Coordinate(1, 0)),
    WEST(Coordinate(-1, 0)),
    SOUTH(Coordinate(0, -1)),
    NORTH(Coordinate(-0, 1));

    fun updateCoordinate(yourCoordinate: Coordinate) =
        Coordinate(coordinate.x + yourCoordinate.x, coordinate.y + yourCoordinate.y)

}


fun main() {
    println(Direction.EAST.updateCoordinate(Coordinate(0, 0)))
    println(Direction.EAST is Direction)
}