import java.util.LinkedList;

public class JustNew{
    public static void main(String[] args) {
        LinkedList<Integer> kk = new LinkedList<>();
        for(int i = 1; i<=5; i++){
            kk.add(i);
        }
        System.out.println(kk);
        kk.remove(3);
        System.out.println(kk);
        for (int i= 0; i<kk.size(); i++)
            System.out.println(kk.get(i));

    }
}