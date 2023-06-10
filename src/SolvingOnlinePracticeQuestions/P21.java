package SolvingOnlinePracticeQuestions;

public class P21 {
    public static void main(String[] args) {
        String sentence= "I need to study more";
        StringBuilder sentence2=new StringBuilder(sentence);
        sentence2.reverse();
        sentence=sentence2.toString();
        System.out.println(sentence);
    }
}
