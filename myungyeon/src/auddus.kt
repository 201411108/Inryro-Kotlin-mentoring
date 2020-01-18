import java.util.Scanner
fun main(args:Array<String>) :Unit{
    val scan =Scanner(System.`in`)

    val num1 :Int=scan.nextInt()
    val num2 :Int=scan.nextInt()
    val num3 :Int=scan.nextInt()

    var ans :Int= num1*num2*num3
    val arr :Array<Int> = arrayOf(0,0,0,0,0,0,0,0,0,0)

    if((num1>=100 && num1<1000) && (num2>=100 && num2<1000)
        && (num3>=100 && num3<1000)){
        while(ans!=0){
            arr[ans%10]=(arr[ans%10]+1)
            ans=ans/10
        }
    }
    for(i in 0 until arr.size){
        println(arr[i])
    }

}