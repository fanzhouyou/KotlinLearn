abstract class Person() {
    var name:String = ""
    var age:Int = 0

    open val country:String = "China".also{ println("Country : $it")}

    open fun eat(){

        println("eat")
    }

//    abstract fun exercise()

    fun shopping(){println("shopping")}
}