package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {

	private Long   id;
	private String name;
	private Double salary;
	private Long departmentId;
	
	
	public PersonDTO(Long id, String name, Double salary, Long departmentId) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.departmentId = departmentId;
	}
	
	public PersonDTO(Person entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
		this.salary = entity.getSalary();
		this.departmentId = entity.getDepartment().getId();
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

	public Long getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(Long departmentId) {
		this.departmentId = departmentId;
	}

	
	
}
