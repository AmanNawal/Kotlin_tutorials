
//In Kotlin, all classes are final by default.

interface person
{
    var father_name:String //we cannot assign the values directly in interface
    fun printinfo(name:String,Age:Int){
  //in kotlin you can include a default code in the interface which will
    // automatically get executed in all the classes which would be inheriting the interface
        println("default code in interface") //this line would only work if the function
    // is not overridden in the inheriting class

    }
}

interface mother{
    var mom:String
    fun mominfo()
}


//class extending two interfaces

open class infoperson : person,mother
{
override fun printinfo(name: String, Age: Int){    //a class implementing an interface
// needs to implement all the fuctions of interface
    println("HELLO $name your current age is $Age")
    println("$father_name")
}

    //code to override a inherited variable from an interface

    override var father_name: String = "No values"     //="No value"   could be used instead of get

        set(value:String){field=value}


    override fun mominfo() {
        println("in the mominfo function and the name of mmom is $mom")
    }

    override var mom: String=" "

        set(value) {field=value}   //here field would act as the variable which is being overidden
}

class allinfo(var mom2:String="",var father_name2: String=""): infoperson()
{
    init {
        mom=mom2
        father_name=father_name2
        println("within the multiple inheritance $mom2  $father_name2")
    }
}

