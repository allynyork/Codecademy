public class ConditionalPlayground {
    
  boolean isFilled;
  double billAmount;
  String shipping;
  
  public ConditionalPlayground(boolean filled, double cost, String shippingMethod) {
		if (cost > 24.00) {
      System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
  }
  
  public void ship() {
    if (isFilled) {
      System.out.println("Shipping");
      System.out.println("Shipping cost: " + calculateShipping());
    } else {
      System.out.println("Order not ready");
    }
  }
  
  public double calculateShipping() {
	 	// declare conditional statement here
    if (shipping == "Regular") {
      return 0;
    } else if (shipping == "Express") {
      return 1.75;
    } else {
      return .50;
    }
 	}
  
  public static void main(String[] args) {
    // do not alter the main method!
    ConditionalPlayground book = new ConditionalPlayground(true, 9.99, "Express");
    ConditionalPlayground chemistrySet = new ConditionalPlayground(false, 72.50, "Regular");
    
    book.ship();
    chemistrySet.ship();
  }
}