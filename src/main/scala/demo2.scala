import scala.collection.immutable.HashMap

object demo2 {
  def main(args: Array[String]): Unit = {
    var hashmap =  HashMap("a"->"car","b"->"bike")
    hashmap.foreach{
      case(key,value) => println(key+  "->" value)
    }
  }
}
