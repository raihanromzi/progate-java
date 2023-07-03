// Class -> inside class there is method
// Class name must be same with file name
// file should be Capital
public class JavaStudy2 {

    // Method main always run
    // Every method has specific task
    // Runtime environment will always find main
    public static void main(String[] args) {
        // () is important when calling method
        hello("Bob", 21);

        int sum = add(1, 2);
        System.out.println("Total : " + sum);

        // Call from another class
        Class1.helloPerson();

        Class1.inputPerson();
    }


    // Method in Class
    // Argument -> Parameter in Method
    // Void -> Method with No Return
    public static void hello(String name, int age) {
        System.out.println("Hello " + name + "I'm " + age + "Y.O");
    }

    // Method with return, change the void
    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Same name in method is wrong
    // But if the parameter is different, then it's good
    // Overloading -> same name, different parameter
    public static int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }
}
