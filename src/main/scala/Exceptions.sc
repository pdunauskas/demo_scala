/*
val n = 4
val half =
  if (n % 2 == 0)
    n / 2
else
    throw new RuntimeException("n must be even")
*/

import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

try {
    val f = new FileReader("input.txt")
    f.read()
    f.close()
}
catch {
    case ex: FileNotFoundException => println("missing file")
    case ex: IOException => println("i/o error")
}
finally {
    println("Close fucking file")
}

// be carefull about finally statement behavior
def f() : Int = try return 1 finally return 2
print(f()) // returns 2
def g(): Int = try 1 finally 2
print(g()) // returns 1
