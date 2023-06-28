package demo1;

public class WhileLoopExample {
    public static void main(String[] args) {
        int count = 1;

        System.out.println("Counting from 1 to 5 using a while loop:");
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        System.out.println("\nCounting down from 10 to 1 using a while loop:");
        int number = 10;
        while (number >= 1) {
            System.out.println("Number: " + number);
            number--;
        }
    }
}

