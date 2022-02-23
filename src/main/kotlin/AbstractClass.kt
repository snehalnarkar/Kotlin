abstract class Person(name: String) {
    init {
        println("My name is $name.")
    }

    fun displayId(id: Int) {
        println("My Id $id.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(Tname: String): Person(Tname) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val a = Teacher("Supriya")
    a.displayJob("working on Teaching Field !")
    a.displayId(44)
}