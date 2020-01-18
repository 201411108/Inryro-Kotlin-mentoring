//10814 나이순 정렬
import java.util.Scanner
class Person(num : Int, age : Int, name : String) {
   var num : Int
   var age : Int
   var name : String
   init{
      this.num=num
      this.age=age
      this.name=name
   }
}
fun main(args:Array<String>) : Unit{
   val scan=Scanner(System.`in`)
   val N=scan.nextInt()
   val person : MutableList<Person> = mutableListOf()
   for(i in 0 until N){
      var Age=scan.nextInt()
      var Name=scan.next()
      person.add(Person(i,Age,Name))
   }
   var temp = Person(0,0, "abc")
   for(i in 0 until N) {
      for (k in i + 1 until N) {
         if(person[i].age<person[k].age){
            continue
         }else if(person[i].age==person[k].age){
            if(person[i].num<person[k].num){continue}
            else if(person[i].num==person[k].num){continue}
            else if(person[i].num>person[k].num){
               temp = person[i]
               person[i] = person[k]
               person[k] = temp
            }
         }else if(person[i].age>person[k].age){
            temp = person[i]
            person[i] = person[k]
            person[k] = temp
         }
      }
   }
   for(i in 0 until N) {
      println("${person[i].age} ${person[i].name}")
   }
}
