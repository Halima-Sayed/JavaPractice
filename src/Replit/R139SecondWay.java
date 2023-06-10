package Replit;

public class R139SecondWay {
    public static String alphabetical(String str){
        String newStr="";

        for (int i = 0; i <str.length() ; i++) {
            if(i==0 || str.charAt(i)>str.charAt(i-1)){

                newStr+=str.charAt(i);
            }

        }
        return newStr;
    }

    public static void main(String[] args) {
        System.out.println(R139SecondWay.alphabetical("hello"));
        System.out.println(R139SecondWay.alphabetical("software"));
        System.out.println(R139SecondWay.alphabetical("language"));
    }
}
