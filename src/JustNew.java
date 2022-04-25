import java.util.Scanner;

public class JustNew {
    static void kk(){
        System.out.println("Please enter your number: ");
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        double n=input;
        if(n%2==0){
            System.out.println("It is an even number!");
        }
        else{
            System.out.println("It is an odd number");
        }
    }
    public static void main(String[] args) {
       int i=0;
       do{
           kk();
       }while(i<=i);{
            System.out.println("end loop");
            i++;
        }
        }
}