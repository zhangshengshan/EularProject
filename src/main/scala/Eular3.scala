object Eular3 {
  def main(args: Array[String]): Unit = {


    println("recursion style!")
    def largest_prime_factor (divis :Long, divid :Long) :Long = {
      if (divid % divis == 0) largest_prime_factor(2, divid/divis)
      else if (divis > math.sqrt(divid)) divid
      else largest_prime_factor(divis+1, divid)
    }
    def answer = largest_prime_factor(2l, 600851475143l)
    println("answser is ",answer)


    def isPrime(x:Long):Boolean = {
      for ( i <- 2.toLong to scala.math.sqrt(x).toLong){
        if ( x % i ==0) return false
      }
      true
    }

    println("c/c++ style programming!")
    var  n = 2l
    var  num =  600851475143l
    var  max = 1l
    while( n <= math.sqrt(num).toLong ){
      if ( num % n== 0){
         while(num % n ==0) {
            num = num / n
         }
         if (n > max){
           max = n
         }
      }
      n = n + 1
    }
    if (num == 1)
    {
      println("largest prime factor is ",max)
    } else {
      println("largest prime factor is ",num)
    }



//    println("functional programming style!")
//    def factors(n: Int): List[Int] = (2 to math.sqrt(n).toInt).find(n % _ == 0).fold(List(n))(i => i :: factors(n / i))
//    val r = factors(6008).last

  }
}
