fun main() {
    val listOfNames = listOf<String>("He","is","a","Boy")
    val mutableListOfNames = mutableListOf<String>("He","is","a","Boy")
    val mutableArrayListsOfNames = arrayListOf<String>("He","is","a","Boy")
    mutableListOfNames.add("Manish")
    mutableArrayListsOfNames.add("kumar")

    val mapOfNames = mapOf("name" to "Manish",1 to "20", "Nationality" to "Indian")
    val hashmapOfNames = hashMapOf("name" to "Manish",1 to "20", "Nationality" to "Indian")
    hashmapOfNames.set("Learning","Coding Blocks")
    hashmapOfNames["Working"] = " Home"


    for (name in listOfNames){
        print(name+ " ")
    }

    for(x in 0..10){
        //inclusive
        println(x)
    }
    for(x in 0 until 10){
        //exclusive
        println(x)
    }

    for(x in 10 downTo 0 step 2){
        println(x)
    }

    val any: Any = "Manish"
    //val b:String = any as String
    if(any is String){
        any.length
    }

}