import java.util.Scanner;

public class JustNew {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

      do{
          int marks = sc.nextInt();
          if(marks>=90&& marks<=100){
              System.out.println("You got an A");
          }else if(marks>=80 && marks<90){
              System.out.println("Your got a B");
          }else if (marks>=60 && marks<70){
              System.out.println("You got a C");
          }else{
              System.out.println("You failed");
          }
      }
    }
}