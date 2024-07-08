object NameFormat{
    def toUpper(str:String): String = str.toUpperCase()
    def toLower(str:String): String = str.toLowerCase()
    def formatNames(name: String)(formatFunc: String => String): String = formatFunc(name)

    def main(args: Array[String]): Unit = {
    val names = List("Benny", "Niroshan", "Saman", "Kumara")

    def Format1(name: String): String = toUpper(name)
    def Format2(name: String): String = toUpper(name.substring(0, 2)) + toLower(name.substring(2))
    def Format3(name: String): String = toLower(name)
    def Format4(name: String): String = toUpper(name.substring(0, 1)) + toLower(name.substring(1, 5)) + toUpper(name.substring(5))

    println(formatNames(names(0))(Format1)) 
    println(formatNames(names(1))(Format2))  
    println(formatNames(names(2))(Format3))  
    println(formatNames(names(3))(Format4))  
}
}