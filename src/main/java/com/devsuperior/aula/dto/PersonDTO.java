package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Person;

public class PersonDTO {

    private Long id;
    private String name;
    private Double salary;
    private Long departmentId;

    public PersonDTO(){
    }

    public PersonDTO(Long id, Double salary, String name, Long departmentId) {
        this.id = id;
        this.salary = salary;
        this.name = name;
        this.departmentId = departmentId;
    }
    public PersonDTO(Person entity) {
        id = entity.getId();
        salary = entity.getSalary();
        name = entity.getName();
        departmentId = entity.getDepartment().getId();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

}

