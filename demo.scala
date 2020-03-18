object demo{

  // makes a new customer to track with a name and list of purchases
  class Customer{
    var name: String = _
    var purchases: List[Purchase] = Nil
    }

  // each purchase has an id and a list of clothes contained
  class Purchase{
    var id: Int = _
    var clothes: List[Item] = Nil
  }

  // each item tracks its characteristics and doesn't need manual getters/setters
  class Item{
    var id: Int = _
    var style: String = _
    var price: Int = _
    var kind: String = _
  }

  def main(args: Array[String]) {
      println("Welcome Customer!")
  }
}
