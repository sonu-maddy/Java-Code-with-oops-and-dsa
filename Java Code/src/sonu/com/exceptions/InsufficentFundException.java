package sonu.com.exceptions;

// Custom exception
public class InsufficentFundException extends Exception {
    public InsufficentFundException() {
        super("❌ Insufficient balance! You don’t have enough money.");
    }
}
