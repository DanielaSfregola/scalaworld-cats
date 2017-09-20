Array(1,2,3,4).toString()

List(1, 2, 3, 4).toString()

import cats.Show
import cats.implicits._

def showMe[A](a: A)(implicit ev: Show[A]) =
  ev.show(a)


showMe(5)

case class ScalaWorld(a: Int, b: String)

implicit val showScalaWorld: Show[ScalaWorld] = new Show[ScalaWorld] {

  override def show(t: ScalaWorld): String =
    s"I was at Scala World and I did some ${t.a} stuff doing ${t.b}"
}

showMe(ScalaWorld(1, "hello"))
