object Main extends App {
//   this is part 1 without singleton object
  var x = new ChecksumAccumulator
  x.add('a'.toByte)
  println(x.checksum())
  // this is with singleton object
  println(ChecksumAccumulator.calculate("nieko sau kodas aha"))
  print("aas")
  print("lol")
}
