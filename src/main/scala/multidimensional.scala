class multidimensional {
  var arr = Array(Array(1,2,3,4,5),Array(6,7,8,9,10))
  def show(): Unit ={
    for(i<-0 to 1){
      for(j<- 0 to 2){
        println(" "+arr(i)(j))
      }
      println()
    }
  }
}

object Multi{
  def main(argc:Array[String]): Unit ={
    var a = new multidimensional()
    a.show()
  }
}
