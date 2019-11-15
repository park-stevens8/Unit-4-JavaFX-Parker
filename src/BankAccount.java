public class BankAccount{
  private String name;
  private double balance;
  private int numTransactions;
  private double intRate;

public BankAccount(String BankAcctName, double BankAcctBalance, int BankAcctNumTransactions, double BankAcctIntrate){
    name = BankAcctName;
    balance = BankAcctBalance;
    numTransactions = BankAcctNumTransactions;
    intRate = BankAcctIntrate;
  }



public String getAccName(){
  return name;
}

public double getBalance(){
  return balance;
}

public int getTransactions(){
  return numTransactions;
}

public double getaccIntRate(){
  return intRate;
}

public void setIntRate(double newIntRate){
  intRate = newIntRate;
}

public void deposit(double money){
  if(money < 0){
    System.out.println("Please enter a positive number");
  }
  else{
    balance = (balance + money);
    numTransactions++;
  }
}

public void withdrawal(double money){
  if(money > balance){
    System.out.println("You are trying to withdrawal more than your balance!");
  }
  else {
    balance = (balance - money);
    numTransactions++;
  }
}

public void addInterest(double newIntRate){
  balance = balance * (1 + newIntRate);
}


public String toString(){
  String result = "";
  result += "Name: " + name + ", Balance: " + balance + "\n";
  result+= "Number of Transactions: " + numTransactions + ", Interest Rate: " + intRate + "\n";
  return result;
}
}
