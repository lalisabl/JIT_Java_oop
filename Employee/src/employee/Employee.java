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
public class Employee {
    private String fristName,lastName;
    public Employee(String fname,String lname ){
    fristName=fname;
    lastName=lname;
    }
    int x=10;
    public void printData(){
    System.out.print(fristName+" "+lastName+"\n");
    }
}
