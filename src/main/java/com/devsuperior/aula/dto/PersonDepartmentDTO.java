package com.devsuperior.aula.dto;

import java.util.Objects;

import com.devsuperior.aula.entities.Person;

public class PersonDepartmentDTO {
	
	private Long   id;
	private String name;
	private Double salary;
	
	private DepartmentDTO department;
	
	public PersonDepartmentDTO() {
		
	}

	public PersonDepartmentDTO(Long id, String name, Double salary, DepartmentDTO department) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
	}
	
	public PersonDepartmentDTO(Person entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.salary = entity.getSalary();
		this.department = new DepartmentDTO(entity.getDepartment());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public DepartmentDTO getDepartment() {
		return department;
	}

	public void setDepartmentDto(DepartmentDTO departmentDto) {
		this.department = departmentDto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonDepartmentDTO other = (PersonDepartmentDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "PersonDepartmentDTO [id=" + id + ", name=" + name + ", salary=" + salary + ", departmentDto="
				+ department + "]";
	}
	
	
	
}
