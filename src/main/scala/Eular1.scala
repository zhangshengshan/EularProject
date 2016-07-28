object Eular1 {

  def main(args: Array[String]): Unit = {
    val sum = List.range(1,999).filter((x:Int) => (x%3==0)||(x%5==0)).reduce( _ +  _ )
    println("sum is "+sum)
  }
}
