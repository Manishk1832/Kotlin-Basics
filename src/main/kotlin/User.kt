fun main(){
    val user:User = User()
    user.email
}
class User{

    val  name:String = " "
    val mobileNo:Int= 1
    val gender:String = " "
    val email:String = " "
    val bio:String = " "

    fun checkMail():Boolean{
        return email.isNotEmpty()
    }

}