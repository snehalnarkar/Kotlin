

fun main() {
    // listof method in immutable collection
    var result = listOf<String>("one", "two", "three", "four")


    println(result[0])
    println(result[1])
    println(result[2])
    println(result[3])

    if(result.isEmpty()){       //isEmpty() method
        println(true)
    }else{
        println(false)
    }
    println("\n")

    //Mutablelistof method in mutable collection
    val theMutableList = mutableListOf("one", "two", "three", "four")


        theMutableList.add("six")
        theMutableList.add("seven")
        println(theMutableList)
        println("Size of the list " + theMutableList.size)       //size of list
}
