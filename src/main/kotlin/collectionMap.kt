
fun main(){

        //Immutable map

        val students= mapOf<Int,String>(1 to "Aisha",2 to "Yash",3 to "Nidhi")
         println(students[1]) //we can directly pass key and access value of an array.

         students.forEach { t, u ->
        println("$t and $u")
    }

        //Mutable Map

       val students1= mutableMapOf<Int,String>(1 to "Aisha",2 to "Yash",3 to "Nidhi")
        students1.put(4 ,"Om") //add elements
       students1[5]="neha"     //add elements
        students1.remove(1)     //remove elements
         println("\n")
         students1.forEach { t, u ->
           println("$t and $u")
         }


}