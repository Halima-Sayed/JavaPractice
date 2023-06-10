package Class13HWDifferentWays;

class Parent{


    public void method1() {

        System.out.println("I am parent public method");}

    protected void method2() {

        System.out.println("I am parent protected method");}
}
class child extends Parent {

    @Override
    public void method1() {
        super.method1();
        System.out.println("I am a child public method");

    }

    @Override
    protected void method2() {
        super.method2();
        System.out.println("I am a child public method");

    }


    public static void main(String[] args) {
        child obj = new child();
        obj.method1();
        obj.method2();
      //  obj.method3();
    }
}