package kotlinFromCourse

const val COUNTRY = "China"

fun main(args: Array<String>) {

    val a = 1
    val b = 2
    var c: String = """hello
        |,world""".trimMargin()
    print(c)
//    if ( a is String) print(" a  is String")
    when (a) {
        1 -> print("a是1")
        2 -> print("a是2")
        else -> print("a既不是1,也不是2,而是$a")
    }
    if (a !in 1..10) println("yes") else println("no")
//    when(a){
//        in 1..5 -> println("a is $a, in 1..5")
//        else -> println("a is not in 1..5")
//    }
//    when (a){
//        is String -> println("yes")
//    }
}

fun isString(a: Any) {
    when (a) {
        is String -> println("a is String")
        else -> println("a is not String")
    }
}

val a = 1
val b = 2
val max = if (a > b) a else b
fun hello(a: Int, b: Int): Int {
    return a + b
}

fun hello01(a: Int, b: Int) = a + b

