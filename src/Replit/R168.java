package Replit;

public class R168 {


         String variable(){
            String a="hello";
            StringBuilder var= new StringBuilder(a);
            var.reverse();

            return var.toString();
        }
    }
    class Ftester{
        public static void main(String[] args) {
            R168 obj=new R168();
            String reversedWord=obj.variable();
            System.out.println(reversedWord);

        }
    }

