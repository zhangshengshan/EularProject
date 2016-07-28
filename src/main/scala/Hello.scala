object Hello {
  def mul_3_5[A](x:Int):Boolean = (x % 3 == 0) || (x % 5 == 0)

  def main(args: Array[String]): Unit = {
    val sum = List.range(1,999).filter(mul_3_5).reduce( _ +  _ )
    println("sum is "+sum)
  }
}
