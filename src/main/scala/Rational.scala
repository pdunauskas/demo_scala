class Rational (n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1)

  def + (that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  def * (that: Rational): Rational =
    new Rational(
      numer * that.numer, denom * that.denom
    )

  override def toString: String =
    if (numer == denom) s"$numer" else s"$numer/$denom"

  private def gcd(a: Int, b: Int): Int =
    if (b == 0) a else gcd(b, a % b)
}
object Rational extends App {
  val r = new Rational(2, 3)
  val t = new Rational(1, 3)

  println(r.toString)
  println(t.toString)
  println((r+t).toString)

  println((r*t).toString)
  implicit def intToRational(x: Int): Rational = new Rational(x)
  println((2*r).toString)

}