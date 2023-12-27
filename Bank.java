 /* Create a Bank class and declare an instance variable named amount of type double.
 Create parameterized constructor to initialize variable “amount” with value 10000.
 Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
 Calculate withdrawal based on some condition (using ternary operator) like 
 If amount is sufficient then “withdraw successful” message will be printed on the console
 and amount should be updated after withdraw. Later on, deposit 5000 in the account balance.
 At the end display total balance on the console. */

package javaPracticeQuestions;

public class Bank {
	
	double amount;

    public Bank(double initialAmount) {
        this.amount = initialAmount;
    }

    //Withdraw method
    public void withdraw(double withdrawalAmount) {
  
        String message = (amount >= withdrawalAmount) ? "Withdrawal successful" : "Insufficient funds";
        System.out.println(message);
        //Updating
        amount = (amount >= withdrawalAmount) ? amount - withdrawalAmount : amount;
    }

    //Deposit method
    public void deposit(double depositAmount) {
    	
        amount += depositAmount;
    }

    //Display method
    public void displayBalance() {
        System.out.println("Total Balance: " + amount);
    }

    public static void main(String[] args) {
        // Create an instance of the Bank class with an initial amount of 10000
        Bank myAccount = new Bank(10000);

        // Withdraw 8000 (assuming sufficient funds)
        myAccount.withdraw(8000);

        // Deposit 5000
        myAccount.deposit(5000);

        // Display the total balance
        myAccount.displayBalance();
    }
}


