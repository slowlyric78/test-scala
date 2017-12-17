package lyric.slow

object Main extends App {
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")

  println(s"sum: ${Utils.sum(2, 7)}")
}
