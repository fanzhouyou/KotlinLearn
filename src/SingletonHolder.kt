open class SingletonHolder<out T,in A>(creator :(A) -> T) {

    private var creator:((A) -> T)? = creator
    @Volatile private var instance :T?= null

    fun getInstance(arg1 :A) :T{
        val i = instance
        if (i != null){
            return i
        }

        return synchronized(this){
            val i2 = instance
            if (i2 != null){
                i2
            }else{
                val created = creator!!(arg1)
                instance = created
                creator = null
                created
            }

        }

    }

}

open class SingletonNoParam<out T>(creator: () -> T){
    private var creator:(() -> T)? =  creator
    @Volatile private var instane :T ?= null

    fun getInstance():T{
        println("getInstance")
        val i = instane
        if (i != null) {
            return i
        }

        return synchronized(this){
            val i2 = instane
            if (i2 != null){
                i2
            }else{
                val created = creator!!()
                instane = created
                creator = null
                created
            }
        }
    }
}