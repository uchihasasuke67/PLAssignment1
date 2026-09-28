import java.util.Scanner;

public class TaskK {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = (n / 60) % 24;
        int b = n % 60;
        System.out.println(a + " " + b);

    }
}
