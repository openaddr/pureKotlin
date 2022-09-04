package kotlinFromCourse

data class MyStudent(var name: String, var age: Int)

fun main() {
    val myStudent = MyStudent("张三", 23)
    val copy = myStudent.copy(name = "李四")
    println(copy)
}