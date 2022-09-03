class Player(
    _name: String,
    _age: Int,
    _isNormal: Boolean
) {
    var name = _name
        get() = field.plus(" from YN")
    var age = _age
        private set
    private var isNormal = _isNormal
}

fun main() {
    var p = Player("张三", 23, true)
    //不能调用私有方法
//    println(p.isNormal)

    var np = NewPlayer("李四",22,false)
    println(np.name)


    var np1 = NewPlayer("王五")
    println(np1.isNormal)

    var np2  = NewPlayer("赵六",22)
    println(np2.age)

    val np3 = NewPlayer(age = 24, isNormal = true)
    println(np3.name)

    val np4 = NewPlayer("", 23, false)
}


class NewPlayer(
    //默认值为老王
    var name: String = "老王",
    var age:Int,
    var isNormal:Boolean
){
    //次构造函数
    constructor(name: String) : this(name,18,true)
    //次构造函数也可以初始化代码
    constructor(name: String,age: Int) : this(name,age+1,true){
        this.age ++
    }
    //初始化代码块
    init {
        require(name.isNotBlank()){"must have name"}
    }
}