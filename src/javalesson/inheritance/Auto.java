package javalesson.inheritance;


public abstract class Auto {

	private String producer;
	private String model;
	private Engine engine;
	private int currentSpeed;
	protected boolean isRunning;

	public abstract void energize();

	public Auto(String producer, String model, Engine engine) {
		this.producer = producer;
		this.model = model;
		this.engine = engine;
		System.out.println("Auto was initialized");
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}


	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public int getCurrentSpeed() {
		return currentSpeed;
	}

	public void setCurrentSpeed(int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}

	public boolean isRunning() {
		return isRunning;
	}

	public void setRunning(boolean running) {
		isRunning = running;
	}

	public void start(){
		isRunning = true;
		currentSpeed = 10;
		System.out.println("Auto is starting");
	}

	public void stop(){

		for ( int i =  currentSpeed; i >= 1; i--){
			currentSpeed -= 1;
			System.out.println("current speed is "+ currentSpeed);
		}
		isRunning = false;
		System.out.println("Auto has stopped");
	}

	public void accelerate (int kmPerHour){
		currentSpeed+=kmPerHour;
		System.out.println("Accelerating. Current speed is "+ currentSpeed + " kmPerHour");
	}

	@Override
	public String toString() {
		return "Auto{" +
				"producer='" + producer + '\'' +
				", model='" + model + '\'' +
				", type=" + engine +
				", currentSpeed=" + currentSpeed +
				", isRunning=" + isRunning +
				'}';
	}


}
