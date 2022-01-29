package referens.task;

import enums.type.TypeTask;
import enums.sort.Sort;

public class Task {

	private TypeTask type;
	private String name;
	private String description;
	private String employee;
	private Sort sort;

	public Task(){

	}

	public Task(TypeTask type, String name, String employee, Sort sort) {
		this.type = type;
		this.name = name;
		this.employee = employee;
		this.sort = sort;
	}

	public TypeTask getType() {
		return type;
	}

	public void setType(TypeTask type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEmployee() {
		return employee;
	}

	public void setEmployee(String employee) {
		this.employee = employee;
	}

	public Sort getSort() {
		return sort;
	}

	public void setSort(Sort sort) {
		this.sort = sort;
	}

}
