import java.sql.SQLOutput;
import java.util.Scanner;
public class JustNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input to be reversed: ");
        StringBuilder kk = new StringBuilder(sc.nextLine());
        for(int i=0; i<kk.length()/2; i++){
            int front= i;
            int back = kk.length() -1-i;
            char first= kk.charAt(front);
            char last= kk.charAt(back);
            kk.setCharAt(front,last);
            kk.setCharAt(back,first);
        }
        System.out.println("Reversed input: "+ "\n" +kk);
    }
}