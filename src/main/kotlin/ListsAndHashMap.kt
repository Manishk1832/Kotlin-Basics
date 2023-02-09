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
   println(mapOfNames[1])
}