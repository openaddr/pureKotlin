package kotlinFromCourse

fun <T> Iterable<T>.randomTake():T {
    return this.shuffled().first()
}