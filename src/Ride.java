import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Ride Class
 * Represents a ride available in the theme park.
 * Implements RideInterface to ensure standard functionality.
 */
public class Ride implements RideInterface {

    // Instance variables
    private String rideName;
    private String rideType;
    private Employee operator;
    
    // Queue for waiting visitors
    private Queue<Visitor> waitingLine;
    
    // List for ride history
    private List<Visitor> rideHistory;
    
    // Cycle variables
    private int maxRider;
    private int numOfCycles;

    // Default Constructor
    public Ride() {
        this.rideName = "Unknown Ride";
        this.rideType = "Generic";
        this.operator = null;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    // Parameterized Constructor
    public Ride(String rideName, String rideType, Employee operator) {
        this.rideName = rideName;
        this.rideType = rideType;
        this.operator = operator;
        this.waitingLine = new LinkedList<>();
        this.rideHistory = new LinkedList<>();
        this.maxRider = 1;
        this.numOfCycles = 0;
    }

    // Getters and Setters

    public String getRideName() { return rideName; }
    public void setRideName(String rideName) { this.rideName = rideName; }

    public String getRideType() { return rideType; }
    public void setRideType(String rideType) { this.rideType = rideType; }

    public Employee getOperator() { return operator; }
    public void setOperator(Employee operator) { this.operator = operator; }
    
    public int getMaxRider() { return maxRider; }
    public void setMaxRider(int maxRider) { this.maxRider = maxRider; }
    
    public int getNumOfCycles() { return numOfCycles; }

    // Implementation of RideInterface methods

    @Override
    public void addVisitorToQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cannot add null visitor to queue.");
            return;
        }
        waitingLine.add(visitor);
        System.out.println("Added visitor to queue: " + visitor.getName());
    }

    @Override
    public void removeVisitorFromQueue(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cannot remove null visitor.");
            return;
        }
        // Attempt to remove and check result
        boolean removed = waitingLine.remove(visitor);
        if (removed) {
            System.out.println("Removed visitor from queue: " + visitor.getName());
        } else {
            System.out.println("Visitor not found in queue: " + visitor.getName());
        }
    }

    @Override
    public void printQueue() {
        System.out.println("Queue for " + rideName + ":");
        if (waitingLine.isEmpty()) {
            System.out.println("  (Empty)");
        } else {
            for (Visitor v : waitingLine) {
                System.out.println("  - " + v.getName());
            }
        }
    }

    @Override
    public void addVisitorToHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cannot add null visitor to history.");
            return;
        }
        rideHistory.add(visitor);
        System.out.println("Added visitor to history: " + visitor.getName());
    }

    @Override
    public boolean checkVisitorFromHistory(Visitor visitor) {
        if (visitor == null) {
            System.out.println("Cannot check null visitor.");
            return false;
        }
        boolean found = rideHistory.contains(visitor);
        System.out.println("Visitor " + visitor.getName() + " in history: " + found);
        return found;
    }

    @Override
    public int numberOfVisitors() {
        int count = rideHistory.size();
        System.out.println("Total visitors in history: " + count);
        return count;
    }

    @Override
    public void printRideHistory() {
        System.out.println("Ride History for " + rideName + ":");
        if (rideHistory.isEmpty()) {
            System.out.println("  (Empty)");
            return;
        }
        
        // Use Iterator to traverse the list
        Iterator<Visitor> it = rideHistory.iterator();
        while (it.hasNext()) {
            Visitor v = it.next();
            System.out.println("  - " + v.getName());
        }
    }

    // Sort the history
    public void sortRideHistory() {
        if (rideHistory.isEmpty()) {
            System.out.println("History is empty, nothing to sort.");
            return;
        }
        // Use VisitorComparator to sort the list
        Collections.sort(rideHistory, new VisitorComparator());
        System.out.println("Ride history has been sorted.");
    }

    @Override
    public void runOneCycle() {
        if (operator == null) {
            System.out.println("Error: Ride cannot run without an operator.");
            return;
        }
        
        if (waitingLine.isEmpty()) {
            System.out.println("Error: Ride cannot run with an empty queue.");
            return;
        }
        
        System.out.println("Running one cycle:");
        int ridersProcessed = 0;
        
        // Take visitors from queue up to maxRider
        for (int i = 0; i < maxRider; i++) {
            if (waitingLine.isEmpty()) {
                break;
            }
            
            // Remove from queue and add to history
            Visitor v = waitingLine.remove();
            addVisitorToHistory(v);
            ridersProcessed++;
        }
        
        numOfCycles++;
        System.out.println("Cycle completed. Processed " + ridersProcessed + " visitors.");
    }
}
