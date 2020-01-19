import java.util.Scanner

fun main(args:Array<String>) : Unit{
    val scan = Scanner(System.`in`)
    val n : Int = scan.nextInt()
    var age : Int;
    var name : String;
    var member : MutableMap<String, Int> = mutableMapOf()

    for(i in 1..n){
        age = scan.nextInt()
        name = scan.next()
        member.set(name, age)
    }
    //모르겠어유ㅠㅠㅠㅠㅠ
}