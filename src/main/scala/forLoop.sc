import java.io.File

val filesHere = (new File(".")).listFiles
for (file <- filesHere if file.getName.endsWith(".scala")) println(file)

def fileLines(file: File) =
  scala.io.Source.fromFile(file).getLines().toArray

def scalaFiles =
  for {
    file <- filesHere
    if file.getName.endsWith(".scala")
    line <- fileLines(file)
    trimmed = line.trim
    if trimmed.matches(".*for.*")
  } yield trimmed.length

scalaFiles