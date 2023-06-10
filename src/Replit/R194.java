package Replit;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class R194 {
    public static void main(String[] args) {

        List<String> countries = new LinkedList<>();
        countries.add("Armenia");
        countries.add("USA");
        countries.add("Kazakhstan");
        countries.add("Australia");
        countries.add("Pakistan");
        countries.add("Russia");
        countries.add("Azerbaijan");

        List<String> b=removeStartingWithA(countries);
        System.out.println(b);
    }
    static List<String> removeStartingWithA(List<String> a){
        List<String> list1=new ArrayList<>();
        for(String country:a){
            if(!country.startsWith("A")){
                list1.add(country);
            }
        }
        return list1;

    }
}
