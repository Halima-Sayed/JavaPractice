package Replit;


    abstract class Tea{
        public String teaType;

        Tea(String teaType){
            this.teaType=teaType;
        }
        abstract void addSugar();
    }
class LemonTea extends Tea{

    LemonTea(String teaType) {
        super(teaType);
    }

    @Override
    void addSugar() {

    }
}
class ChaiTea extends Tea{
    ChaiTea(String teaType){
        super("Chai Tea");
    }
    @Override
    void addSugar(){
        System.out.println("For "+teaType+ " we need 1 spoon of sugar");
    }
}

class Main1 {
    public static void main(String [] args){
        LemonTea lT=new LemonTea("Lemon Tea");
        lT.addSugar();
        ChaiTea cT=new ChaiTea("Chai Tea");
        cT.addSugar();
    }
}
