import scala.io.StdIn

object CalculateSquare{
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(num => num * num)
    }

    def main(args: Array[String]) : Unit = {
        println("Enter a list of integers seperated by spaces: ")

        val inputLine = StdIn.readLine()
        val inputList = inputLine.split("\\s+").map(_.toInt).toList

        val squareNumbers = calculateSquare(inputList)

        println(s"Input List: $inputList")
        println(s"Squarednumbers: $squareNumbers")
    }
}