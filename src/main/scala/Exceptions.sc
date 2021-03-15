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

