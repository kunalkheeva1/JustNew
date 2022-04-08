public class JustNew {
    public static void getInt() {
        int kk = Integer.parseInt("1");
        System.out.println(kk);

    }

    public static void main(String[] args) {
        try {
            getInt();
        } catch (Exception e) {
            System.out.println("Naw man it aint correct move!");
        }

    }
}