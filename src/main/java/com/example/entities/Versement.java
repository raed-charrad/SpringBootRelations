package com.example.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class Versement extends Operation{

	public Versement(Long numOperation, Date dateOperation, Double montant, Employee operation, Compte oper) {
		super(numOperation, dateOperation, montant, operation, oper);
		// TODO Auto-generated constructor stub
	}

}
