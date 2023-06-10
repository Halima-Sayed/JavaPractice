package Replit;

public class R138 {
    private String privateMethod(){
        return "private";
    }
    String defaultMethod(){
        return "default";
    }
    protected String protectedMethod(){
        return "protected";
    }
    public String publicMethod(){
        return "public";
    }

}

class R138Tester {
    public static void main(String [] args){

        R138 obj=new R138();
      //  System.out.println(obj.privateMethod());
        System.out.println(obj.defaultMethod());
        System.out.println(obj.protectedMethod());
        System.out.println(obj.publicMethod());

    }
}
