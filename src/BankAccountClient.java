public class BankAccountClient{
  public static void main(String[] args){
  BankAccount myAccount = new BankAccount("AccountName", 10000, 0, 0);
  System.out.println(myAccount);

  myAccount.deposit(1000);
  System.out.println("You now have $" + myAccount.getBalance() + " in your account");

  myAccount.withdrawal(100);
  System.out.println("You now have $" + myAccount.getBalance() + " in your account");

  System.out.println("You have " + myAccount.getTransactions() + " transactions");

  myAccount.addInterest(.0006);
  System.out.println("Added .06% interest to your balance making the total: $" + myAccount.getBalance());
  }
}
