object Fibonacci {
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)
  }

  def printFibonacciNumbers(n: Int): Unit = {
    var i = 0
    while (i < n) {
      print(s"${fib(i)} ")
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 10
    println(s"First $n Fibonacci numbers:")
    printFibonacciNumbers(n)
  }
}
