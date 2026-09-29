import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int h = (a / 3600) % 24;
        int m = (a / 60) % 60;
        int s = a % 60;
        if (m < 10) {
            System.out.print(h + ":0" + m + ":");
        } else {
            System.out.print(h + ":" + m + ":");
        }

        if (s < 10) {
            System.out.println("0" + s);
        } else {
            System.out.println(s);
        }
    }
}