package javalesson.interfaces;

public class Pizza implements Pricable {
	private String name;
	private int quantity;
	private double price;
	private Size size;

	public Pizza(String name, int quantity, double price, Size size) {
		this.name = name;
		this.quantity = quantity;
		this.price = price;
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}

	@Override
	public int calcDeliveryPrice() {
		if(size == Size.BIG || quantity > 1){
			return 0;
		}else {
			return 10;
		}

	}


	@Override
	public int calcOrderPrice() {
		return 55;
	}
}
