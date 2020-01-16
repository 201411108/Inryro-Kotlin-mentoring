import java.util.Scanner

fun main(){
    val scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()
    var c = scan.nextInt()
    var result = a * b * c
    var arr =  arrayOf(0,0,0,0,0,0,0,0,0,0)
    var tmp : Int

    while(result != 0){
        tmp = result % 10
        arr[tmp]++
        result /= 10
    }
    for(i in 0..9){
        println(arr[i])
    }
}