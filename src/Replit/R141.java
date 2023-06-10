package Replit;

public class R141 {
    public static void main(String[] args) {
        int[] arr = {5,12,-3,7,3,22};
        System.out.println(maxValue(arr)); //should print 22
    }

    public static int maxValue(int [] a){

     /*   int max=a[0];
        for (int i = 0; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }

        }
        return max;
    }*/
        int max=a[0];
        for(int b:a){
            if (b>max){
                max=b;
            }
        }

return max;

    }


}
