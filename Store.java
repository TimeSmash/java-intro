// Similar to JS and Ruby, we have classes. Objects are instances of those classes.

//Objects have state: properties that are related to it in some way, like a bank account and its name, balance, interest rate...

//Objects also have behavior, actions they can perform. A bank account can deposit or withdraw money

// Classes are in UpperCamelCase
// Can inherit from superclass using extends followed by superclass name (ex. public class Sub extends Superclass)
// Can implement from interface, which is a collection of  abstract methods.


public class Store {
  // instance fields
  //Fields listed first
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // constructor method
  //The arguments here are what the instance's fields will start off as
  public Store(String product, int count, double price) {
    // public is an access level modifier that allows other classes to interact with this class
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method
  public static void main(String[] args) {
    //An instance of store whose product is lemonade, inv count is 42, and price is .99
    //main() method lists the tasks performed by the program. main() runs when we execute the compiled .class file.
    //We create instances by calling or invoking the constructor within main()
    
    // We invoke the constructor method: Store(), and use the keyword new to indicate that we’re creating an instance. 
    Store lemonadeStand = new Store("lemonade", 42, .99);
    Store cookieShop = new Store("cookies", 12, 3.75);
    
    System.out.println("Our first shop sells " + lemonadeStand.productType + " at " + lemonadeStand.inventoryPrice + " per unit.");
    
    System.out.println("Our second shop has " + cookieShop.inventoryCount + " units remaining.");
  }
}
// Running the program invokes main()
// We create an instance so we move from main() to Store()
// The code inside Store() runs
// When Store() finishes execution, we return to main()

// Similar to JS and Ruby, we have classes. Objects are instances of those classes.

//Objects have state: properties that are related to it in some way, like a bank account and its name, balance, interest rate...

//Objects also have behavior, actions they can perform. A bank account can deposit or withdraw money

//Objects also have identity, a unique name. A bank account has a certain ID and can interact with other accounts

// When an object of a class is created, the class is said to be instantiated. All the instances share the attributes and the behavior of the class. But the values of those attributes, i.e. the state are unique for each object. A single class may have any number of instances.
