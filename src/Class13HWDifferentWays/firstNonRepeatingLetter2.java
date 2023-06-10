package Class13HWDifferentWays;

public class firstNonRepeatingLetter2 {
    public static void findFirstNonRepeatingChar(String word) {
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (word.indexOf(c) == word.lastIndexOf(c)) {
                System.out.println(c);
                return; //to stop the loop
            }
        }
        System.out.println("No non-repeating character");
    }

    public static void main(String[] args) {
        String a = "abracadabra";
        findFirstNonRepeatingChar(a);
    }
}
