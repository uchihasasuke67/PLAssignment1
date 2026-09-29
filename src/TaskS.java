import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println((h - a + a - b - 1) / (a - b) + 1);
    }
}