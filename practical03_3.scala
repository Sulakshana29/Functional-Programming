def calculateArithmeticMean(num1:Int, num2:Int): Double ={
    val mean = (num1+num2).toDouble / 2
    BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
}

object ArithmeticMean{
    def main(args: Array[String]):Unit = {
        val num1 = 12
        val num2 = 15
        val average = calculateArithmeticMean(num1, num2)
        println(s"The arithmetic mean of $num1 and $num2 is $average")
    }
}