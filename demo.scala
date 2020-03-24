import scala.collection.mutable.ListBuffer
object demo{

  // makes a new customer to track with a name and list of purchases
  case class Customer(val name : String, var purchases : List[Purchase]){
    def seePurchases() : Unit = for (purchase <- purchases) println(purchase.name)
  }

  // each purchase has an id and a list of clothes contained
  class Purchase(var name : String, var id : Int, var price : Int, var clothes: List[Item] = Nil){
    def this(n : String)= {
      this(n, 0, 0, null)
    }
  }

  // each item tracks its characteristics
  class Item(var id : Int, var style : String, var price : Int, var kind : String)

  def main(args: Array[String]) : Unit = {
      var p = new Purchase("boots")
      var pu = new Purchase("socks")
      var pur = new Purchase("purrellli")
      var pList = List(p, pu, pur)
      val m = new Customer("Becky", pList)
      println("We've got a new customer, " + m.name)
      println("Becky has copped :")
      m.seePurchases()
  }
}
