import java.util.ArrayList;

public class frsfr {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(111);
        a.add(111);
        a.add(111);
        a.add(999);
        a.add(999);
        a.add(999);

        for (Integer b : a) {
            System.out.println(b);
        }
    }
}