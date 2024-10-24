import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    /*
     * Creates a Scanner object - feel free to delete if not using!
     */
    Scanner input = new Scanner(System.in);


    MakeupProduct mp = new MakeupProduct("Rare Beauty", 10.00, 10);
    System.out.println(mp);

    Blush blush = new Blush("Roses R Red", 9.00, 15, true, "red");
    System.out.println(blush);

    Eyeshadow es = new Eyeshadow("Storm", 8.00, 12, "Grey", "Glitter");
    System.out.println(es);

    /*
     * Closes the Scanner object
     */ 
    input.close();
  } 
  }