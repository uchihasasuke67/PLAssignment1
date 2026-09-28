import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = n + 2 - n % 2;
        System.out.println(a);
    }
}
