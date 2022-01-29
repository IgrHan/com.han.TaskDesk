package javalesson.inheritance;

import java.util.ArrayList;
import java.util.List;


public class Engine {

	private double volume;
	private EngineType engineType;
	private  int power;
	private List<Piston> pistons = new ArrayList<>();


	public Engine(double volume, EngineType engineType, int power) {
		this.volume = volume;
		this.engineType = engineType;
		this.power = power;

		for (int i=1; i<=5; i++) {
			this.pistons.add(new Piston(0.3, i));
		}
	}


	public EngineType getEngineType() {
		return engineType;
	}

	public void setEngineType(EngineType engineType) {
		this.engineType = engineType;
	}

	@Override
	public String toString() {
		return "Engine{" +
				"volume=" + volume +
				", engineType=" + engineType +
				", power=" + power +
				", pistons=" + pistons +
				'}';
	}
}
