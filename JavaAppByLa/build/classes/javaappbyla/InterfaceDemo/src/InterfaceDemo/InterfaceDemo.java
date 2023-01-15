package InterfaceDemo;
public class InterfaceDemo {
    public static void main(String[] args) {
Car car1=new Car("blue");
car1.brandname_in();
car1.brandname("Suzuki");
System.out.print(" has "+car1.numOfGears(6)+" gears");
System.out.println(" with "+car1.getcolor()+" color.");
System.out.println(car1.comment);
System.out.println("Price: $"+car1.price(300));
    }
   
}
