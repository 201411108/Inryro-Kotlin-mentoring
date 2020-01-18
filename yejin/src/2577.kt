//2577 숫자의 개수
import java.util.Scanner
fun main(args:Array<String>) : Unit{
    val scan =Scanner(System.`in`)
    val A=scan.nextInt()
    val B=scan.nextInt()
    val C=scan.nextInt()
    var result=A*B*C
    var arrEx=arrayOf(0,0,0,0,0,0,0,0,0)
    while(result>0){
        arrEx[result%10]++
        result=result/10

     }
    for(a in 0..9){
        println(arrEx[a])
    }
}