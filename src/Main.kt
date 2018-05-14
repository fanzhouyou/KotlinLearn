
data class Money(val amount:Int, val currency:String)

fun main(args:Array<String>){
    val tickets = Money(100,"$")
    val popcorn = tickets.copy(500,"EUR")
    if (tickets != popcorn){
        println("they are different")
    }

//    val p1 = Person(age = 12,name1 = "alex")

//    val bar = Bar()
//    bar.f()
//    bar.Baz()
//    bar.Baz().g()

//    println("Constructing Derived(\"hello\", \"world\")")
//    val d = Derived("hello", "world")

    val c = C()
    c.f()
    c.a()
    c.b()


}

//class Child(): Person(""){
//    override fun v() {
//        super.v()
//    }
//}

open class Base(val name: String) {

    init { println("Initializing Base") }

    open val size: Int =
            name.length.also { println("Initializing size in Base: $it") }
}

class Derived(
        name: String,
        val lastName: String
) : Base(name.also { println("Argument for Base: $it") }) {

    init { println("Initializing Derived") }

    override val size: Int =
            (super.size + lastName.length).also { println("Initializing size in Derived: $it") }
}

open class Foo {
    open fun f() { println("Foo.f()") }
    open val x: Int get() = 1
}

class Bar : Foo() {
    override fun f() {
        super.f()
        println("Bar.f()")
    }

    override val x: Int get() = super.x + 1

    inner class Baz {
        fun g() {
            println("----->1")
            this@Bar.f()
            println(this@Bar.x)
            println("------>2")
            super@Bar.f() // 调用 Foo 实现的 f()
            println(super@Bar.x) // 使用 Foo 实现的 x 的 getter
        }
    }
}

open class A {
    open fun f() { println("A") }
    fun a() { println("a") }
}

interface B {
    fun f() { println("B") } // 接口成员默认就是“open”的
    fun b() { println("b") }
}

class C() : A(), B {
    // 编译器要求覆盖 f()：
//    override fun f() {
//        super<A>.f() // 调用 A.f()
//        super<B>.f() // 调用 B.f()
//    }

    override fun f() {
        super<B>.f()
        super<A>.f()
    }

}


// ceshi