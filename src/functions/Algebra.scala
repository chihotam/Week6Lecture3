package functions

object Algebra {
  def prime(num: Int): List[Int] = {
    if(num < 2) {
      return List()
    }
    for(i <- 2 until num) {
      if(num % i == 0) {
        val lis: List[Int] = List(i) ++ prime(num/i)
        return lis
      }
    }
    List(num)
  }

  def factor(num: Int): List[Int] = {
    prime(num)
  }
}
