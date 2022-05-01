import java.sql.SQLOutput;
import java.util.Scanner;
public class JustNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input to be reversed: ");
        StringBuilder kk = new StringBuilder(sc.nextLine());
        for(int i=0; i<kk.length()/2; i++){

            char first= kk.charAt(i);
            char last= kk.charAt(kk.length()-1-i);
            kk.setCharAt(i,last);
            kk.setCharAt(kk.length()-1-i,first);
        }
        System.out.println("Reversed input: "+ "\n"+kk);
    }
}