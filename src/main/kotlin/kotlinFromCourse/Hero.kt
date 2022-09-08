package kotlinFromCourse

import Hello
import Jhava


fun main() {
    val jhava = Jhava()
    val hello1 = jhava.hello()
    println(hello1)
    val mayNull = jhava.mayNull()
//    println(mayNull?.toLowerCase())
    println(mayNull?.plus("hello"))

    jhava.integer = 100
    println(jhava.integer)
    val hello2 = Hello()
    hello2.h()
}

val  funAnonymous = { str:String->
    "$str $str"
}
fun sayHello() = "hello"

@Throws(Throwable::class)
fun tryE() {
    TODO()
}

class HelloKt{
    var sayHello = "hello,java,im kotlin"

    @JvmField
    var myList = listOf("hello","world")


    companion object {
        @JvmField
        var alwaysSayHello = "hello !!!"

        @JvmStatic
        fun hey()= "hey!"
    }
}