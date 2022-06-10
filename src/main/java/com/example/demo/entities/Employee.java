package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name="code")
	private Long code;
	private String nom;
	@OneToMany(mappedBy="employee")
	private List<Compte> compte;
	@ManyToOne
	@JoinColumn(name="code_Sup" ,nullable=false)
	private Employee empl;
	@OneToMany(mappedBy="empl")
	private List<Employee> employ;
	@ManyToMany
	@JoinTable(
		name="emp_grp",
		joinColumns=@JoinColumn(name="emp_id"),
		inverseJoinColumns=@JoinColumn(name="grp_id"))
	private List<Groupe> groupe;
	@OneToMany(mappedBy="operation")
	private List<Operation> operation;
	public Employee(Long code, String nom, List<Compte> compte, List<Employee> employ, Employee empl,
			List<Groupe> groupe, List<Operation> operation) {
		super();
		this.code = code;
		this.nom = nom;
		this.compte = compte;
		this.employ = employ;
		this.empl = empl;
		this.groupe = groupe;
		this.operation = operation;
	}
	public Long getCode() {
		return code;
	}
	public void setCode(Long code) {
		this.code = code;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Compte> getCompte() {
		return compte;
	}
	public void setCompte(List<Compte> compte) {
		this.compte = compte;
	}
	public List<Employee> getEmploy() {
		return employ;
	}
	public void setEmploy(List<Employee> employ) {
		this.employ = employ;
	}
	public Employee getEmpl() {
		return empl;
	}
	public void setEmpl(Employee empl) {
		this.empl = empl;
	}
	public List<Groupe> getGroupe() {
		return groupe;
	}
	public void setGroupe(List<Groupe> groupe) {
		this.groupe = groupe;
	}
	public List<Operation> getOperation() {
		return operation;
	}
	public void setOperation(List<Operation> operation) {
		this.operation = operation;
	}
	

}
