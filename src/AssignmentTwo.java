public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
    }

    public void partThree() {
        System.out.println("=== Part 3: Waiting Queue ===");

        // Create a new Ride
        Employee operator = new Employee("E001", "John", 30, "Operator", 5000);
        Ride coaster = new Ride("Roller Coaster", "Thrill", operator);

        // Create Visitors
        Visitor v1 = new Visitor("V001", "Tom", 20, "Standard", false);
        Visitor v2 = new Visitor("V002", "Bob", 22, "VIP", true);
        Visitor v3 = new Visitor("V003", "Ben", 25, "Standard", false);
        Visitor v4 = new Visitor("V004", "Jack", 18, "Standard", false);
        Visitor v5 = new Visitor("V005", "Lee", 30, "VIP", true);

        // Add visitors to the Queue
        System.out.println("Adding visitors...");
        coaster.addVisitorToQueue(v1);
        coaster.addVisitorToQueue(v2);
        coaster.addVisitorToQueue(v3);
        coaster.addVisitorToQueue(v4);
        coaster.addVisitorToQueue(v5);

        // Print the Queue
        System.out.println("\nQueue status:");
        coaster.printQueue();

        // Remove a visitor
        System.out.println("\nRemoving a visitor...");
        coaster.removeVisitorFromQueue(v3); // Remove Charlie

        // Print the Queue again
        System.out.println("\nQueue status after removal:");
        coaster.printQueue();
    }

    public void partFourA() {
        System.out.println("\n=== Part 4A: Ride History ===");

        // Create a new Ride
        Employee operator = new Employee("E002", "Mike", 28, "Operator", 4500);
        Ride dropTower = new Ride("Drop Tower", "Thrill", operator);

        // Create Visitors
        Visitor v1 = new Visitor("V001", "Tom", 20, "Standard", false);
        Visitor v2 = new Visitor("V002", "Bob", 22, "VIP", true);
        Visitor v3 = new Visitor("V003", "Ben", 25, "Standard", false);
        Visitor v4 = new Visitor("V004", "Jack", 18, "Standard", false);
        Visitor v5 = new Visitor("V005", "Lee", 30, "VIP", true);

        // Add visitors to the History
        System.out.println("Adding visitors to history...");
        dropTower.addVisitorToHistory(v1);
        dropTower.addVisitorToHistory(v2);
        dropTower.addVisitorToHistory(v3);
        dropTower.addVisitorToHistory(v4);
        dropTower.addVisitorToHistory(v5);

        // Check if a visitor is in history
        System.out.println("\nChecking visitors...");
        dropTower.checkVisitorFromHistory(v3); 
        Visitor vUnknown = new Visitor("V999", "Unknown", 0, "Standard", false);
        dropTower.checkVisitorFromHistory(vUnknown); 

        // Print number of visitors
        System.out.println("\nNumber of visitors:");
        dropTower.numberOfVisitors();

        // Print all visitors in history
        System.out.println("\nPrinting ride history:");
        dropTower.printRideHistory();
    }

    public void partFourB() {
    }

    public void partFive() {
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}
