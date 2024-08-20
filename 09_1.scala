import scala.io.StdIn._

object InterestCalc{

    val rate1: Double => Double = deposit => deposit*0.02
    val rate2: Double => Double = deposit => deposit*0.04
    val rate3: Double => Double = deposit => deposit*0.035
    val rate4: Double => Double = deposit => deposit*0.065

    def calcInterest(deposit: Double): Double = deposit match{
        case d if d <= 20000 => rate1(d)
        case d if d <= 200000 => rate2(d)
        case d if d <= 2000000 => rate3(d)
        case d if d > 200000 => rate4(d)
    }
    
    def main(args: Array[String]): Unit = {
    println("Enter the deposit amount (in Rs.):")

    try {
      val input = readLine()
      val deposit = input.toDouble

      if (deposit < 0) {
        println("Deposit amount cannot be negative")
      } else {
        val interest = calcInterest(deposit)
        println(f"Deposit: Rs. ${deposit}, Interest: Rs. ${interest}%.2f")
      }
    } catch {
      case e: NumberFormatException => println("Invalid input. Please enter a valid number.")
    }
  }
    
}