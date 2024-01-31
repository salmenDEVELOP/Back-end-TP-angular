package soa.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categorie 
{
	@Id
	@GeneratedValue
	private Long id;
	
	@Column(length = 50)
	private String code;
	
	@Column(length = 50)
	private String libelle;
	
	
	@OneToMany (mappedBy = "categorie" ,cascade = {CascadeType.REMOVE  , CascadeType.MERGE , CascadeType.PERSIST})

    private Collection <Produit> produits = new ArrayList<Produit>();

	public Categorie(Object o, Object o1, Object o2) {
		this.id=null;
		this.code=null;
		this.libelle=null;
	}


	@JsonIgnore
	public Collection<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Collection<Produit> produits) {
		this.produits = produits;
	}
	
	public Categorie(String code, String libelle) {
		super();
		this.code = code;
		this.libelle = libelle;
	}

	@Override
	public String toString() {
		return "Categorie [id=" + id + ", code=" + code + ", libelle=" + libelle + "]";
	}

	public Categorie() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Categorie categorie)) return false;
		return Objects.equals(getId(), categorie.getId()) && Objects.equals(getCode(), categorie.getCode()) && Objects.equals(getLibelle(), categorie.getLibelle());
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId(), getCode(), getLibelle());
	}
}
