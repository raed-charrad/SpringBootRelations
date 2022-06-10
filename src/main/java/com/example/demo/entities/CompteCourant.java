package com.example.demo.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class CompteCourant extends Compte{
	

	private Double decouvert;
	public CompteCourant(String numCompte, Date dateCreation, Double solde, Client client, Employee employee,
			List<Operation> operation , Double decouvert) {
		super(numCompte, dateCreation, solde, client, employee, operation);
		this.setDecouvert(decouvert);
		// TODO Auto-generated constructor stub
	}
	public Double getDecouvert() {
		return decouvert;
	}
	public void setDecouvert(Double decouvert) {
		this.decouvert = decouvert;
	}
	
}
