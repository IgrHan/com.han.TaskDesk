package referens.employee;

import javalesson.domainmodel.Individual;

public class Employee extends Individual {
	public String position;

	@Override
	public int getAge() {
		return super.getAge();
	}

	@Override
	public void setAge(int age) {
		super.setAge(age);
	}

	@Override
	public void setName(String name) {
		super.setName(name);
	}

	@Override
	public String getName() {
		return super.getName();
	}



	public Employee(String name, String surname) {
		super(name, surname);
	}

	public Employee(String name, String surname, String position) {
		super(name, surname);
		this.position =position;
	}

	@Override
	public String toString() {
		return "Employee{" +
				"position='" + position + '\'' +
				"name='" + super.getName() + '\'' +
				"surname='" + super.getSurname() + '\'' +
				'}';
	}
}
