package Shop;

import java.security.Policy;
import java.util.List;
import java.util.Scanner;

public class PayPalStrategy implements PaymentStrategy{

    private String email;
    private String password;
    List items;

    public PayPalStrategy(){
       
        System.out.println("Enter your Email");
        Scanner scan = new Scanner(System.in);
        email = scan.nextLine();
        System.out.println("Enter your Password");
        password = scan.nextLine();
        this.email = email;
        this.password = password;
       
    }

    @Override
    public void pay(String ProdName,double Price,int count,double amount) {
        if(this.email.equals("sagni@gmail.com") && this.password.equals("123")){
        

        System.out.println("\nProduct: " + ProdName + "  |Price: " + Price + " |Amount: " + count + " |Total Price: " + amount + "|Paid Via Paypal");
        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
    }
    else{
        System.out.println("\nInvalid Credential");
        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");

        return;
    }
}
    
}