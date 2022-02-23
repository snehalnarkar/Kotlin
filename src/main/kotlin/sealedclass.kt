sealed class student {
    class A : student() {
        fun display()
        {
            println("Subclass A of sealed class Student")
        }
    }
    class B : student() {
        fun display()
        {
            println("Subclass B of sealed class Student")
        }
    }
}
fun main()
{
    val obj = student.B()
    obj.display()

    val obj1 = student.A()
    obj1.display()
}
