/**
 * RideInterface
 * This interface defines the mandatory behaviors (methods) for all rides.
 * Any class implementing this interface must provide code for these methods.
 */
public interface RideInterface {
    // Queue related methods
    void addVisitorToQueue(Visitor visitor);
    void removeVisitorFromQueue(Visitor visitor);
    void printQueue();

    // Ride operation method
    void runOneCycle();

    // History related methods
    void addVisitorToHistory(Visitor visitor);
    boolean checkVisitorFromHistory(Visitor visitor);
    int numberOfVisitors();
    void printRideHistory();
}
