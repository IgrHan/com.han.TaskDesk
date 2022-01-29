package javalesson.inheritance;

public class Bus extends FuelAuto {

	private int passengerNumber;

	public Bus(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int passengerNumber) {
		super(producer, model, engine, availablePetrol, tankVolume);
		this.passengerNumber = passengerNumber;
	}

	@Override
	public void start() {
		isRunning = true;
		setCurrentSpeed(15);
		System.out.println("Bus is starting");
	}

	public int getPassengerNumber() {
		return passengerNumber;
	}

	public void fuelUp(){
		int volume = getTankVolume() - getAvailablePetrol();
		fuelUp(volume);
	}

	@Override
	public void fuelUp(int petrolVolume) {

		int volume = getAvailablePetrol()+petrolVolume;
		if (volume > getTankVolume()){
			setAvailablePetrol(getTankVolume());
		}
	}

	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	public void pickUpPassengers(int passengerNumber){
		this.passengerNumber +=passengerNumber;
		System.out.println("Picking up "+this.passengerNumber+" passengers");
	}

	public void releasePassengers(){
		if(isRunning){
			stop();
		}
		passengerNumber = 0;
		System.out.println("Passengers released");
	}

	@Override
	public void energize() {
		fuelUp(getTankVolume()-getAvailablePetrol());
	}
}
