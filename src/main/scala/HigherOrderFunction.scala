object HigherOrderFunction {
  def main(argc:Array[String]): Unit ={
    functionExample(25,multiplyBy2)
    var result = multiplyBy2(add2(10))
    println(result)
    var result2 = (_:Int)+(_:Int)
    println(result2(10,10))
  }

  def functionExample(a:Int, f:Int=>AnyVal): Unit ={
    println(f(a))
  }

  ///// function composition
  def add2(a:Int):Int ={
    a+2
  }

  def multiplyBy2(a:Int):Int ={
    a*2
  }
}
