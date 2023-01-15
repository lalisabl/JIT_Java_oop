
package InterfaceDemo;
public class Parent {
   private String color;
    Parent(String color){
    this.color=color;
    }
     String getcolor(){
    return String.format("%s", color);
    }
}
