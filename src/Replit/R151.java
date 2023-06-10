package Replit;

public class R151 {
    static int sum2D(int[][] num){
        int sum=0;
        for(int i=0; i<num.length; i++){
            for (int j=0; j<num[i].length; j++){
                sum+=num[i][j];
            }
        }
        return sum;
    }
}
class R151Tester extends R151 {
    public static void main(String[] args) {

        int[][] a = {

                {1, 2, 3},

                {4, 5, 6},

                {7, 8, 9}

        };

        int total = sum2D(a);
        System.out.println(total);

    }
}