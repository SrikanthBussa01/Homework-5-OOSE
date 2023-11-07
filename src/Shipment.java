import java.util.Date;

/**
 * Represents a shipment in the system.
 */
public class Shipment {

  private Date shipmentDate;
  private String shipmentStatus;
  private String shippingInformation;
  private String shippingMethod;

  /**
     * Initializes a new shipment with default values.
     */
  public Shipment() {
    this.shipmentDate = new Date();
    this.shipmentStatus = "In Transit";
    this.shippingInformation = "expected soon";
    this.shippingMethod = "UPS";
  }

  /**
     * Displays details of the shipment.
     */
  public void displayDetails() {
    System.out.println("Shipment Date: " + this.shipmentDate);
    System.out.println("Shipment Status: " + this.shipmentStatus);
    System.out.println("Shipment information: " + this.shippingInformation);
    System.out.println("Shipment Method: " + this.shippingMethod);

  }
}
