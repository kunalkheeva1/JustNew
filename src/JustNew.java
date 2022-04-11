import java.util.Scanner;

public class JustNew {
    static int age;
    static Scanner sc = new Scanner(System.in);

    static void kk() {
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        if (age < 18) {
            System.out.println("Your are not adult go fuck yourself");
        } else if (age >= 18){
        System.out.println("Hell yea we got it man!");
    }

}
    public static void main(String[] args) {
        JustNew obj = new JustNew();
        obj.kk();
      for(int i = 0; i<age; i++){
          obj.kk();
      }

    }
}