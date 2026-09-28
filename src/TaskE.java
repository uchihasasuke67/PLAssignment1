import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int v = input.nextInt();
        int t = input.nextInt();
        int a = v * t;
        int result = a % 109;
        if (result < 0) {
            result += 109;
        }
        System.out.println(result);

    }
}
