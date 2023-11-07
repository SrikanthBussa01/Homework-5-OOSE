/**
 * Represents an item in the system.
 */
public class Item {

  private String itemName;
  private String itemDescription;
  private int itemQuantity;
  private double unitPrice;

  /**
     * Initializes an item with the specified details.
     *
     * @param name        The name of the item.
     * @param desc        The description of the item.
     * @param qty         The quantity of the item.
     * @param price       The unit price of the item.
     */
  public Item(String name, String desc, int qty, double price) {
    this.itemName = name;
    this.itemDescription = desc;
    this.itemQuantity = qty;
    this.unitPrice = price;
  }

  /**
     * Displays details of the item.
     */
  public void displayDetails() {
    System.out.println("Item Name: " + this.itemName);
    System.out.println("Item Description: " + this.itemDescription);
    System.out.println("Item Quantity: " + this.itemQuantity);
    System.out.println("Unit Price: " + this.unitPrice);
  }

  /**
     * Gets the quantity of the item.
     *
     * @return The quantity of the item.
     */
  public int getItemQuantity() {
    return itemQuantity;
  }

  /**
     * Gets the unit price of the item.
     *
     * @return The unit price of the item.
     */
  public double getUnitPrice() {
    return unitPrice;
  }
}
