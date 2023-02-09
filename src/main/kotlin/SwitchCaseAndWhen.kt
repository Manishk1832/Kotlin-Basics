fun main() {
    val any: Any = "Empty"

 val x =   when(any){
     "Manish" -> "Manish $any"
     "kumar" -> "$any Manish"
      "Name"  -> " $any is Manish Kumar"


//       "kumar" ->{
//           println("Name1")
//
//       }
//       "Manish" ->{
//          println("Name2")
//       }
//       "Name" ->{
//           println("Name3")

       else ->"Not a Valid Name"
       //println("Name4")



   }
    println(x)
}