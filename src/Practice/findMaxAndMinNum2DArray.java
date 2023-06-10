package Practice;

public class findMaxAndMinNum2DArray {
    public static void main(String[] args) {
// Max and min number in array.
        int[][]num={{32,4,53,23,2,3},
                {23,4,3,2,2}};
        int max=num[0][0];
        int min=num[0][0];

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j <num[i].length ; j++) {
                if (num[i][j]>max){
                    max=num[i][j];
                }else if (num[i][j]<min){
                    min=num[i][j];
                }

            }


        }
        System.out.println("min num in the array is"+min);
        System.out.println("max num in the array is"+max);


    }
}


