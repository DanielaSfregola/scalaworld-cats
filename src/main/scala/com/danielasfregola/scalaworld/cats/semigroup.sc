val a = Map(1 -> "hello", 2 -> "scala")
val b = Map(1 -> "world", 3 -> "Jon for President")

 a ++ b
b ++ a

import cats.Semigroup
import cats.implicits._
import cats.syntax._

a |+| b
b |+| a


val aa = Map(1 -> List(1,2,3,4), 2 -> List(5,6,7,8,9))
val bb = Map(1 -> List(42))

aa |+| bb

 Option(List(1,2,3)) |+| Option(List(3,4,6))

case class Sheep(name: String, legs: Int = 4)


 implicit val sheepSemigroup: Semigroup[Sheep] = new Semigroup[Sheep] {

  override def combine(x: Sheep, y: Sheep): Sheep = {
   val name = s"New Sheep son of ${x.name} and ${y.name}"
   val legs = Math.max(x.legs, y.legs)
   Sheep(name, legs)
  }

 }

val jonSheep = Sheep("Jon", 2)
val danielaSheep = Sheep("Daniela", 4)

jonSheep |+| danielaSheep






















