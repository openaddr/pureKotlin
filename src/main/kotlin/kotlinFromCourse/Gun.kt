package kotlinFromCourse

abstract class Gun(val range: Int) {
    abstract fun pullTrigger(): String
}

class AK47(range: Int) : Gun(range) {
    override fun pullTrigger(): String {
        TODO("Not yet implemented")
    }
}