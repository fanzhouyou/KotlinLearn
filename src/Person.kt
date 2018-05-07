open class Person(val name:String) {

//    constructor(age:Int) : this(name = name)

//    constructor(name: String)

    constructor(age: Int, name1: String) : this(name1)

    open fun v(){}
    fun nv(){}
}