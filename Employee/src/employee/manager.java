/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

public class manager extends Employee {
private int salary;
int x=20;
    public manager(String fname, String lname,int salar) {
        super(fname, lname);
        salary=salar;
    }
public void printData(){
System.out.print("manager's name:");
//super.printData();
System.out.println("gets $"+salary+" per month");

}
}
