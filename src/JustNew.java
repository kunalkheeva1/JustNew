import java.util.Scanner;

public class JustNew {
    public static double kunal(){
         Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your first number: ");
         double a= scanner.nextDouble();
        System.out.println("Please enter your second number: ");
         double b = scanner.nextDouble();
         double sum = a+b;
        System.out.println("Here you go: ");
        System.out.println(sum);
         return sum;
    }
    public static void main(String[] args) {
        kunal();

    }
}