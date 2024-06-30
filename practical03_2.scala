import scala.io.StdIn.readLine
object StringFilter{
    def main(args: Array[String]):Unit = {
        println("Enter the number of strings: ")
        val n = readLine().toInt

        var inputStrings: List[String] = List()
        for(i <- 1 to n){
            println(s"Enter string $i: ")
            val input = readLine()
            inputStrings = inputStrings :+ input
        }

        val newStrings = filterStrings(inputStrings)
        println(s"Original List: $inputStrings")
        println(s"Filtered List(length > 5): $newStrings")
    }
}

def filterStrings(strings: List[String]): List[String]={
    strings.filter(_.length > 5)
}