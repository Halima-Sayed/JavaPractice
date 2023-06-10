package Replit;

public class ShoppingStore {
    String item;
    double price;
    int quantity;

    ShoppingStore(String item, double price,int quantity){
        this.item=item;
        this.price=price;
        this.quantity=quantity;
    }
    double itemTotalPrice(){
        double total=price*quantity;


        return total;
    }
}
class shoppingTester{
    public static void main(String[] args){
        ShoppingStore obj1=new ShoppingStore("Blanket",49.99,2);
        System.out.println(obj1.itemTotalPrice());
        ShoppingStore obj2=new ShoppingStore("Mattress",219.59,2);
        System.out.println(obj2.itemTotalPrice());

    }


}