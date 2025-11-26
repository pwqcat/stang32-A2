/**
 * Person Class
 * This represents a person in the system.
 * It is the parent class for Visitor and Employee.
 */
public class Person {
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

    // Constructor with parameters to set initial values
    public Person(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    // Getters and Setters to access private variables

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
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error: Age cannot be negative.");
        }
    }
}
