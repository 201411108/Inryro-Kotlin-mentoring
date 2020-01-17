import java.util.*

fun main (args:Array<String>) {

    var scan1 = Scanner(System.`in`)
    var num1 = scan1.nextInt()

    val Info : MutableMap<String , Int> = mutableMapOf()
    for (i in 0..num1-1){
        var age = scan1.nextInt()
        var name = scan1.next()
        Info.put( name , age)
    }

    val result = Info.toList().sortedBy{ (_, value) -> value}.toMap()

    for (entry in result) { //mutable 안의 요소를 출력할때
        print(entry.value)
        print(" ")
        println(entry.key)
    }
}