package com.example.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="operation")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="type_Operation",
discriminatorType=DiscriminatorType.INTEGER)
public class Operation {
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name="numOperation")
	private Long numOperation;
	private Date dateOperation;
	private Double montant;
	@ManyToOne
	@JoinColumn(name="code_emp" ,nullable=false)
	private Employee operation;
	@ManyToOne
	@JoinColumn(name="code_cpt" ,nullable=false)
	private Compte oper;
	public Operation(Long numOperation, Date dateOperation, Double montant, Employee operation, Compte oper) {
		super();
		this.numOperation = numOperation;
		this.dateOperation = dateOperation;
		this.montant = montant;
		this.operation = operation;
		this.oper = oper;
	}
	public Long getNumOperation() {
		return numOperation;
	}
	public void setNumOperation(Long numOperation) {
		this.numOperation = numOperation;
	}
	public Date getDateOperation() {
		return dateOperation;
	}
	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}
	public Double getMontant() {
		return montant;
	}
	public void setMontant(Double montant) {
		this.montant = montant;
	}
	public Employee getOperation() {
		return operation;
	}
	public void setOperation(Employee operation) {
		this.operation = operation;
	}
	public Compte getOper() {
		return oper;
	}
	public void setOper(Compte oper) {
		this.oper = oper;
	}
	
}
