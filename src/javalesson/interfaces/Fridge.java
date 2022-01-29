package javalesson.interfaces;

public class Fridge extends Electronics implements Pricable{

	public Fridge(String make, String model, int quantity, double price) {
		super(make, model, quantity, price);
	}

	@Override
	public int calcDeliveryPrice() {



	if(getPrice() > 3000){
		return 0;
	}else{
		return 30;
	}
	}

	@Override
	public int calcOrderPrice() {
		return 15220;
	}

}
