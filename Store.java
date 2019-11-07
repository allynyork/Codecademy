public class Store {
  // instance fields
  String productType;
  int inventoryCount;
  double inventoryPrice;
  
  // new method: constructor!
  public Store(String product, int count, double price) {
    System.out.println("I am inside the constructor method.");
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
  }
  
  // main method is where we create instances!
  public static void main(String[] args) {
    System.out.println("Start of the main method.");
    
    // create the instance below
    Store lemonadeStand = new Store("Lemonade", 5, 1.25);
    System.out.println(lemonadeStand.productType);
    // print the instance below
    System.out.println(lemonadeStand);

    Store cookieShop = new Store("cookies", 12, 3.75);
    System.out.println("We have " + cookieShop.inventoryCount + " " + cookieShop.productType + " for $" + cookieShop.inventoryPrice + " each");
    
  }
}