// Class JavaStudy1
public class JavaStudy1 {

    // Method main
    public static void main(String[] args) {
        // ; is a must
        System.out.println("Hello Again Java");

        // integer
        System.out.println(5);

        // Operator
        System.out.println(12 / 3);
        System.out.println(3 * 6);
        System.out.println(8 % 3);

        // String concat
        System.out.println("Hello" + "World");

        // Variable
        int number = 5;
        System.out.println(number);

        // String
        String name = "Bob";
        System.out.println(name);

        // Naming Variable -> camelCase
        String fullName = "John";
        System.out.println(fullName);

        // Float and Double
        // 5.0 / 2  = 2.5 (auto convert implicit)
        double double1 = 5.0;
        int double2 = 2;
        System.out.println(double1 / double2);

        // Explicit convert
        // Cast number13 to double (just need one variable to cast)
        int number13 = 13;
        int number4 = 4;
        System.out.println((double) number13 / number4);

        // Boolean
        boolean bool = true;
        System.out.println(bool);

        // Operator Boolean (>, <, <=, >=, ==, !=, &&, ||, !)
        if (true) {
            System.out.println("Hello");
        }

        // Switch
        switch (number13 % 3) {
            case 0:
                System.out.println("Divided by 3");
                break;
            case 1:
                System.out.println("Cannot divided by 3");
                break;
            default:
                System.out.println("Default");
                break;
        }

        // For
        for (int i = 1; i < 10; i++) {
            System.out.println("Loop - " + i);
        }

        // Break -> End loop
        // Continue -> Continue loop to the next iteration

        // Array -> String[], int[]
        String[] names = {"a", "b", "c"};
        System.out.println(names[0]);

        names[1] = "d";
        System.out.println(names[1]);

        // For Loop Array
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name " + names[i]);
        }

        // Enhance Loop -> Loop array -> Temp variable
        for (String nameTemp : names) {
            System.out.println("Name " + nameTemp);
        }

    }

}