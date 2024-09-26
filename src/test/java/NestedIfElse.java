import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        System.out.println("Input your age: ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if ( age > 0) {
            if ( age > 18) {
                System.out.println("You are eligible to register to the website ");
            } else {
                System.out.println("You are too young for register this websites");
            }
        } else {
            System.out.println("Please enter a valid value that greater than 0");
        }

        input.close();
    }
}
