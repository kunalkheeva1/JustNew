import java.util.*;

public class JustNew{
    public static void main(String[] args) {
        ArrayList<Integer> kk = new ArrayList<>();
        for( int i = 1; i<=5; i++)
            kk.add(i);
        System.out.println(kk);
        kk.remove(4);

        System.out.println(kk);
        for(int i = 0; i<4; i++)
            System.out.println(kk.get(i));

    }
}