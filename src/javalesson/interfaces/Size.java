package javalesson.interfaces;

public enum Size {
	BIG ("Большая"), AVERAGE("Средняя"), SMALL("Маленькая");

	private String abbreviation;

	public String getAbbreviation() {
		return abbreviation;
	}

	Size(String abbreviation) {
		this.abbreviation = abbreviation;
	}
}
