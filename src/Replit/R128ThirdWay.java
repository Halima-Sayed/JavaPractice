package Replit;

public class R128ThirdWay {
    public static String mixString(String s1, String s2){

        String str="";
        int l=0;

        if(s1.length()>= s2.length()){
            l=s1.length();
        } else
            l=s2.length();

        for(int i=0; i<l; i++){

            if(i<s1.length()){
                str+=s1.charAt(i);
            }
            if(i<s2.length()){
                str += s2.charAt(i);
            }
        } return str;
    }

    //test case below (dont change):
    public static void main(String[] args){
        String firstValue = mixString("12345","abcde");
        System.out.println(firstValue);
        String secondValue = mixString("howdy","hello");
        System.out.println(secondValue);

    }
}
