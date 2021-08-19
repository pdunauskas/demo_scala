val someNumbers = List(1,2,0,-1,5,-5)
someNumbers.foreach((x: Int) => println(x))

someNumbers.filter((x: Int) => x > 0)
someNumbers.filter(_ > 0)
// partialy applied functions
someNumbers.foreach(println _)

def sum(a: Int, b: Int, c: Int) = a + b + c
val a = sum _
a(1,2,3)

val b = sum(1, _: Int, 2)
b(4)

// by name parameters
val assertionsEnabled = true
def myAssert(predicate: () => Boolean) =
  if (assertionsEnabled && !predicate())
    throw new AssertionError
//!! !evaluates after function call
myAssert(() => 5 > 3)

def myAssert(predicate: => Boolean) =
  if (assertionsEnabled && !predicate)
    throw new AssertionError
//!!! evaluates before
myAssert(5 > 3)
