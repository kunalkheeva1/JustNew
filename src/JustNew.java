import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JustNew {

    static void factorial(double n) {
        double fact = 1;
        for(double i=n; i>=1; i--){
            fact = fact*i;
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        factorial(n);

    }
}