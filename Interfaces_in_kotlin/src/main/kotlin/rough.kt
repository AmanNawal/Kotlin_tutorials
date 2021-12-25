abstract class rough(name2:String){
    abstract val name:String
    abstract val age:Int
    abstract fun info(name:String,age:Int):Int

}


open class parent(val parentname:String,val parentage:Int):rough("MS nawal")
{
    override val name: String
        get() = parentname
    override val age: Int
        get() = parentage

    override fun info(name: String, age: Int):Int {
            return 1
    }
}

class child(val childname:String,val childage:Int,val pname:String,val page:Int):parent(pname,page)
{
    init {
        println("child name $childname child age $childage parent name is $pname parent age is $page")
    }
}



fun main()
{
    val p=parent("MS nawal",45)
    val aman=child("aman nawal",20,p.parentname,p.age)

}