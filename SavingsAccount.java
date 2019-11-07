public class SavingsAccount {
  
  int balance;
  
  // constructor
  public SavingsAccount(int initialBalance){
    balance = initialBalance;
  }

  // checkBalance method
  public void checkBalance() {
    System.out.println("Hello!");
    System.out.println("Your balance is "+ balance);
  }
  
  // deposit method
  public void deposit(int amountToDeposit) {
    int afterDeposit = amountToDeposit + balance;
    balance = afterDeposit;
    System.out.println("You just deposited "+ amountToDeposit);
  }

  // withdraw method
  public int withdraw(int amountToWithdraw) {
    int afterWithdraw = balance - amountToWithdraw;
    balance = afterWithdraw; 
    System.out.println("You just withdrew " + amountToWithdraw);
    return amountToWithdraw;
  }
  
  public static void main(String[] args){
    SavingsAccount savings = new SavingsAccount(2000);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    // call checkBalance method
    savings.checkBalance();
    
    //Withdrawing:
    int afterWithdraw = savings.balance - 300;
    savings.balance = afterWithdraw;
    System.out.println("You just withdrew "+300);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    // call withdraw method
    savings.withdraw(500);

    // call checkBalance method
    savings.checkBalance();
    
    //Deposit:
    int afterDeposit = savings.balance + 600;
    savings.balance = afterDeposit;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);

    // call deposit method
    savings.deposit(900);

    // call checkBalance method
    savings.checkBalance();
    
    //Deposit:
    int afterDeposit2 = savings.balance + 600;
    savings.balance = afterDeposit2;
    System.out.println("You just deposited "+600);
    
    //Check balance:
    System.out.println("Hello!");
    System.out.println("Your balance is "+savings.balance);
    
  }       
}