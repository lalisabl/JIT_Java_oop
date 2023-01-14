package polymorphism;
public class Employee {
    String name ;
    double salary;
    String id;
    Employee(String name,double salary,String id){
    this.name=name;
    this.salary=salary;
    this.id=id;
    }
    void display_info(){
    System.out.println("Name: "+name+"\nSalary: $"+salary+"\nID: "+id);
    
    }
}
