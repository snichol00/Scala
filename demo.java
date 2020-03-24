import java.util.ArrayList;
import java.util.List;

class demo{

  // private variables are better practice in case the developer wants to change accessing rights, but this comparison shows how cumbersome it can be in java
  public class Customer{

    // stores each customer's name and a list of all of their transactions
    private String name;
    private List<Purchase> purchases;

    // creates an array of transactions for each customer
    public Customer(){
      purchases = new ArrayList<Purchase>();
    }

    // returns customer's name
    public String getName(){
      return name;
    }

    // change customer's name
    public void setName(String name){
      this.name = name;
    }

    // return a list of their transations
    public List<Purchase> getPurchases(){
      return purchases;
    }

    // change their transactions
    public void setPurchases(List<Purchase> purchases){
      this.purchases = purchases;
    }
  }

  // records the information for every order made to the store
  public class Purchase{
    private int id;
    private int price;
    private List<Item> clothes;

    // makes an array to contain a list of the clothes they bought
    public Purchase(){
        clothes = new ArrayList<Item>();
    }

    // returns transaction id
    public int getId(){
        return id;
    }

    // resets transaction id
    public void setId(int id){
        this.id = id;
    }

    // returns a array of the clothes in that purchase
    public List<Item> getClothes(){
        return clothes;
    }

    // change clothes purchased
    public void setClothes(List<Item> clothes){
        this.clothes = clothes;
    }
  }

  // tracks info about each article of clothing purchased
  public class Item{
    private int id;
    private String style;
    private int price;
    private String type;

    // returns id of the article of clothing
    public int getId(){
        return id;
    }

    // changes clothing id
    public void setId(int id){
        this.id = id;
    }

    // returns descriptive info, so the store can track trends
    public String getStyle(){
        return style;
    }

    // changes style
    public void setStyle(String style){
        this.style = style;
    }

    // returns price of an article of clothing
    public int getPrice(){
        return price;
    }

    // changes price
    public void setPrice(int price){
        this.price = price;
    }

    // returns whether the customer bought a shirt, dress, shorts, shoes, etc
    public String getType(){
        return type;
    }

    // changes the type of clothing purchased
    public void setType(String type){
        this.type = type;
    }
  }

  public static void main(String[] args) {
    System.out.println("Welcome Customer!");
  }
}
