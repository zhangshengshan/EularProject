object Eular6 {
  def main(args: Array[String]): Unit = {
    val numbers = 1 to 100
    def square(n: Int) = n * n
    val r = square(numbers.sum) - numbers.map(square).sum
    println(r)
  }
}
