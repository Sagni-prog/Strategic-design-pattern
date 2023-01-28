package Shop;

public class Item {
    String prodName;
    String productCode;
    double price;
    int count;

    public Item(String prodName,String prc,double price,int count){
      this.prodName = prodName;
      this.productCode = prc;
      this.price = price;
      this.count = count;
    }

    public String getProductCode(){
        return productCode;
    }

    public double getPrice(){
        return price * count;
    }

    public String getProName(){
        return prodName;
    }

    public int getCount(){
        return count;
    }
}