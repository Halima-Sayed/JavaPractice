package Replit;

public class R119 {

    String censorLetter(String x, char z) {

        return x.replace(z, '*');
    }

    public static void main(String[] args) {
        R119 obj=new R119();
        System.out.println(obj.censorLetter("computer science", 'e'));
        System.out.println(obj.censorLetter("trick or treat", 't'));
    }

}
