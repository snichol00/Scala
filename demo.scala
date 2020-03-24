import scala.collection.mutable.ListBuffer
object demo{

  // makes a new customer to track with a name and list of purchases
  class Customer(val name : String, val age: Int){
    var purchases = new ListBuffer[Purchase]()
    def addPurchase(newPurchase : Purchase) : Unit = purchases += newPurchase
    def seePurchases() : Unit = for (purchase <- purchases) println(purchase.name)
   }

  // each purchase has an id and a list of clothes contained
  class Purchase(val name : String){
    var id: Int = _
    var clothes: List[Item] = Nil
    def seePurchase : Unit = println(this.name) 
  }

  // each item tracks its characteristics and doesn't need manual getters/setters
  class Item(){
    var id: Int = _
    var style: String = _
    var price: Int = _
    var kind: String = _
  }

  def main(args: Array[String]) : Unit = {
      val m = new Customer("Becky", 103)
      println("We've got a new customer, " + m.name + " who is " + m.age + " years old")
      var p = new Purchase("boots")
      var pu = new Purchase("socks")
      var pur = new Purchase("purrellli")
      m.addPurchase(p)
      m.addPurchase(pu)
      m.addPurchase(pur)
      println("Becky has copped :")
      m.seePurchases()
  }
}
