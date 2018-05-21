object P1LastElementofList {
    /*
    1. To find the last element of the list
    */

  // Getting the last element from default 'last' method of Scala List
  def imperativeLast[A](l:List[A]):A = l.last

  // Functional approach to get 'last' element of lisT. This is example of TAIL RECURSION.

  def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: taiil => last(taiil)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
  }
}
