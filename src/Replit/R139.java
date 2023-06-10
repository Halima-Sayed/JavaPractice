package Replit;

public class R139 {
    public String alphabetical(String str) {
        String result = "";
        char previousChar = 'a'; // set an initial value for previous character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar > previousChar) { // check if current character is greater than previous character
                result += currentChar;
             //   previousChar = currentChar; // update previous character
            }
            previousChar = currentChar; // update previous character
        }
        return result;
    }

    public static void main(String[] args) {
        R139 obj=new R139();
        System.out.println(obj.alphabetical("hello"));
        R139 obj2=new R139();
        System.out.println(obj2.alphabetical("software"));
        R139 obj3=new R139();
        System.out.println(obj3.alphabetical("language"));
    }
}
