object Practical02_1 {
  def main(args: Array[String]): Unit = {
      var i, j, k = 2;
      val m, n = 5;
      val f = 12.0f;
      val g = 4.0f;
      val c = 'X';

      val a = k + 12 * m;
      println(s"a) k + 12 * m = $a");

      val b = m/j;
      println(s"b) m / j = $b");

      val y = n % j;
      println(s"c) n % j = $y");

      val d = m / j * j;
      println(s"d) m / j * j = $d");

      val e = f + 10 * 5 + g;
      println(s"e) f + 10 * 5 + g = $e");

      i += 1;
      val x = i * n;
      println(s"f) ++i * n = $x");

  }
}