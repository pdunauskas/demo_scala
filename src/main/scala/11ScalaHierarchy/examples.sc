class test {
  def x(): Int = 5
//  final def a(): Int = 10
}
class testHelper extends test {
  def y(): Int = 6
  override def x(): Int = 7
//  override def a(): Int = 11 // can not override, because of final

}

val a = new testHelper
a.x()
a.y()
//a.a()


// define tiny types
class Title(val value: String) extends AnyVal
class Anchor(val value: String) extends AnyVal

def printFormat(title: Title, anchor: Anchor): Unit = {
  print (s"The title is ${title.value} and anchor is ${anchor.value}")
}

printFormat(new Title("This is"), new Anchor("Sparta"))
print(new Title("oplia one"))


// this will just output string instead of using value directly
class Title2(val value: String) extends AnyVal {
  override def toString: String = value
}

print(new Title2("oplia two"))
class Anchor(val value: String) extends AnyVal


// error because of wrong types:
//printFormat(new Anchor("This is"), new Anchor("Sparta"))
