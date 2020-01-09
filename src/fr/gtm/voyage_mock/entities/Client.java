package fr.gtm.voyage_mock.entities;

public class Client {
	
	private String nom;
	private String numero;
	private Long id;
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client(String nom, String numero, Long id) {
		this.nom = nom;
		this.numero = numero;
		this.id = id;
	}

}
