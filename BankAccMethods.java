/*Description:

Part A: 
Write a class to represent a BankAccount. This should include the following:
    1. Atributes for the bank accunt owner's name (String), balance (double) and a unique accountID (int).
    2. A default constructor which should set the default values for ALL attributes.
    3. A general constructor which accepts and sets values for each of the attributes (Remember that accountID is unique and won't be the same)
    4. Getter and setter methods for the name and balance.
    5. A Getter method for the accountID.
    6. A method called deposit() that takes a double as a parameter and adds this value to balance.
    7. A method called withdrawl() that should accept a double and reduce balance by this amount if balance is large enough to do so.
    8. A method called print() that prints the name, balance and accountID of the bank account. Please use format below.
    
Part B:
Write a main method in a new class called TestBankAccount in the main method:
    1. Create a bank account for "Mary Bloggs" with an initial balance of 500 and create another bank account for "Joe Spot" with an initial balance of 1000.
    2. Print Mary's balance to the screen using the getBalance() method.
    3. Print the details of Joe's account using the print() method.
    4. Make a deposit in Joe's account using the depsoit(<.....>) method for 500 and print his account details using the print() method.
    5. Print Mary's account details using the print() method.
    6. Withdraw 600 form Mary's account using the withdrawl(...) method.
    7. Withdraw 400 from Mary's account using the withdrawl(...) method.
    8. Mary and Joe get married. Set Mary's new name to "Mary Bloggs-Spot" using the setName(<....>) method and print her account setails to the screen using the print() method.
    
Output:
    The TestBankAccount class should print the correct answers to all of Part B question 1 - 8

Sample Output - output should be exactly as below:
    Balance is 500.0
    *******************
    Name: Joe Spot
    Balance: 1000.0
    Account ID: 100002*/

    import java.util.Random;

    class BankAccount {
        private String ownerName;
        private double balance;
        private int accountID;
    
        // Default constructor
        public BankAccount() {
            this.ownerName = "";
            this.balance = 0.0;
            this.accountID = generateAccountID();
        }
    
        // General constructor
        public BankAccount(String ownerName, double balance) {
            this.ownerName = ownerName;
            this.balance = balance;
            this.accountID = generateAccountID();
        }
    
        // Getter and setter methods
        public String getOwnerName() {
            return ownerName;
        }
    
        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }
    
        public double getBalance() {
            return balance;
        }
    
        public void setBalance(double balance) {
            this.balance = balance;
        }
    
        public int getAccountID() {
            return accountID;
        }
    
        // Method to deposit money
        public void deposit(double amount) {
            balance += amount;
        }
    
        // Method to withdraw money
        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient funds!");
            }
        }
    
        // Method to print account details
        public void print() {
            System.out.println("*******************");
            System.out.println("Name: " + ownerName);
            System.out.println("Balance: " + balance);
            System.out.println("Account ID: " + accountID);
        }
    
        // Method to generate a unique account ID
        private int generateAccountID() {
            Random rand = new Random();
            return rand.nextInt(900000) + 100000; // Random 6-digit number
        }
    }
    
    public class BankAccMethods {
        public static void main(String[] args) {
            // Create Mary's account
            BankAccount maryAccount = new BankAccount("Mary Bloggs", 500);
    
            // Create Joe's account
            BankAccount joeAccount = new BankAccount("Joe Spot", 1000);
    
            // 1. Print Mary's balance
            System.out.println("Balance is " + maryAccount.getBalance());
    
            // 2. Print Joe's account details
            joeAccount.print();
    
            // 3. Deposit into Joe's account and print details
            joeAccount.deposit(500);
            joeAccount.print();
    
            // 4. Print Mary's account details
            maryAccount.print();
    
            // 5. Withdraw from Mary's account twice
            maryAccount.withdraw(600);
            maryAccount.withdraw(400);
    
            // 6. Set Mary's new name and print details
            maryAccount.setOwnerName("Mary Bloggs-Spot");
            maryAccount.print();
        }
    }
    