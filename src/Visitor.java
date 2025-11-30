/**
 * Visitor Class
 * Represents a visitor in the theme park.
 * Extends the Person class to inherit common attributes.
 */
public class Visitor extends Person {

    // Instance variables specific to Visitor
    private String ticketType;
    private boolean vipStatus;

    // Default Constructor
    public Visitor() {
        super(); // Call parent constructor
        this.ticketType = "Standard";
        this.vipStatus = false;
    }

    // Parameterized Constructor
    public Visitor(String id, String name, int age, String ticketType, boolean vipStatus) {
        super(id, name, age); // Pass details to Person class
        this.ticketType = ticketType;
        this.vipStatus = vipStatus;
    }

    // Getters and Setters

    public String getTicketType() {
        return ticketType;
    }

    public void setTicketType(String ticketType) {
        this.ticketType = ticketType;
    }

    public boolean isVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(boolean vipStatus) {
        this.vipStatus = vipStatus;
    }
}