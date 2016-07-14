object worksheet {

  // gretting is equal to h.concat(w)
  val greeting = {
    val h = "Hello "
    val w = "World "
    h.concat(w)
  }

  // anotherGretting is empty (Unit), it's because the last line is an assignment
  val anotherGreeting = {
    val h = "Hello "
    val w = "World "
    val message = h.concat(w)
  }
}