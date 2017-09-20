val a = Option(1) //Some(1)
val b = Option(1)

val aa = Some(1)

import cats.Eq
import cats.implicits._
import cats.syntax._
import cats.instances.option._

//implicit val eqOption: Eq[Option[Int]] = ???

a === b
1 === 2

//aa === b
