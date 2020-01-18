import java.util.Scanner
fun main(args:Array<String>) :Unit{
    val scan= Scanner(System.`in`)
    var list :MutableList<Int> = mutableListOf()
    while(true){
        val a :Int= scan.nextInt()
        val b :Int= scan.nextInt()
        if(a==0 && b==0)
            break
        else if(a>0 && b<10)
            list.add(a+b)
        else
            continue
    }
    for(i in 0 until list.size){
        println(list.get(i))
    }
}