import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
    val member: MutableMap<String, Int> = mutableMapOf()
    var n = scan.nextInt()
    var age : Int; var name : String
    for(i in 1..n){
        age = scan.nextInt()
        name = scan.next()
        member.put(name,age)
    }
    val sortedByValue = member.toList().sortedWith(compareBy({it.second})).toMap()
    val sortedMember = sortedByValue.toMap()
    for((key,value) in sortedMember){
        println("$value $key")
    }
}