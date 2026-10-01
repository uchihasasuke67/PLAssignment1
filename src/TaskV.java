import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int k = (a / b + 1000) / 1001;
        int max = a * k + b * (1 - k);
        System.out.println(max);
    }
}
