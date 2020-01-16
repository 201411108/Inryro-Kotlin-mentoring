import java.util.*

fun main(args: Array<String>) : Unit {
    val scan = Scanner(System.`in`)
    var num1 = scan.nextInt()
    var num2 = scan.nextInt()
    var num3 = scan.nextInt()
    var res = num1*num2*num3 // 곱하기니까 res는 1이 되어야함
    var res_temp = res
    var arr = Array(10,{0}) // 1부터 9까지 배열 만듦
    var temp = 0
    do {
        temp = res%10
        res/=10
        arr[temp]++

    } while(res!=0)

    for(i in arr) {
        println("$i")
    }
}