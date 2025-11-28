public class AssignmentTwo {

    public static void main(String[] args) {
        AssignmentTwo assignment = new AssignmentTwo();
        assignment.partThree();
    }

    public void partThree() {
        System.out.println("=== Part 3: Waiting Queue ===");

        //Create a new Ride
        Employee operator = new Employee("E001", "John", 30, "Operator", 5000);
        Ride coaster = new Ride("Roller Coaster", "Thrill", operator);

        //Create Visitors
        Visitor v1 = new Visitor("V001", "Tom", 20, "Standard", false);
        Visitor v2 = new Visitor("V002", "Bob", 22, "VIP", true);
        Visitor v3 = new Visitor("V003", "Ben", 25, "Standard", false);
        Visitor v4 = new Visitor("V004", "Jack", 18, "Standard", false);
        Visitor v5 = new Visitor("V005", "Lee", 30, "VIP", true);

        //Add visitors to the Queue
        System.out.println("Adding visitors...");
        coaster.addVisitorToQueue(v1);
        coaster.addVisitorToQueue(v2);
        coaster.addVisitorToQueue(v3);
        coaster.addVisitorToQueue(v4);
        coaster.addVisitorToQueue(v5);

        //Print the Queue
        System.out.println("\nQueue status:");
        coaster.printQueue();

        //Remove a visitor
        System.out.println("\nRemoving a visitor...");
        coaster.removeVisitorFromQueue(v3); // Remove Charlie

        //Print the Queue again
        System.out.println("\nQueue status after removal:");
        coaster.printQueue();
    }

    public void partFourA() {
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