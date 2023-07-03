// One of programming paradigm
// Build software around object -> Information and Action

// Class -> Blueprint
// Instance -> Object -> Every instance / object has information and action -> Define in Class!
public class PBO {

    public static void main(String[] args) {

        // Instance -> Person (Class type)
        // Field Instance -> Information -> name, age
        // Method Instance -> Action -> hello(), move()
        Person person = new Person("Ali");
        person.name = "John";
        person.hello();

    }

}

// Blueprint for instance
class Person {

    // Field Class -> class own this field -> using Static
    // Instance doesn't have this
    // Static -> Keyword for Method class & Field class
    // Static -> Call field or method without creating field
    public static String classField = "Hello Class Field";

    // Field Instance
    // Default value is null
    public String name;

    // Constructor -> call automatically when first time an instance created
    // Constructor name should be same as Class name
    // No return and void
    Person(String name) {
        this.name = name;
    }

    // If we want to add another field instance, but don't want to break old program
    // Use Constructor Overload
    Person(String name, int age) {
        // this.name = name; (THIS IS BAD because duplicate another constructor)
        // Special method to call another constructor
        this(name);
        System.out.println(age);
    }

    // This keyword -> refer to field instance / method instance

    // Method class using static
    public static void SayMethodClass() {
        // Method class when calling field class (not using this)
        System.out.println(Person.classField);
    }

    // Method instance not using static
    public void hello() {
        System.out.println("Hello " + this.name);
    }

    // Encapsulation (limit the usage) -> Public, Private (Hiding something)
    // Prevent edit instance (if it necessarily uses Setter, so it will validate first)
    // Private -> use inside class only

    // Field Instance always private
    // Method Instance always public
    
    // After limit using private -> use Getter and Setter to edit instance field safety
}
