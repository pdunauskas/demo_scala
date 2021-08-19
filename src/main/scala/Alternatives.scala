object Alternatives {
//  def main(args: Array[String]): Unit = {
//    val firstArg = if (args.length > 0) args(0) else ""
//    firstArg match {
//      case "obuolys" => println("zalias")
//      case "braske" => println("raudona")
//      case "citrina" => println("geltona")
//      case _ => println("???")
//    }
//  }
def main(args: Array[String]): Unit = {
  val firstArg = if (args.length > 0) args(0) else ""
  val color = firstArg match {
    case "obuolys" => "zalias"
    case "braske" => "raudona"
    case "citrina" => "geltona"
    case _ => "???"
  }
  println(color)
}

}
