/**
 * Represents a supplier in the system.
 */
public class Supplier {

  private String supplierName;
  private String supplierContactInformation;

  /**
     * Initializes a new supplier with default values.
     */
  public Supplier() {
    this.supplierName = "Bussa's";
    this.supplierContactInformation = "405-123-9988";
  }

  /**
     * Displays details of the supplier.
     */
  public void displayDetails() {
    System.out.println("Supplier Name: " + this.supplierName);
    System.out.println("Supplier Contact information: " + this.supplierContactInformation);
  }
}
