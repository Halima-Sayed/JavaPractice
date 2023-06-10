package Replit;

public class R128SecondWay {
    static String mixString(String s1, String s2) {
        String str="";
        for (int i = 0; i <s1.length() ; i++)
            str +=s1.substring(i,i+1)+s2.substring(i,i+1);
        return str;
    }
    public static void main(String[] args) {
        String firstvalue= mixString("12345","abcde");
        System.out.println(firstvalue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);
    }
}
