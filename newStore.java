public class newStore {
  // instance fields
  String productType;
  double price;
  
  // constructor method
  public newStore(String product, double initialPrice) {
    productType = product;
    price = initialPrice;
  }
  
  // advertise method
  // method prints, and utilizes class instance variable productType
  public void advertise() {
    System.out.println("Come spend some money!");
    System.out.println("Selling " + productType + "!");
  }

  // greetCustomer method
  // method is accessible by other classes e.g. public, does not have a return e.g. void, and accepts a String parameter called customer
  public void greetCustomer(String customer) {
    System.out.println("Welcome to the store, " + customer + "!");
  }

  // increase price method
  public void increasePrice(double priceToAdd){
    double newPrice = price + priceToAdd;
    price = newPrice; 
  }

  // get price with tax method
  public double getPriceWithTax() {
    double totalPrice = price + price * 0.08;
    return totalPrice;
  }

  // main method
  public static void main(String[] args) {
    // instance of newStore object 
    newStore lemonadeStand = new newStore("Lemonade", 3.75);
    // what is our lemonadeStand?
    System.out.println(lemonadeStand);
    // Call the advertise() method on the lemonadeStand object in the main() method
    lemonadeStand.advertise();

    //call the greetCustomer method on the lemonadeStand object and pass in the String parameter of your choice 
    lemonadeStand.greetCustomer("you look thirsty!");

    System.out.println("the price is " + lemonadeStand.price);

    lemonadeStand.increasePrice(1.5);   
    // System.out.println(lemonadeStand.price);
    System.out.println("the new price is " + lemonadeStand.price);

    // add the tax
    double lemonadePrice = lemonadeStand.getPriceWithTax();
    System.out.println("The price with tax is $" + lemonadePrice);

  }

  // toString method
  public String toString() {
      return "This store sells " + productType + " at a price of " + price;
    }
}