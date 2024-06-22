package Modele;

public class users {
	private int id;
	private String nom, password, email, role;
	public users() {
		super();
	}
	public users(String nom, String password, String email, String role) {
		super();
		this.nom = nom;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public users(int id, String nom, String password, String email, String role) {
		super();
		this.id = id;
		this.nom = nom;
		this.password = password;
		this.email = email;
		this.role = role;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	
}

