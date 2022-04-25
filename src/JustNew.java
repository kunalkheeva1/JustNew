import java.util.Scanner;
public class JustNew {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in); // Scanner to get the input
        System.out.println("Please Enter your name: ");
        String kk = sc.nextLine(); //gets the input
        System.out.print("Your entry ");
        for(int i=0; i<kk.length(); i++){
            System.out.print( kk.charAt(i)); //Printing the name which has been inputed
        }
        System.out.print(" has been registered!!");
    }
}