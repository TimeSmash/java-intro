// Similar to JS and Ruby, we have classes. Objects are instances of those classes.

//Objects have state: properties that are related to it in some way, like a bank account and its name, balance, interest rate...

//Objects also have behavior, actions they can perform. A bank account can deposit or withdraw money

// Classes are in UpperCamelCase
// Can inherit from superclass using extends followed by superclass name (ex. public class Sub extends Superclass)
// Can implement from interface, which is a collection of  abstract methods.
public class ClassIntro {
  //prev public class Store
  // instance fields
  //Fields listed first
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  //The arguments here are what the instance's fields will start off as
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    //An instance of store whose product is lemonade, inv count is 42, and price is .99
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}// Similar to JS and Ruby, we have classes. Objects are instances of those classes.

//Objects have state: properties that are related to it in some way, like a bank account and its name, balance, interest rate...

//Objects also have behavior, actions they can perform. A bank account can deposit or withdraw money

public class ClassIntro {
  // instance fields: things that every object wil have    
  //Fields listed first
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  //The arguments here are what the instance's fields will start off as
  public Store(String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    //An instance of store whose product is lemonade, inv count is 42, and price is .99
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}