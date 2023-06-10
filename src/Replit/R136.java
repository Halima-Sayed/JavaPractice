package Replit;

public class R136 {


    private void privateMethod(){
        System.out.println("This is Private Method");
    }
    void defaultMethod(){
        System.out.println("This is a Default Method");
    }
    protected void protectedMethod(){
        System.out.println("This is protected Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args){
        //To call the methods above without creating an object just make the method static because the main method is static
        R136 obj=new R136();
        obj.privateMethod();
        obj.defaultMethod();
        obj.protectedMethod();
        obj.publicMethod();


    }
}
