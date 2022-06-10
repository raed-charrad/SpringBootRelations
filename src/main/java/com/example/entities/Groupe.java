package com.example.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="groupe")
public class Groupe {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name="num")
	private Long num;
	private String nom;
	@ManyToMany(mappedBy="groupe")
	private List<Employee> employee;
	public Groupe(Long num, String nom, List<Employee> employee) {
		super();
		this.num = num;
		this.nom = nom;
		this.employee = employee;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	
}
