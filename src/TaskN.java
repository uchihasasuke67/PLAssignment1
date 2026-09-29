import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int m = 9 * 60 + n * 45 + ((n - 1) / 2) * 15 + ((n - 1 + 1) / 2) * 5;

        System.out.println(m / 60 + " " + m % 60);
    }
}