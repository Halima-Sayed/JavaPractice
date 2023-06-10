package InheritancePractice;

public class AnimalTester {
    public static void main(String[] args) {
        Panda panda=new Panda();
        panda.sleep();
        panda.color="White and black";
        System.out.println(panda.color);

        Cat cat=new Cat();
        cat.name="Mano";
        cat.speak();

    }
}
