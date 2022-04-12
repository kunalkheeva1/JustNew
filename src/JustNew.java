import java.util.ArrayList;
import java.util.Collections;

public class JustNew{
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Kunal");
        arr.add("Kheeva");
        System.out.println(arr);
        for (int i = 0; i< arr.size(); i++)
            System.out.println(" "+arr.get(i));
        arr.remove(1);
        System.out.println(arr);
        arr.add(1,"Kheeva");
        System.out.println(arr);
        arr.set(0, "Nav");
        Collections.sort(arr);

    }
}