package it.corso.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "nome")
	@Pattern(regexp = "[a-zA-Z\\s']{1,50}", message = "Caratteri non ammessi")
	private String nome;
	
	@Column(name = "cognome")
	@Pattern(regexp = "[a-zA-Z\\s']{1,50}", message = "Caratteri non ammessi")
	private String cognome;
	
	@Column(name = "email")
	@Pattern(regexp = "[a-zA-Z0-9._-]+@[a-zA-Z0-9._-]+\\.[a-zA-Z]{2,6}", message = "Mail non valida")
	private String email;
	
	@Column(name = "username")
	@Pattern(regexp = "[a-zA-Z0-9.]{1,20}", message = "Caratteri non ammessi")
	private String username;
	
	@Column(name = "password")
	/*
	 * @Pattern(regexp = "(?=.*\\\\d)(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]{4,20}",
	 * message = "Password troppo debole")
	 */
	private String password;
	
	@OneToMany(mappedBy = "utente", cascade = CascadeType.REFRESH, fetch = FetchType.EAGER, orphanRemoval = true)
	List<Prenotazione> prenotazioni = new ArrayList<>();
	
	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}
	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}