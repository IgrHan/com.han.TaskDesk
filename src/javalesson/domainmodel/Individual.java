package javalesson.domainmodel;

public class Individual {

	private static int id;
	private int UID;
	private String name;
	private String surname;

	private String inn;
	private int age;

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Individual.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getInn() {
		return inn;
	}

	public void setInn(String inn) {
		this.inn = inn;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Individual(String name, String surname) {
		this.name = name;
		this.surname = surname;
		id = id + 1;
	}

	public Individual() {
		this.UID = id + 1;
	}

	@Override
	public String toString() {
		return "Individual{" +
				"UID=" + UID +
				", name='" + name + '\'' +
				", surname='" + surname + '\'' +
				", inn='" + inn + '\'' +
				", age=" + age +
				'}';
	}
}
