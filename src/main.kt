fun main() {
    greeting("Angela")
    var x = modulus(21,5)
    var sum = add(12,14,8,10)
    println  (sum)
    interestingFact("alot")
}
fun greeting(name:String){
    println("Hello " + name)

}
fun modulus(a: Int,b: Int):Int{
    var modulus = a%b
    return modulus
}
fun add(a: Int,b: Int,c: Int,d: Int):Int{
     var sum = a+b+c+d
     return sum
}
fun interestingFact(fact: String){
    println("I smile"+" "+fact)

}