import scala.io.StdIn.readLine

object InventoryManagement {

  // Function to get the list of products from user input
  def getProductList: List[String] = {
    var products = List.empty[String]
    var input = ""
    while(input.toLowerCase != "done"){
        input = readLine("Enter product name(type done to finish): ")
        if(input.toLowerCase != "done"){
            products = products :+ input
        }
    }
    products
  }

  // Function to print the product list with positions
  def printProductList(products: List[String]): Unit = {
        for(i <- products.indices){
            println(s"${i+1}. ${products(i)}")
        }
    }
  

  // Function to get the total number of products
  def getTotalProducts(products: List[String]): Int = {
    products.length
  }

  def main(args: Array[String]): Unit = {
    // Get the list of products from the user
    val productList = getProductList

    // Print the list of products
    println("Product List:")
    printProductList(productList)

    // Print the total number of products
    println(s"Total number of products: ${getTotalProducts(productList)}")
  }
}
