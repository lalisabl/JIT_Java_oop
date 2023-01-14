/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author Lalisa
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //Engineer sw=new Engineer("lalisa","bula",1.0,60.0);  
      //sw.printData();
      Employee mn=new manager("bula","Tilahun",10000);
      mn.printData();
      
      System.out.println("Here we go: "+mn.x);
        // TODO code application logic here
    }
    
}
