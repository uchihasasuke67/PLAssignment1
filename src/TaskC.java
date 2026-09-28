import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int K = input.nextInt();
        int B = K / N;
        System.out.println(B);
    }
}
