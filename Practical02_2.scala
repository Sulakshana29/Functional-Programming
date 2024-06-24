object Practical02_2{
    def main(args: Array[String]):Unit = {
        var a = 2;
        var b = 3;
        var c = 4;
        val d = 5;
        val k = 4.3f;
        val g = 1.0f

        val x = b*a + c*d
        println(s"a)$x")

        println(s"b) $a")
        a += 1

        val y = -2*(g-k)+c
        println(s"c) $y")

        println(s"d) $c")
        c += 1

        c += 1
        val z = c*a
        println(s"e) $z")
        a += 1
        
    }
}