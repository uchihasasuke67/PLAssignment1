import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a - 1;
        int c = a + 1;
        System.out.println("The next number for the number " + a + " is " + c + ".");
        System.out.println("The previous number for the number " + a + " is " + b + ".");
    }
}