class Rational(n: Int, d: Int){
    require(d  != 0, "Denominator cannot be zero")

    private val g = gcd(n.abs, d.abs)
    val numer: Int = n/g
    val denom: Int = d/g

    def neg: Rational = new Rational(-numer, denom)

    private def gcd(a:Int, b:Int):Int = if(b==0) a else gcd(b, a%b)

    override def toString: String = s"$numer/$denom"

}

object RationalTest extends App{
    val x = new Rational(3, 4)
    println(s"Rational number: $x")
    println(s"Negated Rational number: ${x.neg}")
}