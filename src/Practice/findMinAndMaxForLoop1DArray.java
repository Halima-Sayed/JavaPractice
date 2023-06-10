package Practice;

public class findMinAndMaxForLoop1DArray {
    public static void main(String[] args) {
        /*
        Find min and max temperature using forloop 1D array
         */


    int[] temp={10,90,30,0,50,60,70};
    int highest=temp[0];
    int lowest=temp[0];

        for (int i = 0; i <temp.length; i++) {

        if (temp[i]>highest){
            highest=temp[i];
        } else if (temp[i]<lowest) {
            lowest=temp[i];
        }
    }
        System.out.println(highest);
        System.out.println(lowest);
}
}

