import P1LastElementofList.last

object P2LastButOneElementofList {

  /* Procedural :
    A smart way to solve the problem is to consider that the penultimate element of a list of n elements is the
    last element of the first (n - 1) elements. Scala provides a method called "init()" which
    returns all elements except the last.
   */
  // init() --> Default method
  def defaultPenultimate[A](l:List[A]):A = {
    if (l.isEmpty) throw new NoSuchElementException
    l.init.last //"init()" which returns all elements except the last
  }

  def penultimate[A](l:List[A]):A = l match {
    case h :: List(t) => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    //println(defaultPenultimate(List(1,2,3,4,5)))
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
