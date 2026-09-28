import java.util.Scanner;

public class TaskH {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = a / 10;
        int c = b % 10;
        System.out.println(c);
    }
}