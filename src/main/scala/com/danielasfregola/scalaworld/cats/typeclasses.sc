trait Yo[A] {

  def yoBro(a: A): Unit

}

implicit val intYo: Yo[Int] = new Yo[Int] {
  override def yoBro(a: Int): Unit = println("1 + 2 bro")
}


