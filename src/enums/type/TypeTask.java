package enums.type;

public enum TypeTask {

	DEVELOP ("Разработка"), BUG_FIX ("Исправление ошибки"), HELP("Помощь консультанта"), UNDEFINED("Неопределено");

	public String getAbbreviation() {
		return abbreviation;
	}

	private String abbreviation;

	TypeTask(String abbreviation){
		this.abbreviation = abbreviation;
	}

}
