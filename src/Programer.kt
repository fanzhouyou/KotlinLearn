class Programer(val company :String? = "Tencnet",val language :String) :Person(){


    override val country: String
        get() = "America"


//    override fun exercise() {
//        println("exercise")
//    }

    override fun eat() {
        println("programer eat")
    }

    val firstproperty = "First Property : ${company}".also (::println )

    init {
        println("First initializer block that print ${language}")
    }

    constructor(ide:String) : this(language = "C"){
        println("constructor")
    }
}