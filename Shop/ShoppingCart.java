package Shop;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart{
    List<Item> items;

    public ShoppingCart(){
        this.items = new ArrayList<Item>(); 
    }

    public void addItem(Item item){
        this.items.add(item);
    }

    public void removeItem(Item item){
        this.items.remove(item);
    }

    public List getItems(){
        return this.items;
    }

    // public int calculateTotal(){
	// 	int sum = 0;
	// 	for(Item item : items){
	// 		sum += item.getPrice() * item.getCount();
	// 	}
	// 	return sum;
	// }

    
    public void pay(PaymentStrategy paymentMethod,Item item){
       
        String name = item.prodName;
        double price = item.price;
        int count = item.count;
        double amount = price * count;

        paymentMethod.pay(name,price,count,amount);
   
    }
}