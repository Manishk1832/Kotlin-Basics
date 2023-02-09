fun main() {
 val account=Account(12345,"manish kumar",2000f)
    val account2 = Account(87873)
    val account3 = Account(6758,"Raju")
    val account4 = Account(46443,"Manoj",10000f)
   // account.insert(12345,"Manish Kumar",2000f)
    account.deposit(100f)
    account.withDraw(130f)
    account.withDraw(50f)
    println(account.amount)
    println("Account No: ${account.accNo}, Name: ${account.name},Amount : ${account.amount}")
    println("Account No: ${account2.accNo}, Name: ${account2.name},Amount : ${account2.amount}")
    println("Account No: ${account3.accNo}, Name: ${account3.name},Amount : ${account3.amount}")
    println("Account No: ${account4.accNo}, Name: ${account4.name},Amount : ${account4.amount}")


}
class Account{
//    ( accNo:Int, name:String, amount:Float)

    var accNo:Int = 1
    var name :String? = ""
    var amount:Float = 0f

//    init {
//       this.accNo = accNo
//        this.name = name.capitalize()
//        this.amount = amount + 10000
//    }
    constructor(accNo:Int){
         this.accNo = accNo
          name = "Default"
          amount = 0f
    }
    constructor(accNo:Int,name:String){
        this.accNo = accNo
        this.name = name
        amount = 0f
    }
    constructor(accNo:Int,name:String,amount:Float){
        this.accNo = accNo
       this.name = name
        this.amount = amount
    }



    //properties


//    fun Account(accNo:Int,name:String,amount:Float){
//        this.accNo = accNo
//        this.name = name
//        this.amount = amount
//    }


    /*
    Constructor
    It is a function with same name as class name
    it is used to construct or initialize  the class
    There are 2 types of constructor
    1. Primary constructor
    2. Secondary Constructor - Multiple Secondary Constructors
     */




    //member functions
    //this keyword point to current receiver
//
//    fun insert(accNo:Int,name:String,amount:Float){
//        this.accNo = accNo
//        this.name = name
//        this.amount = amount
//
//    }

    fun deposit(money:Float){
        amount += money
        println(amount)
    }
    fun withDraw(money: Float){
        if(amount<money){ //amount = 5 && money==6
            println("Not Sufficient Funds")
        }
        else{
            amount-=money
            println(amount)
        }
    }

}
