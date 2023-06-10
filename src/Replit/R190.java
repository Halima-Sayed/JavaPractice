package Replit;

import java.util.LinkedList;

public class R190 {
            public static void main(String[]args){
                LinkedList<Integer> a=new LinkedList<>();
                a.add(0);
                a.add(1);
                for(int i=2; i<10; i++){
                    int sum= a.get(i-2)+a.get(i-1);
                    a.add(sum);
                }
                for(int number:a){
                    System.out.print(number+" ");
                }
            }
        }
