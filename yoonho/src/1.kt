import java.util.Scanner

fun main(args : Array<String>) : Unit{
    val scan = Scanner(System.`in`)
    val a : Int = scan.nextInt()
    val b : Int = scan.nextInt()
    val c : Int = scan.nextInt()

    var res = a*b*c

    var list : MutableList<Int>  = mutableListOf(0,0,0,0,0,0,0,0,0,0)
    while(res !=0 ){
        when(res%10){
            0 -> list[0]++
            1 -> list[1]++
            2 -> list[2]++
            3 -> list[3]++
            4 -> list[4]++
            5 -> list[5]++
            6 -> list[6]++
            7 -> list[7]++
            8 -> list[8]++
            9 -> list[9]++
        }
        res = res/10
    }

    for(i in 0..9){
        println(list[i])
    }
}