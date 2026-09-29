import java.util.Scanner;

public class TaskP {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int h1 = input.nextInt();
        int m1 = input.nextInt();
        int s1 = input.nextInt();

        int h2 = input.nextInt();
        int m2 = input.nextInt();
        int s2 = input.nextInt();

        int time1 = h1 * 3600 + m1 * 60 + s1;
        int time2 = h2 * 3600 + m2 * 60 + s2;

        System.out.println(time2 - time1);
    }
}