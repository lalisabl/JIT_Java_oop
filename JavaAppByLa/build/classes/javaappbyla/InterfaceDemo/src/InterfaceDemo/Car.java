
package InterfaceDemo;
public class Car extends Parent implements NewInterface1,NewInterface2 {
    Car(String cl){
    super(cl);
}
    @Override
    public void brandname(String Name) {
        System.out.print(Name);
    }
    @Override
    public int numOfGears(int Num) {
        return Num;
    }
    @Override
   public  int price(int pri){
    return pri;
    }
    @Override
   public void brandname_in( ){
NewInterface1.super.brandname_in();
NewInterface2.super.brandname_in();
   }
}
