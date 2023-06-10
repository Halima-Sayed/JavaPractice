package Replit;

public class EncapsulationDemo {
    private String empName;
    private int empAge;

    public String getEmpName(){
        return empName;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public int getEmpAge(){
        return empAge;
    }
    public void setEmpAge(int empAge){
        this.empAge=empAge;
    }

}
class Main178 {
    public static void main(String[] args){
        EncapsulationDemo obj=new EncapsulationDemo();
        obj.setEmpName("John");
        obj.setEmpAge(30);

        System.out.println(obj.getEmpName());
        System.out.println(obj.getEmpAge());
    }
}
