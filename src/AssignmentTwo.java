public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
        assignment.partFourA();
        assignment.partFourB();
        assignment.partFive();
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
        System.out.println("Adding visitors to history:");
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
        System.out.println("Adding visitors to history:");
        dropTower.addVisitorToHistory(v1);
        dropTower.addVisitorToHistory(v2);
        dropTower.addVisitorToHistory(v3);
        dropTower.addVisitorToHistory(v4);
        dropTower.addVisitorToHistory(v5);

        // Check if a visitor is in history
        System.out.println("\nChecking visitors:");
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
        System.out.println("\n=== Part 4B: Sorting History ===");

        // Create a new Ride
        Employee operator = new Employee("E003", "Sarah", 25, "Operator", 4800);
        Ride carousel = new Ride("Carousel", "Family", operator);

        // Create Visitors
        Visitor v1 = new Visitor("V001", "Tom", 20, "Standard", false);
        Visitor v2 = new Visitor("V002", "Bob", 25, "Standard", false);
        Visitor v3 = new Visitor("V003", "Ben", 25, "Standard", false);
        Visitor v4 = new Visitor("V004", "Jack", 18, "Standard", false);
        Visitor v5 = new Visitor("V005", "Lee", 30, "VIP", true);

        // Add to history
        carousel.addVisitorToHistory(v1);
        carousel.addVisitorToHistory(v2);
        carousel.addVisitorToHistory(v3);
        carousel.addVisitorToHistory(v4);
        carousel.addVisitorToHistory(v5);

        // Print unsorted
        System.out.println("Before sorting:");
        carousel.printRideHistory();

        // Sort
        System.out.println("\nSorting...");
        carousel.sortRideHistory();

        // Print sorted
        System.out.println("\nAfter sorting:");
        carousel.printRideHistory();
    }

    public void partFive() {
        System.out.println("\n=== Part 5: Run a Ride Cycle ===");

        // Create a new Ride
        Employee operator = new Employee("E004", "David", 35, "Operator", 5500);
        Ride ferrisWheel = new Ride("Ferris Wheel", "Family", operator);
        ferrisWheel.setMaxRider(3); // Max 3 visitors per cycle

        // Create 10 Visitors
        Visitor v1 = new Visitor("V001", "Tom", 20, "Standard", false);
        Visitor v2 = new Visitor("V002", "Bob", 22, "VIP", true);
        Visitor v3 = new Visitor("V003", "Ben", 25, "Standard", false);
        Visitor v4 = new Visitor("V004", "Jack", 18, "Standard", false);
        Visitor v5 = new Visitor("V005", "Lee", 30, "VIP", true);
        Visitor v6 = new Visitor("V006", "Mary", 21, "Standard", false);
        Visitor v7 = new Visitor("V007", "Lisa", 24, "VIP", true);
        Visitor v8 = new Visitor("V008", "John", 29, "Standard", false);
        Visitor v9 = new Visitor("V009", "Mike", 19, "Standard", false);
        Visitor v10 = new Visitor("V010", "Sara", 23, "VIP", true);

        // Add all to queue
        ferrisWheel.addVisitorToQueue(v1);
        ferrisWheel.addVisitorToQueue(v2);
        ferrisWheel.addVisitorToQueue(v3);
        ferrisWheel.addVisitorToQueue(v4);
        ferrisWheel.addVisitorToQueue(v5);
        ferrisWheel.addVisitorToQueue(v6);
        ferrisWheel.addVisitorToQueue(v7);
        ferrisWheel.addVisitorToQueue(v8);
        ferrisWheel.addVisitorToQueue(v9);
        ferrisWheel.addVisitorToQueue(v10);

        // Print queue before run
        System.out.println("\nQueue before cycle:");
        ferrisWheel.printQueue();

        // Run one cycle
        System.out.println("\nRunning cycle:");
        ferrisWheel.runOneCycle();

        // Print queue after run
        System.out.println("\nQueue after cycle:");
        ferrisWheel.printQueue();

        // Print history
        System.out.println("\nHistory after cycle:");
        ferrisWheel.printRideHistory();
    }

    public void partSix() {
    }

    public void partSeven() {
    }
}