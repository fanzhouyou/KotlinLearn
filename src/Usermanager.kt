class Usermanager {

    object getInstance{
        fun test(){
            println("SimpleSington test")
        }
    }



    fun login(){
        println("login")
    }

    companion object :SingletonNoParam<Usermanager>(::Usermanager){
    }
}

object outObject{
    //    var TAG = "outObject".also { println("TAG is ${it}") }
    fun outFunction(parameter:String) {
        println("Out object function result: $parameter.")
    }
}