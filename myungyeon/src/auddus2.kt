import java.util.Scanner
fun main(args:Array<String>) :Unit{
    val scan =Scanner(System.`in`)

    val num :Int= scan.nextInt()

    var map :MutableMap<String, Int> = mutableMapOf()

    if(num>=1 && num<=100000) {
        for (i in 1..num) {
            var age: Int = scan.nextInt()
            var name: String = scan.next()
            if((age>=1 && age<=200) && (name.length<=100)){
                map.put(name, age)
            }
        }
    }
    val result= map.toList().sortedBy { (_, value)->value }.toMap()

    for(entry in result){
        print(entry.value)
        print(" ")
        println(entry.key)
    }
}
