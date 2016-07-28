/**
  * Created by zhangshengshan on 16/7/28.
  */

object Eular2 {

  def fabnaci(n:Int):Int = n match {
    case 1 => 1
    case 2 => 2
    case _ => fabnaci(n-1)+fabnaci(n-2)
  }


  def main(args: Array[String]): Unit = {
    var n = 1
    while(fabnaci(n)<4000000){
      println(fabnaci(n))
      n=n+1
    }
  }
}