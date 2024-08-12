object NumberCategorizer {
    def main(args: Array[String]):Unit = {
        //check if the input is provided
        if(args.length!= 1){
            println("Please provide exactly one integer arguement.")
            sys.exit(1)
        }

        //Try to parse the input as am integer
        val numberOpt = try {
            Some(args(0).toInt)
        } catch {
            case e: NumberFormatException => 
                println("Invalid input. Please provide an integer.")
                None
        }

        //Process the input if it's a valid integer
        numberOpt.foreach{number =>
            val categorize = (n: Int)=> n match {
                case x if x%3 == 0 && x%5 == 0 => "Multiple of both three and five"
                case x if x%3 == 0 => "Multiple of three"
                case x if x%5 == 0 => "Multiple of five"
                case _ => "Not a multiple of three or five"
            }

            println(categorize(number))
        }
    }
}