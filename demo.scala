class Customer{
  var name: String = _
  var purchases: List[Purchase] = Nil
}

class Purchase{
  var id: Int = _
  var clothes: List[Item] = Nil
}

class Item{
  var id: Int = _
  var style: String = _
  var price: Int = _
  var type: Int = _
}
