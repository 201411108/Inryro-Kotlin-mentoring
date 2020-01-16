
import java.util.*

fun main (args:Array<String>){

    var scan1 = Scanner(System.`in`)

    var num1 = scan1.nextInt()
    var num2 = scan1.nextInt()
    var num3 = scan1.nextInt()

    var mult = num1 * num2 * num3
    var numArr  = arrayOf(0,0,0,0,0,0,0,0,0,0)

    var tmpNum = mult%10
    numArr[tmpNum] += 1 //먼저 시작한다 why? do while처럼 해야 해서
    var multTmp = mult

    for (i in 1..9){
        multTmp = multTmp/10        //10으로 나눈 수를 계속 저장 //중요함
        var multMod = multTmp%10    //mod10 을 구해주기
        //println(" multTmp = ${multTmp}  numtMod = ${multMod}") //확인 코드

        if(multTmp != 0) //몫이 0이 아닌 이상
        {
            numArr[multMod] += 1
        }
    }
    for (i in 0..9){
        println(numArr[i])
    }
}