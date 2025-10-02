package sonu.com.exceptions;

// BankAccount class
class BankAccount {
    private double balance;

    public BankAccount(double amount) {
        this.balance = amount; // FIXED
    }

    public void withdraw(double amount) throws InsufficentFundException {
        if (balance < amount) { // FIXED
            throw new InsufficentFundException();
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }
}

class CustomException {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(10);

        try {
            bankAccount.withdraw(11); // will throw exception
        } catch (InsufficentFundException e) {
            System.out.println("Exception caught: " + e.getMessage());
            e.printStackTrace(); // prints stack trace
        }
    }
}
