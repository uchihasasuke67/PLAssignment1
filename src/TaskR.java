import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int c = n-k%n;
        int t = c%n;
        System.out.println(t);
    }
}
