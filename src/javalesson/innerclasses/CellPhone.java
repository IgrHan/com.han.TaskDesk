package javalesson.innerclasses;

public class CellPhone {
	private String make;
	private String model;
	private Display display;
	private RadioModule gsm;
	private AbstractPhoneButton button;

	public interface AbstractPhoneButton{
		void click();
	}

	public void initButton(){
		button = new AbstractPhoneButton() {
			@Override
			public void click() {
				System.out.println("Click this button");
			}
		};
	}

	public CellPhone(String make, String model) {
		this.make = make;
		this.model = model;
	}

	public void turnOn(){
		initDisplay();
		gsm = new RadioModule();
		initButton();
	}

	public void call(String number){
		gsm.call(number);
		button.click();
	}

	public String getMake() {
		return make;
	}

	private void initDisplay(){
		display = new Display();
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

	public Display getDisplay() {
		return display;
	}

	public void setDisplay(Display display) {
		this.display = display;
	}
}
