package Replit;

public class R99WithoutScanner {
    public static void main(String[] args) {

        String str="Evil Olive";
        str=str.replace(" ","");
       // String reversed="";
        boolean isEqual=true;

        StringBuilder sb= new StringBuilder(str);
        sb=sb.reverse();
        String reversed=sb.toString();
        if (str.equalsIgnoreCase(reversed)){
            System.out.println(isEqual);
        }else{
            System.out.println(!isEqual);
        }

        //Another way remove line 9 til 19 and place in below
      /*  for (int i = str.length()-1; i>=0 ; i--) {
            reversed+=str.charAt(i);
        }
        boolean equals=str.equalsIgnoreCase(reversed);
        System.out.println(equals);
       */
        }

}
