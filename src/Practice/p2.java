package Practice;

public class p2 {
    public static void main(String[] args) {


        int[] a={12,15,11,13,9,25};
        int[] a2={12,15,11,13,9,25};
        int sum=0;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==a2[i]%5){ // WHAT does this mean?
                sum+=i*i;
            }

        }
        System.out.println("sum = "+sum);
    }
}

