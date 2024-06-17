object Practical01 {
  def main(args: Array[String]): Unit = {
    println("The area of the disk is "+area(5))
    println("The Fahrenheit temperature is "+Ftemp(35))
    println("The Volume of the sphere is "+Volume(5))
    println("The total wholesale cost for 60 copies is Rs"+wholesaleCost(60))
    println("The total running time is "+totalTime)
  }
}

def area(radius: Double):Double = 3.14*radius*radius

def Ftemp(Ctemp: Double):Double = Ctemp*1.8000+32.00

def Volume(radius: Double):Double = 4/3*3.14*radius*radius*radius

def bookPrice(x:Int):Double = 24.95*x;//x is the no of copies
def discount(price:Double):Double = price*0.4
def shippingCost(x:Int):Double = 3*x + (x-50)*0.75
def wholesaleCost(x:Int):Double = bookPrice(x)-discount(bookPrice(x)) + shippingCost(x)

def easyPace(d:Int):Int = 8*d
def tempo(d:Int):Int = 7*d
def totalTime:Int = easyPace(2)+tempo(3)+easyPace(2)
