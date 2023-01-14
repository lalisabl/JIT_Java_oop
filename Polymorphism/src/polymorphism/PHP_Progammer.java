package polymorphism;
public class PHP_Progammer extends Employee {
    double PHPOTPayment;
    PHP_Progammer (String name,double salary, String id,double PHPOTpay){
    super(name,salary,id);
    PHPOTPayment=PHPOTpay;
    }
    void display_inf(){
        super.display_info();
    System.out.println("PHP_OTpayment:$"+PHPOTPayment);
    }
}
