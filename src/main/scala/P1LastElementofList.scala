object P1LastElementofList {

    /* Without using For Loop
    1. To find the last element of the list
    1. To find the first element of the list
    */

  // Getting the last element with default 'last' method of Scala List
  def defaultLast[A](l:List[A]):A = l.last



  // Functional approach to get 'last' element of lisT. This is example of TAIL RECURSION.
  def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  /*  Explanation :

      The value returned by the function is l match {}, that the execution of the pattern matching
      block on the input variable l.

      The first pattern divides the list in two parts: one head element (h)
      and a tail formed by nothing. This is the case in which the input list has only one element.

      The second matching takes the tail of the list (the first element is not even stored, it is ignored
      using the _ wildcard) and calls itself on the remaining values.

      The last matching is selected when the first two fail, that is when the list is empty. In that case an
      exception shall be thrown to match the behaviour of the last() method. This is not mandatory, but is probably
      something that the programmer is accustomed to, so provided that we document it, it is a good convention to
      adhere to.

      In Scala the exception shall be created at the moment, just like a standard object, so the new keyword is
      needed before the name of the exception itself.
  */

  // Getting the first element with default 'head' method of Scala List
  def defaultFirst[A](l:List[A]):A = l.head


  // Functional approach to get 'last' element of lisT. This is example of TAIL RECURSION.
  def first[A](l:List[A]):A = l match {
    case List(firstelement, _*) => firstelement
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    println(last(List(1, 1, 2, 3, 5, 8)))
    println(first(List(1, 1, 2, 3, 5, 8)))
  }
}
