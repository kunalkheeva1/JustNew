import java.util.ArrayList;

public class JustNew{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i<=5; i++)
            arr.add(i);
        System.out.println(arr);
        arr.add(1,23);
        System.out.println(arr);
        arr.set(1,2);
        System.out.println(arr);
        arr.remove(1);
        System.out.println(arr);
        for (int i= 0; i< arr.size();i++ )
            System.out.println(arr.get(i));

    }
}