import cats.Monoid

case class Cow(name: String, age: Int)


val cowMonoid: Monoid[Cow] = new Monoid[Cow] {

  override val empty: Cow = Cow("", 0)

  override def combine(x: Cow, y: Cow): Cow =
    Cow(x.name + y.name, x.age + y.age)
}

val daniela = Cow("muuu", 5)

cowMonoid.combineAll(List(daniela, cowMonoid.empty, cowMonoid.empty))


val a = List(1,2,3,4,5,6)

val listMonoid: Monoid[List[Int]] = new Monoid[List[Int]] {

  override def empty: List[Int] = List.empty

  override def combine(x: List[Int], y: List[Int]): List[Int] =
    x ++ y
}

listMonoid.combine(a, List())





















