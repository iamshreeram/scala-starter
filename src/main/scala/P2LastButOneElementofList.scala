import P1LastElementofList.last

object P2LastButOneElementofList {

  def penultimate[A](l:List[A]):A = l match {
    case h :: List(t) => h
    case _ :: tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }

  def main(args: Array[String]): Unit = {
    //println(lastButOne(List(1,2,3,4,5)))
    println(penultimate(List(1, 1, 2, 3, 5, 8)))
  }
}
