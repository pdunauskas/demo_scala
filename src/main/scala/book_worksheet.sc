import java.io.File

val s = "Hello, Paulius!"
// you can invoke methods like this
s charAt 3
s indexOf 'o'
s indexOf ('o', 1)
// instead of
s.charAt(3)
s.indexOf('o')
s.indexOf('o', 1)


val filesHere = (new File(".")).listFiles
for (file <- filesHere if file.getName.endsWith(".scala")) println(file)

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
  } yield file

