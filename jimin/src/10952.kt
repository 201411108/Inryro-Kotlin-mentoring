import java.util.Scanner
fun main(){
    val scan = Scanner(System.`in`)
    var a : Int; var b : Int
    val resultList : MutableList<Int> = mutableListOf()
    while(true){
        a = scan.nextInt()
        b = scan.nextInt()
        if( a == 0 && b == 0){
            break
        }
        resultList.add(a+b)
    }
    val numberList = resultList.iterator()
    while(numberList.hasNext()){
        println(numberList.next())
    }
}