object Practical02_4{
    def main(args: Array[String]):Unit = {
      println("profit when ticket price Rs.5 is Rs."+profit(5))
      println("profit when ticket price Rs.10 is Rs."+profit(10))
      println("profit when ticket price Rs.15 is Rs."+profit(15))
      println("profit when ticket price Rs.20 is Rs."+profit(20))
      println("profit when ticket price Rs.25 is Rs."+profit(25))
      println("profit when ticket price Rs.30 is Rs."+profit(30))
      println("profit when ticket price Rs.35 is Rs."+profit(35))
      println("profit when ticket price Rs.40 is Rs."+profit(40))
    }
}
def attendees(price: Int): Int = 120 + (15 - price)/5*20

def revenue(price: Int): Int = {
  attendees(price) * price
}

def cost(price: Int): Int = {
  500 + 3 * attendees(price)
}

def profit(price: Int): Int = {
  revenue(price) - cost(price)
}


