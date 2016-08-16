object Eular9 extends App{
  for ( i <- 1 to 333  ; j <- i+1 to 1000; k<- j+1 to 1000-i-j if i+j+k == 1000 && i*i + j*j == k*k ) println(i,j,k,i*j*k)
}
