data class User(val Empname: String, val age: Int,val id:Int)

fun main(args: Array<String>) {
    val jack = User("abc", 23,101)
    println("name = ${jack.Empname}")
    println("age = ${jack.age}")
    println("id = ${jack.id}")
}