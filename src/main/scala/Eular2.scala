/**
  * Created by zhangshengshan on 16/7/28.
  */


object Eular2 {

  def fabnaci(n: Int): Int = n match {
    case 1 => 1
    case 2 => 2
    case _ => fabnaci(n - 1) + fabnaci(n - 2)
  }

  def fibFrom(a:BigInt,b:BigInt):Stream[BigInt]={
    a#::fibFrom(b,a+b)
  }

  def main(args: Array[String]): Unit = {
    var n = 1
    var sum = 0
    var temp = 0
    while (fabnaci(n) < 4000000) {
      println(fabnaci(n))

      temp = if (fabnaci(n)%2==0) fabnaci(n) else 0
      sum = sum + temp

      n = n + 1
    }
    println("sum is "+sum)



    //try another way to solve

    val a = fibFrom(1,2)
    //make sure take a substream from a with a,take(100).head > 4000000
    val num = a.take(100).filter((x:BigInt)=> x % 2 ==0 && x < 4000000).toList.reduce(_ + _)
    println("num is "+num)


  }
}
