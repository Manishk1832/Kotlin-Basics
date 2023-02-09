
//nullSafety
var i:String? = null;



lateinit var g : String

//Late initialization
val h :String = "Manish"


fun main(){
    val a:Int  = 30
    val b:String = " Hi Working Fine"
    val c :Boolean = true
    val d :Float = 10.393f
    val e :Double = 39.45
    println(a)
    println(b)
    println(c)
    println(d)
    println(e)

    var f = " Manish"
    f = "Manish Kumar"
    println(f)

    //printing g
    g = "Raju ka khofdi for"
    println(g)

    //print h
    println(h)
    //after change h value
    println(h)
    val size:Int = i?.length ?:0
    println(size)

    var age = 20
    var name  = "manish kumar"
    println("Hello! my name is ${name.capitalize()} and i am $age years old")
}