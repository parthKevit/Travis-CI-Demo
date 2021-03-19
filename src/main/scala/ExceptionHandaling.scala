class ExceptionHandaling {
  @throws(classOf[ArrayIndexOutOfBoundsException])
  def divide(a:Int,b:Int): Unit ={
    try{
      a/b
      var arr = Array(1,2)
      throw new ArrayIndexOutOfBoundsException("Check size")
      arr(10)
    }catch {
      case e:ArithmeticException => println(e)
      case ex:Throwable =>println("Found unknown exception"+ex)
    }
    finally{
      println("Finaly block always executes")
    }
    println("Rest of the code is executing")
  }
}

object Handle{
  def main(argc:Array[String]): Unit ={
    var e =  new ExceptionHandaling()
    e.divide(100,10)
  }
}
