package Replit;

public class R106 {
    public static void main(String[] args) {
        StringBuffer s = new StringBuffer("Hello");
        s.append(" " + "World");
        String result = s.toString();
        System.out.println(result.toUpperCase());

        StringBuffer what = new StringBuffer("Hello Friends");
        what.reverse();
        System.out.println(what);
    }
}

