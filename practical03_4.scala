import scala.io.StdIn.readLine

def sumOfEvenNumbers(numbers: List[Int]): Int = {
  var sum = 0
  for (num <- numbers) {
    if (num % 2 == 0) {
      sum += num
    }
  }
  sum
}

def main(Args: Array[String]):Unit= {
  println("Enter the number of integers:")
  val n = readLine().toInt

  var numbers: List[Int] = List()
  for (i <- 1 to n) {
    println(s"Enter integer $i:")
    val num = readLine().toInt
    numbers = numbers :+ num
  }
  val sumOfEvens = sumOfEvenNumbers(numbers)
  println(s"The sum of even numbers in the list is: $sumOfEvens")
}


