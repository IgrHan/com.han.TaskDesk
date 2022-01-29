package javalesson.interfaces;

public abstract class Electronics implements Deliverable{
	private String make;
	private String model;
	private int quantity;
	private  double price;

	public Electronics(String make, String model, int quantity, double price) {
		this.make = make;
		this.model = model;
		this.quantity = quantity;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
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
}
