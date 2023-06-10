package Replit;

public class R137 {
    public String name;;
    private  String city;
    String nameOfSchool;
    protected int batchNumber;

    String sentence(String name, String city, String nameOfSchool, int batchNumber){
        return ("My name is "+name+ " and I live in "+city+ ". I study at "+nameOfSchool+ " in batch "+ batchNumber);
    }

    public static void main(String[] args) {

        R137 obj=new R137();
        System.out.println(obj.sentence("John","Miami","Syntax",9));
    }

}
