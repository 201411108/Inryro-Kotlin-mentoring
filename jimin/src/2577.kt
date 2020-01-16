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
        when(tmp){
            0->arr[0]++
            1->arr[1]++
            2->arr[2]++
            3->arr[3]++
            4->arr[4]++
            5->arr[5]++
            6->arr[6]++
            7->arr[7]++
            8->arr[8]++
            9->arr[9]++
        }
        result /= 10
    }
    for(i in 0..9){
        println(arr[i])
    }
}