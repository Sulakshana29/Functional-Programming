object Fibonacci {
  // Recursive function to calculate the nth Fibonacci number
  def fib(n: Int): Int = n match {
    case 0 => 0
    case 1 => 1
    case _ => fib(n - 1) + fib(n - 2)
  }

  // Function to print the first n Fibonacci numbers using a while loop
  def printFibonacciNumbers(n: Int): Unit = {
    var i = 0
    while (i < n) {
      print(s"${fib(i)} ")
      i += 1
    }
  }

  def main(args: Array[String]): Unit = {
    val n = 10 // Change this value to print more or fewer Fibonacci numbers
    println(s"First $n Fibonacci numbers:")
    printFibonacciNumbers(n)
  }
}
