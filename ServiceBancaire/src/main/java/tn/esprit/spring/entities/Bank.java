package tn.esprit.spring.entities;

import java.io.Serializable;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_BANK")
public class Bank implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idBank")
	private Long id;
	
	@Column(name = "nameBank")
	private String name;
	
	@Column(name = "descriptionBank")
	private String description;

	
	
		@OneToMany(cascade = CascadeType.ALL)
		private Set<BankOffers> bankOffer;
		
		
		
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}
                     
	




	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<BankOffers> getBankOffer() {
		return bankOffer;
	}

	public void setBankOffer(Set<BankOffers> bankOffer) {
		this.bankOffer = bankOffer;
	}

	
	
}
