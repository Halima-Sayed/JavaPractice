package Practice;

public class sumOf1DArray {
    public static void main(String[] args) {

        int[] box={1,3,5,7,9}; //=25

        int sum=0; // sum=1... sum=4... sum=9... sum=16...sum=25.

        for (int i = 0; i <box.length; i++) { // 0=done...1=done...2=done...3=done...4=done
            sum=sum+box[i];
         //  0 = 0 + 1;
         //  1 = 1 + 3;
         //  4 = 4 + 5;
         //  9 = 9 + 7;
         // 16 = 16 + 9;
        }
        System.out.println(sum);
    }
}
