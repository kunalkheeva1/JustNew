import java.util.Scanner;

public class JustNew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double kk = scanner.nextDouble();
        System.out.println("Enter your second number: ");
        double nn = scanner.nextDouble();
        double mm = kk +nn;
        System.out.println("So Your result is: ");
        System.out.println(mm);
    }
}