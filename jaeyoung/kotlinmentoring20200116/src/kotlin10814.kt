import java.util.*

fun main(args: Array<String>) : Unit {
    val scan = Scanner(System.`in`)
    var total = scan.nextInt()
    var name = " "
    var age = 0
    val mutableMap: MutableMap<String, Int> = mutableMapOf()
    var arr = Array(total,{0})
    for(i in 0 until total) {
        age=scan.nextInt() // 입력받는거랑은 상관 없음
        name=scan.nextLine()
        mutableMap.put(name,age)
    }
    var sortedByValue = mutableMap.toList().sortedWith(compareBy({it.second})).toMap()
    println(sortedByValue) // https://watering.tistory.com/242

    for((key,value)in sortedByValue) {
        println("$value $key")
    }

}