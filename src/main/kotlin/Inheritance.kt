//base class
open class Employee( name: String,age: Int,salary : Int) {
    init {
        println("My name is $name, $age years old and earning $salary per month. ")
    }
}
//derived class
class javaDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun javasite() {
        println("I am java developer")
        println()
    }
}
//derived class
class androidDeveloper( name: String,age: Int,salary : Int): Employee(name, age,salary) {
    fun android() {
        println("I am android app developer")
        println()
    }
}

//main method
fun main(args: Array<String>) {
    val wd = javaDeveloper("abc", 24, 40000)
    wd.javasite()
    val ad = androidDeveloper("xyz", 24,24000)
    ad.android()

}
