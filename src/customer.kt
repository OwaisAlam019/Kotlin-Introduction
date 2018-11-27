data class Customer(var name: String, var email: String = "",
                    var company: String = "")
fun main(args:Array<String>){
    var cust1 = Customer("Alam","rehan","it retina")
    cust1.name = "Owais"
    cust1.company="IT Retina"
    var cust2 = cust1.copy(email = "Rehan")
    println("${cust2.name} email: ${cust2.email}")
}