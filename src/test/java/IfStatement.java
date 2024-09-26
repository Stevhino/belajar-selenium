import java.util.Scanner;

public class IfStatement {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int age;
        System.out.println("Please enter your age: ");
        age = input.nextInt();
        if ( age >= 13 ) {
            System.out.println("You are eligible to register to the website");
        } else {
            System.out.println("You are not able to register to this website");
        }
    }
}
