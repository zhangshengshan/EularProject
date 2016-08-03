object Eular4 {

  def main(args: Array[String]): Unit = {

      val palindromic_list = for( i <- 100 to 999;j <-100 to 999)yield i*j
      println(palindromic_list.filter((x:Int)=> x.toString.reverse.toInt==x).max)
  }
}
