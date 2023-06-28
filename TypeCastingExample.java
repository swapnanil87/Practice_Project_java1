package demo1;

public class TypeCastingExample {
    public static void main(String[] args) {
        // Implicit type casting (Widening Conversion)
        int num1 = 10;
        double num2 = num1; // Implicitly cast int to double

        System.out.println("Implicit Type Casting:");
        System.out.println("num1 (int): " + num1);
        System.out.println("num2 (double): " + num2);
        System.out.println();

        // Explicit type casting (Narrowing Conversion)
        double num3 = 15.75;
        int num4 = (int) num3; // Explicitly cast double to int

        System.out.println("Explicit Type Casting:");
        System.out.println("num3 (double): " + num3);
        System.out.println("num4 (int): " + num4);
    }
}
