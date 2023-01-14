/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.*;

public class Engineer extends Employee {
    private double hours_worked,wages;
    public Engineer(String fname, String lname,double hours,double rate) {
                super(fname, lname);
        hours_worked=hours;
        wages=rate;
        System.out.println("subclass constractor is called!"+this.getClass());
    }
  public double getpay(){
  return hours_worked*wages;
  }

    @Override
    public void printData() {
        System.out.print("Engineer's name: ");
        super.printData(); //To change body of generated methods, choose Tools | Templates.
        System.out.print("Weekly pay: $"+getpay()+" payments\n ");
    }
}
