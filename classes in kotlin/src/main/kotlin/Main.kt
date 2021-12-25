fun main(args: Array<String>) {

   val arr= arrayOf("Aman","Nawal","Abhishek","Hatwal","Ashutosh","Baunthiyal")
//for primary constructor
   val firstClass= FirstClass(firstname = arr[0], lastname = arr[1], none = "none")  //unlike java we dont need to use new keyword
// for creating an instance of person class

   println("${firstClass.firstname}  ->  ${firstClass.lastname}")
//for secondary constructor
println("\nfor secondary constructor\n")
   val firstClass2= FirstClass()

   firstClass2.printinfo()



}