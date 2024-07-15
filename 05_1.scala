import scala.io.StdIn.readLine

object InventoryManagement {

  // Function to get the list of products from user input
  def getProductList: List[String] = {
    def promptProducts(acc: List[String]): List[String] = {
      val input = readLine("Enter product name (or type 'done' to finish): ")
      if (input.toLowerCase == "done") acc
      else promptProducts(acc :+ input)
    }
    promptProducts(List.empty[String])
  }

  // Function to print the product list with positions
  def printProductList(products: List[String]): Unit = {
    products.zipWithIndex.foreach {
      case (product, index) => println(s"${index + 1}. $product")
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
