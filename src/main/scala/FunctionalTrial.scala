object FunctionalTrial {

  def trymap={
    //var SampleMap=List({"Key"="Value"},{"What"="is"})
    //var SampleMap=List(12,65)

    var lis = List(Map("k1" -> "v1", "k2" -> "v2"))
    //println( "List of maps : " +lis )
    //println( "Flatten toMap : " +lis.flatten.toMap)
    var lis2 = List(Map("k3" -> "v3", "k4" -> "v4"))

    println(lis2+"Sample")
    println(lis2:::lis)
    println("Adds"::" element to begining of list : "::lis::" and "::lis2)
    //println(lis2.addString("Add string"))

  }

  def main(args: Array[String]):Unit={
    trymap
  }
}
