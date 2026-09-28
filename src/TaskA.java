import java.util.Scanner;

    public class TaskA {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            int a = input.nextInt();
            int b = input.nextInt();
            double a_squared = Math.pow(a, 2);
            double b_squared = Math.pow(b, 2);
            double c_squared = a_squared + b_squared;
            double c = Math.sqrt(c_squared);
            System.out.println(c);
        }
    }


