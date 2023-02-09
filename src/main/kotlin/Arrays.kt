fun main(){
    val number = arrayOf(1,2,3,4,5)
    val string = arrayOf("A","B","C","D","E","F",1)
    val nameOfString = arrayOf<String>("A","B","C","D","E","F")
    val num= Array(5,{i -> i*1 })
    val nullArray = arrayOfNulls<String>(10)
    val numArray = intArrayOf(1,2,3,4)
    nameOfString.set(0,"Mohit")
    println(num[4])
    println(nameOfString.get(0))
}