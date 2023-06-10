package Project2HWOtherWays;

public class firstNonRepeatingLetter {
    void nonRepeatingChar(String str){
        char [] a=str.toCharArray();
        for(char i:a){
            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("First non-repeating character is: "+i);
                break;
            }
        }
    }

    public static void main(String[] args) {
        firstNonRepeatingLetter obj=new firstNonRepeatingLetter();
        obj.nonRepeatingChar("abzracadabra");

    }
}
