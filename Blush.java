public class Blush extends MakeupProduct {

/*
 * instance variables
 */ 
  private boolean isLiquid;
  private String shade;

  /*
   * no argument constructor methods
   */
  public Blush() {
    super("no name", 5.0, 1);
    isLiquid = true;
    shade = "pink";
  }
  /*
   * Parameterized Constructor
   */ 
  public Blush(String name, double price, int quantity, boolean isLiquid, String shade) {
    super(name, price, quantity);
    this.isLiquid = isLiquid;
    this.shade = shade;
  }
   public Blush(String name, double price, int quantity, String shade) {
    super(name, price, quantity);
    this.isLiquid = true;
    this.shade = "pink";
   }
  /*
   * Parameterized Constructor
   */
  public boolean getIsLiquid() {
    return isLiquid;
  }

  public String getShade() {
    return shade;
  }

  /*
   * Mutator Method
   */ 
  public void setIsLiquid(boolean isLiquid) {
    this.isLiquid = isLiquid;
  }
  public void setShade(String shade) {
    this.shade = shade;
  }

  /*
   *  toString Method
   */
   public String toString() {
     return super.toString() + "\nIs it Liquid? " + isLiquid + "\nShade: " + shade;
   }
}
