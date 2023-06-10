package Project2HWOtherWays;

public class CountWordsInASentenceUsingMethod {
    static int howManyWords(String sen){
        String [] w=sen.split("[\\p{Punct}\\s]+");
        return w.length;
    }
    public static void main(String[] args) {
        String sentence="Hello, world! I . . ! ? am counting the words in this sentence";
        int count=howManyWords(sentence);
        System.out.println(count);
    }
}
