// Exploring methods
public class Business {
  // instance fields
  String productType;
  
  // constructor method
  public Business(String product) {
    productType = product;
  }
  
  // In between the constructor and the main() method add class methods
  public void advertise(){
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType +"!");
  }
  // main method
  public static void main(String[] args) {
    Business lemonadeStand = new Business("Lemonade");
    // For loops have similar construction, just need to specify var type as always
    for (int i = 0; i < 3; i++) {
        lemonadeStand.advertise();
    };
  }
}