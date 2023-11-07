import java.util.Date;

/**
 * Represents a customer in the system.
 */
public class Customer {

  private String customerName;
  private String billingInformation;
  private String contactInformation;
  private String deliveryAddress;
  private Date arrivalDate;

  /**
     * Initializes a new customer with default values.
     */
  public Customer() {
    this.customerName = "Srikanth Bussa";
    this.billingInformation = "1234 5678 9012 3456";
    this.contactInformation = "Srikanth.bussa@eagles.oc.edu";
    this.deliveryAddress = "123 Main St, Oklahoma, USA";
    this.arrivalDate = new Date();
  }

  /**
     * Display customer details.
     */
  public void displayDetails() {
    System.out.println("Customer Name: " + this.customerName);
    System.out.println("Billing Information: " + this.billingInformation);
    System.out.println("Contact Information: " + this.contactInformation);
    System.out.println("Delivery Address: " + this.deliveryAddress);
    System.out.println("Expected Arrival Date: " + this.arrivalDate);
  }
}
