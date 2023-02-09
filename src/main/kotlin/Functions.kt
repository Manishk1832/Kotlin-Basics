import java.util.Scanner

fun main() {
  val ans = getName();
    showMeUser("Manish",23,false)
    println()
    showMeUser(age=32, isActive = false,name="Manish")
    countAndPrintArgs(2,3,4,3,2,4,5,6,7,7,8,9)
}
fun countAndPrintArgs(vararg number: Int){
    print(number.size)
    for(no in number) println(no)
}

val userName:String = "Dimank Enterprises"

fun getName():String{
    return "Manish Kumar"
}
fun square1(number:Int):Int{
    return number* number
}
fun square2(number:Int) = number*number
fun square3(number:Int):Int = number*number

fun showMeUser(name:String,age:Int,isActive:Boolean){
print("Name $name ,Age $age,Active $isActive")

    /*
    Types of arguments
    1.Positional argument
    2.Default Argument
    3.Named Argument
     */



}
