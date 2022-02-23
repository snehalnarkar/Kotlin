interface MyInterface {
    val test: Int
    fun hey() : String

    fun hello() {
        println("Hello there,sneha !!")
    }
}

class InterfaceImp : MyInterface {
    override val test: Int = 25
    override fun hey() = "Good Morning !!"
}

fun main(args: Array<String>) {
    val obj = InterfaceImp()

    println("test = ${obj.test}")
    print("Calling hello(): ")

    obj.hello()

    print("Calling and printing hey(): ")
    println(obj.hey())
}