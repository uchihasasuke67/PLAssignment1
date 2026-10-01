import java.util.Scanner;

public class TaskU {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        int p = (n % m) * (m % n);

        System.out.println(1 / (p + 1));
    }
}
