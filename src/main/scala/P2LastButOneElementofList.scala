import P1LastElementofList.last

object P2LastButOneElementofList {

  /*
  def lastButOne[A](l:List[A]):A = {
    case head => head
    case _, LastButOneElement :: lastElement => LastButOneElement
    case _ => throw new NoSuchElementException
  }
*/

  /*
  def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }
  */

  def last[A](l:List[A]):A = l match {
    case h :: Nil => h
    case List(_, tail) => tail
    case _ :: tail => last(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    //println(lastButOne(List(1,2,3,4,5)))
    println(last(List(1,2,3,4,5)))
  }
}
