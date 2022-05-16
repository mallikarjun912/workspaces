package spring.javabased;

public class Item {
	private int code;
	private String itemname;
	private int quantity;
	
	public void init() {
		System.out.println("** init method executed ");
	}
	public void destroy() {
		System.out.println("** destroy method executed");  
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
