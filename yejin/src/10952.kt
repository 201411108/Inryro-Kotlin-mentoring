//10952 A+B -5
import java.util.Scanner
fun main(args:Array<String>) : Unit{
    val mutableListEx : MutableList<Int> = mutableListOf()
    var count=0
    do{
        val scan =Scanner(System.`in`)
        val A=scan.nextInt()
        val B=scan.nextInt()
        if(((A==0)&&(B==0))){ break }
        if((A>0)&&(B<10)){
            mutableListEx.add(count,A+B)
            count++
        }
    }while(!((A==0)&&(B==0)))

    for(i in mutableListEx){
        println("$i")
    }
}