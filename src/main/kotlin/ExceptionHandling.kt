fun main()
{
    // first try block
    try
    {
        // didn't throw any exception
        divide(40, 10)
    }
    catch (ex : Exception)
    {
        // or you can also write your
        // own handle here
        println(ex.message)
    }
    finally
    {
        println("value divided !")
    }

                    // 2nd try block
                    try
                    {
                        // throw an exception
                        divide(10, 0)
                    }
                    catch (ex : Exception)
                    {
                        // or you can also write your
                        // own handle here
                        println(ex.message)
                    }
                    finally
                    {
                        println("I'm executed but we cannot divide by zero")
                    }
}

fun divide(a : Int, b : Int)
{
    if (b == 0)
        throw Exception("Divide by zero")
    println("Division is :" + a / b)
}