import scala.io.StdIn.readInt

object PatternMatchingExample{
    def main(args: Array[String]): Unit = {

        println("Enter an integer:")
        val input = readInt()

        val isEven = (x: Int) => x%2 == 0
        val isOdd = (x: Int) => x%2 != 0

        input match{
            case x if x<=0 => println("Negative/Zero is input")
            case x if isEven(x) => println("Even number is given")
            case x if isOdd(x) => println("Odd number is given")
        }


    }
}