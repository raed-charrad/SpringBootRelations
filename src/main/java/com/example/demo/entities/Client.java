package com.example.demo.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client{
	@Id
	@GeneratedValue(strategy  = GenerationType.AUTO)
	@Column(name="code")
	private Long code;
	private String nom;
	@OneToMany(mappedBy="client")
	private List<Compte> compte;
	public Client(Long code, String nom, List<Compte> compte) {
		super();
		this.code = code;
		this.nom = nom;
		this.compte = compte;
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
	
	
	
}
