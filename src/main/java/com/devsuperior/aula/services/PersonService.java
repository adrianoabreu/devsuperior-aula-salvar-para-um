package com.devsuperior.aula.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.aula.dto.PersonDepartmentDTO;
import com.devsuperior.aula.entities.Department;
import com.devsuperior.aula.entities.Person;
import com.devsuperior.aula.repositories.DepartmentRepository;
import com.devsuperior.aula.repositories.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository repository;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	public PersonDepartmentDTO insert(PersonDepartmentDTO dto) {
		
		Person entity = new Person();
		entity.setName(dto.getName());
		entity.setSalary(dto.getSalary());
	
		Department dept = departmentRepository.getReferenceById(dto.getDepartment().getId()); //Obtem Id e Nome do Department

//      Obtem somente Id do Department e o nome retorna null		
//		Department dept = new Department();
//		dept.setId(dto.getDepartment().getId());
		
		entity.setDepartment(dept);  //aqui acontece a associação entre Person e Department
		
		entity = repository.save(entity);
		
		return new PersonDepartmentDTO(entity);
		
	}
}