// Library External -> Import library from another programmer
//import java.lang.Math; Automatically import

import java.util.Scanner;

public class Class1 {
    public static void helloPerson() {
        System.out.println("Hello Person");
        System.out.println(Math.round(10.001));
    }

    public static void inputPerson() {
        // New instance scanner
        Scanner scanner = new Scanner(System.in);

        // Input as String
        String name = scanner.next();

        // Input as Int
        int age = scanner.nextInt();

        // scanner.nextDouble() -> Input as double

        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
