package Class13HWDifferentWays;

public class Hw1Way4 {

    boolean isPalindrome(String str) {

        String reversedStr="";
        for (int i = str.length()-1; i >=0; i--) {
            reversedStr+=str.charAt(i);
        }
        boolean isStrpalindrome=false;
        if (str.equalsIgnoreCase(reversedStr)) {
            isStrpalindrome=true;
        }
        return  isStrpalindrome;

    }

    public static void main(String[] args) {
        Hw1Way4 obj= new Hw1Way4();
        boolean result= obj.isPalindrome("car");
        System.out.println(result);
    }
}
