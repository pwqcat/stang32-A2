/**
 * RideInterface
 * Defines the mandatory behaviors for all rides.
 */
public interface RideInterface {

    // Queue management
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();

    // Ride operation
    void runOneCycle();

    // History management
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}
