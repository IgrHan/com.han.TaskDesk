package javalesson.inheritance;

public class Truck extends FuelAuto {

	private int cargoWeight;

	public Truck(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
		super(producer, model, engine, availablePetrol, tankVolume);
		this.cargoWeight = cargoWeight;
	}

	@Override
	public void start() {
		isRunning = true;
		setCurrentSpeed(15);
		System.out.println("Truck is starting");
	}

	public int getCargoWeight() {
		return cargoWeight;
	}

	public void setCargoWeight(int cargoWeight) {
		this.cargoWeight = cargoWeight;
	}

	public void load(){
		System.out.println("Cargo loaded");
	}

	public void unload(){
		System.out.println("Cargo unload");
	}

	@Override
	public void energize() {
		fuelUp(getTankVolume()-getAvailablePetrol());
	}
}
