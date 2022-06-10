package com.example.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class CompteEpargne extends Compte {
	private Double taux;

	public CompteEpargne(String numCompte, Date dateCreation, Double solde, Client client, Employee employee,
			List<Operation> operation, Double taux) {
		super(numCompte, dateCreation, solde, client, employee, operation);
		this.setTaux(taux);
	}

	public Double getTaux() {
		return taux;
	}

	public void setTaux(Double taux) {
		this.taux = taux;
	}
	
}
