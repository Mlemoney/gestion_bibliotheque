package Modele;

import java.util.Date;

public class livre {
	private int id;
	private String titre, auteur,categorie,description;
	private Date dateP;
	public livre() {
		super();
	}
	public livre(String titre, String auteur, String categorie, String description, Date dateP) {
		super();
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.description = description;
		this.dateP = dateP;
	}
	public livre(int id, String titre, String auteur, String categorie, String description, Date dateP) {
		super();
		this.id = id;
		this.titre = titre;
		this.auteur = auteur;
		this.categorie = categorie;
		this.description = description;
		this.dateP = dateP;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	public String getCategorie() {
		return categorie;
	}
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getDateP() {
		return dateP;
	}
	public void setDateP(Date dateP) {
		this.dateP = dateP;
	}
	
}
