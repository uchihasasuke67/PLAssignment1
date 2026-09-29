import java.util.Scanner;

public class TaskM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = a;
        a = b;
        b = c;
        System.out.println(a +  " " + b);
    }
}
