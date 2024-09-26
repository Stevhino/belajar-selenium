import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        System.out.println("Please Enter value between 1 & 5");
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();

        switch (value) {
            case 1:
                System.out.println("The value is one.");
                break;
            case 2:
                System.out.println("The value is two.");
                break;
            case 3:
                System.out.println("The value is three.");
                break;
            case 4:
                System.out.println("The value is four.");
                break;
            case 5:
                System.out.println("The value is five.");
                break;
        }

    }
}
