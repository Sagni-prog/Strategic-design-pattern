package Shop;

import java.util.List;
import java.util.Scanner;

public class CreditCardStrategy implements PaymentStrategy{

    private String name;
	private String cardNumber;
	private String password;
	List items;
	
	public CreditCardStrategy(){
          		
		System.out.println("Enter your Name");
		Scanner scan = new Scanner(System.in);
		this.name = scan.nextLine();
		System.out.println("Enter your Credit Card Number");
		this.cardNumber = scan.nextLine();
		System.out.println("Enter Your Password");
		this.password = scan.nextLine();

	}
	@Override
	public void pay(String ProdName,double Price,int count,double amount) {
		if(this.name.equals("Robera") && this.cardNumber.equals("1234") && this.password.equals("123")){
		System.out.println("\nProduct: " + ProdName + "  |Price: " + Price + " |Amount: " + count + " |Total Price: " + amount + "|Paid Via Credit Card");
		System.out.println("-----------------------------------------------------------------------------------------------------------------\n");
	}
	else{
        System.out.println("\nInvalid Credential");
        System.out.println("-----------------------------------------------------------------------------------------------------------------\n");

        return;
    }
}
}


