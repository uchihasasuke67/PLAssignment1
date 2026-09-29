import java.util.Scanner;

public class TaskO {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = (a * 100 + b) * c;

        System.out.println(d / 100 + " " + d % 100);
    }
}