import scala.io.StdIn

object FilterPrime{
    def isPrime(n: Int): Boolean = {
        if (n<=1) false
        else if (n==2) true
        else if (n%2 == 0) false
        else{
            val limit = math.sqrt(n).toInt
            !(3 to limit by 2).exists(d => n%d == 0)
        }
    }

    def filterPrime(numbers: List[Int]): List[Int] = {
        numbers.filter(num => isPrime(num))
    }


    def main(args: Array[String]) : Unit = {
        println("Enter a list of integers seperated by spaces: ")

        val inputLine = StdIn.readLine()
        val inputList = inputLine.split("\\s+").map(_.toInt).toList

        val primeNumbers = filterPrime(inputList)

        println(s"Input List: $inputList")
        println(s"Prime numbers: $primeNumbers")
    }
}