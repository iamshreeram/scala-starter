import P1LastElementofList.last

object P2LastButOneElementofList {

  /* Procedural :
  A smart way to solve the problem is to consider that the penultimate element of a list of n elements is the
  last element of the first (n - 1) elements. Scala provides a method called "init()" which
  returns all elements except the last.
 */

  // init() --> Returns all elements except the last
  def defaultPenultimate[A](l:List[A]):A = {
    if (l.isEmpty) throw new NoSuchElementException
    l.init.last //"init()" which returns all elements except the last
  }

  // takeRight() --> Selects the last n elements from the list.
  def defaultlastNth[A](n: Int, l: List[A]): A = {
    if (n <= 0) throw new IllegalArgumentException
    if (n > l.length) throw new NoSuchElementException
    l.takeRight(n).head
  }

  //Recursive approach

  /*
  Explanation : 
  The exit case is when the list is composed by a head element and a tail made by a list of one single element.
  The pattern matching syntax can express this situation with the h :: List(t) syntax. The standard case is when
  the tail is still a generic list and the last case covers all edge cases.
  */

  def penultimate[A](l:List[A]):A = l match {
    case h :: List(t) => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  //Example of Pattern Guard --> Pattern guards are simply conditional expressions that rule the application of a pattern.

  def lastNthPatternGuard[A](n: Int, l:List[A]): A = l match {
    case tail if (tail.length == n) => tail.head
    case _ :: tail => lastNthPatternGuard(n, tail)
    case _ => throw new NoSuchElementException
  }


  def main(args: Array[String]): Unit = {
    //println(defaultPenultimate(List(1,2,3,4,5)))
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
