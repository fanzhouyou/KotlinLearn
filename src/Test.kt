
const val TAG = "Test"

class Test{
    val TAG4 = "Test4"
//    const val TAG5 = "Test5"

    companion object instance{
        val TAG2 = "Test2"
        const val TAG3 = "Test3"
        fun act(){}
    }

    object instance2{
        fun act2(){}
    }
}

object Test2{
    fun add(a:Int,b:Int) = a+b
}