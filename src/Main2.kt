import kotlin.coroutines.experimental.buildIterator

import main.kotlin.*

val String.lastChar: Char
    get() = get(length - 1)

val <T> List<T>.lastIndex: Int
    get() = size - 1

fun Student.toString():String{
    return toString() + "alex"
}

var x = 22

fun main(args:Array<String>){
//    val programer1 = Programer()
//    val programer2 = Programer(company = "Google")
//    val programer3 = Programer(language = "Java")
//    val programer4 = Programer("Facebook","Python")
//    val programer5 = Programer(ide = "IDEA")
//    programer5.age = 24
//    programer5.eat()
//    programer5.exercise()
//    programer5.shopping()
//    programer5.country.also { println("country : $it") }
//    println(programer5)

//    Usermanager.getInstance
//    Usermanager.getInstance.test()
//    Usermanager.SimpleSington.
//    Usermanager.getInstance()
//    Usermanager.getInstance

    outObject
//    outObject.TAG
    outObject.outFunction("Hello World")



//    val engineer1 = Engineer("USTC")
//    engineer1.age = 13
//    engineer1.name = "June"
//    val engineer2 = JsonUtil.fromJsonString(Engineer::class.java,"{\"name\": \"June\",\"age\": \"13\",\"country\": \"China\",\"university\": \"USTC\"}")
//    engineer2.toString()
//    val student1 = Student("Grade 3")
//    println(student1.toString())
//    println("engineer2 is " + engineer2.toString())
//    println("programer3 is " + programer3.toString())
//    println("" + engineer2.copy().equals(engineer1))

//    val list = mutableListOf(1,2,3)
//
//
//    fun MutableList<Int>.swap(index1:Int,index2:Int){
//        var temp = this[index1]
//        this[index1] = this[index2]
//        this[index2] = temp
//
//    }
//
//    list.swap(0,2)
//    println(list)

//    fun String.lastChar(): Char = this.get(this.length - 1)
//
//    val s1 = "alex"
//    println(s1.lastChar())

//    fun <T> List<T>.lastIndex(): Int = size - 1


//    val numbers = listOf(1, 2, 3)
//    println(numbers.filter(::isOdd))
//
//    val predicate: (Int) -> Boolean = ::isOdd
//
//    val oddLength = compose(::isOdd,::length)
//    val strings = listOf("a", "ab", "abc")
//    println(strings.filter(oddLength))
//
//    println(::x.set(23))
//    println(::x.name)
////
//    val strs = listOf("a", "bc", "def")
//    println(strs.map(String::length))

//    val mAccount = Account()
//    mAccount.account = "Alex"
//    mAccount.token = 23
//    println(mAccount.account)
//    println(mAccount.token)

//    var b: String? = "abc"
//    val l = b?.length ?: -1
//    println(l)
//    b = null
//    val l2 = b!!.length
//    println(l2)
//
//    add1(1,2)
//    add2(2,3)
//
//    println(add3(22,{num1:Int,num2:Int -> num1 + num2}))

//    val v1 = fun(x : Int , y : Int) : Int = x + y
//    println(v1(3,5))
//
//    println(test(3,{it > 0}))
//    fun(x1:Int,x2:Int)=x1+x2
//
//    val t = add3(3)
//    println(t)
//    println(t())
//    println(t())
//    println(t())
//
//    var add4 = fun Int.(other :Int):Int = this + other
//    println(2.add4(5))
//
//
//    println(add3(4,{num1:Int,num2:Int -> num1+num2}))


//    Test.TAG2
//    TAG
//    Test.act()
//    Test.instance.act()
//    Test.instance2.act2()
//    plus(1,2)
//    TAG_TEST2
//    Test2.add()

//    val arr = arrayOf(1,3,5,7,9)
//    println(arr.filter { it < 5 }.component2())

    val add5 = { i: Int -> i + 5 }
    val multiplyBy2 = { i: Int -> i * 2 }
    println(multiplyBy2(add5(2))) // (2 + 5) * 2

    infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1, R> {
        return fun(p1: P1): R{
            return function.invoke(this.invoke(p1))
        }
    }

    infix fun <P1, P2, R> Function1<P2, R>.compose(function: Function1<P1, P2>): Function1<P1, R> {
        return fun(p1: P1): R{
            return this.invoke(function.invoke(p1))
        }
    }

    val add5AndMultiplyBy2 = add5 compose multiplyBy2
    println(add5AndMultiplyBy2(2))




}

fun isOdd(x: Int) = x % 2 != 0
fun length(s:String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}

fun add(a:Int,b:Int) :Int{
    return a+b
}

val add1:(Int,Int) ->Int = {a,b ->a+b}

val add2 = {a:Int,b:Int -> a+b}

fun add3(a:Int,b:(num1 :Int,num2:Int) ->Int):Int{
    return a+b.invoke(4,7)
}

fun a(x:Int,y:Int) :Int {return x+y}

fun test(num1 :Int,a:(Int) -> Boolean):Int{
    return if (a(num1)){num1} else 0
}

fun add2(x1:Int,x2:Int):Int{
    return x1+x2
}

fun add3(b:Int):() ->Int{
    var a = 3
    return fun() :Int{
        a++
        return a+b
    }
}





