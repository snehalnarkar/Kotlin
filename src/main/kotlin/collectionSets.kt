

fun main(){
    //immutable setof
    val names = setOf<String>("sneha","om","nisha","nisha")

    names.forEach { println(it) }

    //mutable setof
    println("\n")
    val names1 = mutableSetOf<String>("sneha","om","nisha","nisha")
    names1.add("leena") //add elements
    println(names1)
    names1.remove("nisha") //remove elements
    println(names1)
}
