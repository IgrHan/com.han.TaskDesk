package javalesson.inheritance;

public class ElectricCar extends Auto{

	private int betteryVolume;
	private int passengersNumber;

	public ElectricCar(String producer, String model, int betteryVolume, int passengersNumber) {
		super(producer, model, new Engine( 8, EngineType.ELECTRIC, 120));
		this.betteryVolume = betteryVolume;
		this.passengersNumber = passengersNumber;
	}

	private void charge(){
		System.out.println("Bettery is charging");
	}

	public int getBetteryVolume() {
		return betteryVolume;
	}

	public void setBetteryVolume(int betteryVolume) {
		this.betteryVolume = betteryVolume;
	}

	public int getPassengersNumber() {
		return passengersNumber;
	}

	public void setPassengersNumber(int passengersNumber) {
		this.passengersNumber = passengersNumber;
	}

	@Override
	public void energize() {
		charge();
	}
}
