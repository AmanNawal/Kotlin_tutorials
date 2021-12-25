//in kotlin visibility is public by default
//internal (classname) means this class is public within the module
//private (classname) no longer available only available in the file in which it has been created
//protected will only be aviable within that class that class or only with suc classes

class FirstClass(firstname:String="Hello",lastname:String,val none:String) //is a primary constructor
//there could be only one primary constructor
//after classname the constructor is starting

{
    val firstname:String
    var lastname:String

    init {     //init block could be used as the body of the constructor always gets
         // executed as an instance are created
        this.firstname=firstname
        this.lastname=lastname
        println("INIT block 1")
        println("the value of none is $none")
        println("IN constructor")
    }
    init {
        println("INIT block 2")
    }

    constructor():this("aman","nawal","none")//secondary constructor needs to fulfill the
    //primary constructor requirements
    {
        println("secondary constructor")
    }

    fun printinfo():Unit{
        println("in the user defined class function\n ")
    }

}