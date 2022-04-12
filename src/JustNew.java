import java.util.Scanner;

public class JustNew {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double input= sc.nextDouble();
        double sum;
        for(int i = 1; i<=100; i++){
            sum= input+i;
            System.out.println(sum);
        }
    }
}