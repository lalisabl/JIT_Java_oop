
package polymorphism;
public class MainClass {
    public static void main(String[] args) {
        Programmer progammer1=new Programmer("Lalisa Bula",2000,"pr102",200,100);
        PHP_Progammer PHP_programmer1=new PHP_Progammer("Abdi",2000,"php234",400);
       progammer1.display_info();
       System.out.println("*******PHP_Progammer information:*********");
       PHP_programmer1.display_inf();
    }
    
}
