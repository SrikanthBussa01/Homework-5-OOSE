import java.util.Date;

/**
 * Represents a payment in the system.
 */
public class Payment {

  private String paymentMethod;
  private String paymentStatus;
  private double paymentAmount;
  private Date transactionDate;

  /**
     * Initializes a new payment with default values.
     */
  public Payment() {
    this.paymentMethod = "Credit Card";
    this.paymentStatus = "Approved";
    this.transactionDate = new Date();
    this.paymentAmount = 100;
  }

  /**
     * Displays details of the payment.
     */
  public void displayDetails() {
    System.out.println("Payment Method: " + this.paymentMethod);
    System.out.println("Payment Status: " + this.paymentStatus);
    System.out.println("Transaction Date: " + this.transactionDate);
    System.out.println("PaymentAmount " + this.paymentAmount);

  }
}
