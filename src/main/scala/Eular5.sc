val Lista = 2 to 20 toList
def isPrime(x:Long):Boolean = {
  for ( i <- 2.toLong to scala.math.sqrt(x).toLong){
    if ( x % i ==0) return false
  }
  true
}

val ListPrime = Lista.filter(isPrime(_))
val PrimeMap = new scala.collection.mutable.HashMap[Int,Int]()
for(i<- ListPrime){
  PrimeMap(i)=1
}
for(i<-ListPrime;j<-Lista){
  println(i,j)
  var temp = 0
  var jj = j
  while(jj%i==0){
    temp = temp + 1
    jj = jj / i
  }
  if(PrimeMap(i)<temp){
    PrimeMap(i)=temp
  }
}
for ((k,v)<-PrimeMap) println(k,v)
def pow(k:Int,v:Int):Int={
  var temp = 1
  for (i<- 1 to v){
    temp = temp * k
  }
  return temp
}
var tt = 1
for ((k,v)<- PrimeMap){
  tt = tt * pow(k,v)
}
println(tt)