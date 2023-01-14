package polymorphism;
public class Programmer extends Employee {
    double OTPayment,extraPayment;
    Programmer(String nam,double salary,String id,double OTpay,double extraPay){
     super(nam,salary,id);
     OTPayment=OTpay;
     extraPayment=extraPay;
}
    void display_info(){
        super.display_info();
    System.out.println("OTpayment:$"+OTPayment+ "\nextra payment:$"+extraPayment);
    }
}
