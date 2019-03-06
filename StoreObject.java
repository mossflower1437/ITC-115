import java.text.NumberFormat;

public class StoreObject {
	
	String code;
	String descrip;
	double price;
	int count;
	
	public StoreObject(String code, String descrip, double price, int count) {
		this.code = code;
		this.descrip = descrip;
		this.price = price;
		this.count = count;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getDescrip() {
		return this.descrip;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setDescript(String descrip) {
		this.descrip = descrip;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public String toString() {
		return "Product Code: " + code + "\nDescription: " + descrip + "\nPrice: " + getPriceFormatted() + "\nCount: " + count + "\n";
	}
	
	public String getPriceFormatted() {
        return NumberFormat.getCurrencyInstance().format(this.price);
	}
}


//The product data should include a product code, description, price and product count. 