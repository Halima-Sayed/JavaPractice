package Replit;

public class R134 {
    public static int countVowels(String s) {
       String word=s.replaceAll("[^aeiou]","");

        return word.length();
    }
    //test case below (dont change):
    public static void main(String[] args){
        System.out.println(countVowels("obama")); //3
        System.out.println(countVowels("happy friday! i love weekends")); //9
    }
}
