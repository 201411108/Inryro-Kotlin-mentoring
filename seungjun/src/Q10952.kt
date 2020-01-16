import java.util.*

fun main (args:Array<String>) {
    var scan1 = Scanner(System.`in`)
    var numA = 1
    var numB = 1

    while (true){
        numA = scan1.nextInt()
        numB = scan1.nextInt()

        if (numA != 0 || numB != 0) {
            println(numA + numB)
        }
        else {
            break
        }

    }
}