import scala.io.StdIn

object FilterEven{
    def filterEven(numbers: List[Int]): List[Int] = {
        numbers.filter(num => num%2 == 0)
    }

    def main(args: Array[String]) : Unit = {
        println("Enter a list of integers seperated by spaces: ")

        val inputLine = StdIn.readLine()
        val inputList = inputLine.split("\\s+").map(_.toInt).toList

        val evenNumbers = filterEven(inputList)

        println(s"Input List: $inputList")
        println(s"Even numbers: $evenNumbers")
    }
}