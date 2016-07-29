object Eular31 {
  def main(args: Array[String]): Unit = {
    // a 中是不同的币值的列表
    val a = List(1,2,5,10,20,50,100)
    // b 中纪录了每一个币值的可能出现的次数
    val b = a.map(x => List.range(0,200/x+1))
    def func(target:Int,coin:Int):Int = {
        val a = List(1,2,5,10,20,50,100,200)
//        println(target,coin)
        if (target == 1) 1
        else if (coin == 0) 1
        else if (a(coin)>target) func(target,coin-1)
        else  func(target,coin-1)+func(target-a(coin),coin)
    }
//    for( i<- 1 to 10){
//      print(i,":")
//      for ( j <- 0 to 7 ){
//
//        print(func(i,j))
//        print(" ")
//      }
//      println(" ")
//    }

    println(func(200,7))
  }
}
