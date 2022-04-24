import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JustNew {
    public static double kunal(double a, double b) {
        double sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double sum = kunal(a, b);
        System.out.println(sum);
    }
}