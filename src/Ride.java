/**
 * Ride Class
 * Represents a ride available in the theme park.
 * It manages the ride details and the assigned operator.
 */
public class Ride {
    // Instance variables
    private String rideName;
    private String rideType;
    private Employee operator; // The staff member assigned to operate the ride

    /**
     * Default Constructor
     * Initializes a Ride with default values.
     */
    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "Generic";
        this.operator = null;
    }

    /**
     * Parameterized Constructor
     * Allows creating a Ride with specific details and an operator.
     */
    public Ride(String rideName, String rideType, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
    }

    // Getters and Setters

    public String getRideName() {
        return rideName;
    }

    public void setRideName(String rideName) {
        this.rideName = rideName;
    }

    public String getRideType() {
        return rideType;
    }

    public void setRideType(String rideType) {
        this.rideType = rideType;
    }

    public Employee getOperator() {
        return operator;
    }

    /**
     * Assigns an operator to the ride.
     * @param operator The Employee object who will run the ride.
     */
    public void setOperator(Employee operator) {
        this.operator = operator;
    }
}
