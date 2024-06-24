package exerciocioPOO;

public class Product {
	
	public String name;
	public double price;
	public int quantity;
	
	
	public double totalValueInStock() {
		return price * quantity;
	}
	
	public void addProducts(int quantityReceive) {
		this.quantity += quantityReceive;
	}
	
	public void removeProducts(int quantityRemove) {
		this.quantity -= quantityRemove;
	}
	
	public String toString() {
		return name 
				+ ", $ "
				+ String.format("%.2f", price) 
				+ ", Quantity: " + quantity 
				+ ", Total value in stock:"
				+ String.format("%.2f", totalValueInStock());
	}

}
