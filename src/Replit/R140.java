package Replit;

import javax.imageio.metadata.IIOMetadataFormatImpl;

public class R140 {
    public static void main(String[] args) {
        String[] arr = {"hey","yolo","hi","this is long"};
        System.out.println(maxLength(arr));
        //should print "this is long"
    }
    static String maxLength(String [] words){
        //int max = 0;
        String longest = "";
        for (int i = 0; i < words.length ; i++) {
           String a=words[i];
            if (a.length()>longest.length()) {
                longest=a;
            }

        }

       /* for (String a : words) {
            if (a.length() > max) {
                max = a.length();
                longest = a;
            }
        }

        */
        return longest;
    }
}
