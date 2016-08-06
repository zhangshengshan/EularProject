object Eular5 {
  def main(args: Array[String]): Unit = {
    val r = Range(20, Int.MaxValue).find(n => Range(2, 21).forall(n % _ == 0))
    println(r.get)
  }
}
