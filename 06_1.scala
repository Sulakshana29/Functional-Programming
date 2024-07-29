import scala.io.StdIn.readInt

object InventorySystem {
  def main(args: Array[String]): Unit = {
    // Sample inventories represented as Maps
    val inventory1: Map[Int, (String, Int, Double)] = Map(
      101 -> ("ProductA", 50, 25.0),
      102 -> ("ProductB", 30, 35.0),
      103 -> ("ProductC", 20, 45.0)
    )

    val inventory2: Map[Int, (String, Int, Double)] = Map(
      102 -> ("ProductB", 10, 40.0),
      103 -> ("ProductC", 25, 40.0),
      104 -> ("ProductD", 60, 30.0)
    )

    // I. Retrieve all product names from inventory1
    def getAllProductNames(inventory: Map[Int, (String, Int, Double)]): List[String] = {
      inventory.values.map(_._1).toList
    }

    val productNames = getAllProductNames(inventory1)
    println("Product names in inventory1: " + productNames.mkString(", "))

    // II. Calculate the total value of all products in inventory1
    def calculateTotalValue(inventory: Map[Int, (String, Int, Double)]): Double = {
      inventory.values.map { case (_, quantity, price) => quantity * price }.sum
    }

    val totalValue = calculateTotalValue(inventory1)
    println("Total value of all products in inventory1: $" + totalValue)

    // III. Check if inventory1 is empty
    def isInventoryEmpty(inventory: Map[Int, (String, Int, Double)]): Boolean = {
      inventory.isEmpty
    }

    val isEmpty = isInventoryEmpty(inventory1)
    println("Is inventory1 empty? " + isEmpty)

    // IV. Merge inventory1 and inventory2, updating quantities and retaining the highest price
    def mergeInventories(inventory1: Map[Int, (String, Int, Double)], inventory2: Map[Int, (String, Int, Double)]): Map[Int, (String, Int, Double)] = {
      (inventory1.keySet ++ inventory2.keySet).map { id =>
        val prod1 = inventory1.get(id)
        val prod2 = inventory2.get(id)

        val merged = (prod1, prod2) match {
          case (Some((name1, qty1, price1)), Some((name2, qty2, price2))) =>
            (name1, qty1 + qty2, math.max(price1, price2))
          case (Some((name, qty, price)), None) => (name, qty, price)
          case (None, Some((name, qty, price))) => (name, qty, price)
          case _ => throw new Exception("Unreachable code")
        }
        id -> merged
      }.toMap
    }

    val mergedInventory = mergeInventories(inventory1, inventory2)
    println("Merged Inventory: " + mergedInventory)

    // V. Check if a product with a specific ID exists and print its details
    def printProductDetails(inventory: Map[Int, (String, Int, Double)], productId: Int): Unit = {
      inventory.get(productId) match {
        case Some((name, quantity, price)) =>
          println(s"Product ID: $productId, Name: $name, Quantity: $quantity, Price: $price")
        case None =>
          println(s"Product with ID $productId not found in inventory")
      }
    }

    println("Enter the Product ID to search:")
    val productId = readInt()

    printProductDetails(inventory1, productId)
  }
}
