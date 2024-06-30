import scala.io.StdIn.readLine
object StringReverser{
    def main(args: Array[String]):Unit = {
    println("Enter a string:")
    val originalString = readLine();
    val reversedString = reverseString(originalString)
    println(s"Original String: $originalString")
    println(s"Reversed String: $reversedString")
}
}

def reverseString(input: String): String ={
        if(input.isEmpty) ""
        else reverseString(input.tail) + input.head
    }