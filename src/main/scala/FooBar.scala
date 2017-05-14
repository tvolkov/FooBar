package scala

case class FooBar(x: Integer)

object FooBarTest{
  def main(args: Array[String]): Unit = {
    val optionsArray = for (i <- 1 to 100) yield Option(FooBar(i))
    for (opt <- optionsArray) println (getFooBar(opt))
  }

  def getFooBar(option: Option[FooBar]): String = {
    (option.get.x % 3, option.get.x % 7, option.get.x) match {
      case (0, 0, _) => "foobar"
      case (0, _, _) => "foo"
      case (_, 0, _) => "bar"
      case _ => "" + option.get.x
    }
  }
}