/**
 * Person Class (Abstract)
 * Represents a generic person in the Theme Park system.
 * It serves as a base class for Visitor and Employee.
 */
public abstract class Person {

    // Instance variables
    private String id;
    private String name;
    private int age;

    // Default Constructor
    public Person() {
        this.id = "Unknown";
        this.name = "Unknown";
        this.age = 0;
    }

    // Parameterized Constructor
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        // Check age validity
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }
}