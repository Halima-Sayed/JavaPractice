package SolvingOnlinePracticeQuestions;

public class P13 {
    public static void main(String[] args) {
        /*
        Converting String into char
         */

      String a="Hydrogen";
      char b= a.charAt(1);

        System.out.println(b);

        System.out.println("-------");
        for (int i = 0; i < a.length(); i++) {
            char c=a.charAt(i);
            System.out.println(c);

            }
        System.out.println("------");
        String s="hello";
        for(int t=0; t<s.length();t++){
            char r = s.charAt(t);
            System.out.println("char at "+t+" index is: "+r);
        }

    }
}
