public class MakeupProduct {

/*
 * instance variable
 */ 
  private String name;
  private double price;
  private int quantity;

  /*
   * no argument constructor
   */
  public MakeupProduct() {
name = "no name";
    price = 5.0;
    quantity = 1;
    
  }
    // parameterize constructor
  public MakeupProduct(String name, double price, int quantity) {
this.name = name;
 this.price = price;
    this.quantity = quantity;
  }
  
  // accessor method for name
  public String getName() {
    return name;
  }
  
  // mutator method for name
  public void setName(String name) {
    this.name = name;
  }
  
  //accessor method for price
  public double getPrice() {
    return price;
  }
  
//mutator method for price
  public void setPrice(double price) {
    this.price = price;
  }

//accessor method for quantity
  public int getQuantity() {
    return quantity;
  }

/*
mutator method for quantity
  public void setQuantity(int quantity) {
    this.quantity = quantity; 
  }
  

  /*
   * toString method for superclass
   */
  public String toString() {
    return "Name: " + name + "\nPrice: $" + price + "\nQuantity: " + quantity;
  }
}