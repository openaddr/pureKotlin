class Student(
    _name:String,
    var age:Int
) {


    val subject:String
    init {
        println("初始化代码块执行中...")
        subject = "math"
    }
    var name = _name
    var score = 10
    private val hobby = "sing"

    constructor(_name: String):this(_name,10){
        score = 20
    }

}

/**
 * 初始化顺序:
 *  1.主构造函数里声明的属性: name,age
 *  2.以下两者按代码书写顺序执行:
 *      2.1类级别的属性赋值: score,hobby;
 *      2.2初始化代码块里的属性赋值和函数调用: subject
 *  3.次构造函数里的属性赋值和函数调用: score
 */
fun main() {
    val student = Student("闫宁")
}