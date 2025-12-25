package Unit_3;
interface payment{
    void payment();   //abstract method
}

class creditCard implements payment{
    @Override
    public void payment(){
        System.out.println("Payement done by credit card");
    }
}
class debitCard implements payment{
    @Override
    public void payment(){
        System.out.println("Payement done by debit card");
    }
}
class cash implements payment{
    @Override
    public void payment(){
        System.out.println("Payement done by cash");
    }
}
public class myInterface{
    public static void main(String[] args){
        payment obj = new creditCard(); // creating object of creditCard class
        obj.payment(); // calling payment method of creditCard class
        obj = new debitCard(); // creating object of debitCard class
        obj.payment(); // calling payment method of debitCard class
        obj = new cash(); // creating object of cash class
        obj.payment(); // calling payment method of cash class
        

    }
    
}
