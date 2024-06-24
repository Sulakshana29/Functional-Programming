object Practical02_3{
    def main(args: Array[String]):Unit = {
        val gross = grossSalary(40, 30)
        val takeHome = takeHomeSalary(40, 30)
        val tax = calTax(gross)
        println(s"Gross Salary is Rs.$gross")
        println(s"tax is Rs.$tax")
        println(s"Take-home salary for an employee for a week is Rs.$takeHome")
    }

}

def grossSalary(normalHours: Int, otHours: Int): Double = {
    normalHours * 250.00 + otHours * 85.00
}

def calTax(gross : Double): Double = {
    gross * 0.12;
}

def takeHomeSalary(normalHours: Int, otHours: Int): Double = {
    val gross = grossSalary(normalHours, otHours)
    val tax = calTax(gross)
    gross - tax
}