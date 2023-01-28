package Shop;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ShoppingCart cart = new ShoppingCart();
		
		Item item1 = new Item("Laptop","1234",70000,3);
		Item item2 = new Item("Phone","5678",20000,1);
		
		cart.addItem(item1);

		cart.addItem(item2);

		int c;

		//pay by paypal1
		
		while(true){
          
			System.out.println("Enter 1 to pay with Paypal");
		    System.out.println("Enter 2 to pay with Your Credit card");
		    Scanner scan = new Scanner(System.in);
			c = scan.nextInt();
			if(c == 1){

				cart.pay(new PayPalStrategy(),item1);
			}


			else{

				cart.pay(new CreditCardStrategy(),item2);
			}

			
		}
}

}