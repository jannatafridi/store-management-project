public class Eyeshadow extends MakeupProduct{

  /*
   * instance variables
   */ 
  private String color;
  private String texture;

  /*
   *  no argument constructor
   */
  public Eyeshadow() {
    super("no name", 5.0, 1);
    color = "Grey";
    texture = "Glitter";
  }
  /*
   * Parameterized Constructor
   */ 
  public Eyeshadow(String name, double price, int quantity, String color, String texture) {
    super(name, price, quantity);
    this.color = color;
    this.texture = texture;
}
  public Eyeshadow(String name, double price, int quantity, String color) {
    super(name, price, quantity);
    this.color = "Grey";
    this.texture = "Glitter";
   }
  /*
   * Parameterized Constructor
   */
  public String getColor() {
    return color;
  }
  public String getTexture() {
    return texture;
}
  /*
   * Mutator Method
   */ 
  public void setColor(String color) {
    this.color = color;
  }
  public void setTexture(String texture) {
    this.texture = texture;
  }
  /*
   *  toString Method
   */
   public String toString() {
     return super.toString() + "\nColor:  " + color + "\nTexture: " + texture;
   }
}