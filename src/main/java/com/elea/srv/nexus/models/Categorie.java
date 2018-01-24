package com.elea.srv.nexus.models;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
@Table(name = "categories")

public class Categorie implements Serializable {
	
	static final long serialVersionUID = -1618276868208557367L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@OneToMany(mappedBy = "categorie", fetch = FetchType.LAZY)
	@JsonIgnore
	private List<Soft> softs;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Soft> getSofts() {
		return softs;
	}

	public void setSofts(List<Soft> softs) {
		this.softs = softs;
	}


	

}
