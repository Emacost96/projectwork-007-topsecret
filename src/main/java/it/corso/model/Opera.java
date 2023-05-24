package it.corso.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "opere")
public class Opera {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "tipologia")
	private String tipologia;
	
	@Column(name = "titolo")
	@Pattern(regexp = "[a-zA-Z0-9\\s']{1,50}", message = "Caratteri non ammessi")
	private String titolo;
	
	@Column(name = "anno_di_pubblicazione")
	@Min(value=1940)
	private int annoDiPubblicazione;

	@Column(name = "trama")
	private String trama;
	
	@Column(name = "editore")
	@Pattern(regexp = "[a-zA-Z\\s'.,:]{1,50}", message = "Caratteri non ammessi")
	private String editore;
	
	@Column(name = "regista")
	@Pattern(regexp = "[a-zA-Z\\s']{1,50}", message = "Caratteri non ammessi")
	private String regista;
	
	@Column(name = "cast")
	@Pattern(regexp = "^.{1,}$", message = "Caratteri non ammessi")
	private String cast;
	
	@Column(name = "isbn")
	@Pattern(regexp = "[a-zA-Z0-9]{13}", message = "Caratteri non ammessi")
	private String isbn;
	
	@Column(name = "immagine")
	private String immagine;
	
	@Column(name = "prenotato")
	private boolean prenotato;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipologia() {
		return tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public int getAnnoDiPubblicazione() {
		return annoDiPubblicazione;
	}

	public void setAnnoDiPubblicazione(int annoDiPubblicazione) {
		this.annoDiPubblicazione = annoDiPubblicazione;
	}

	public String getTrama() {
		return trama;
	}

	public void setTrama(String trama) {
		this.trama = trama;
	}

	public String getEditore() {
		return editore;
	}

	public void setEditore(String editore) {
		this.editore = editore;
	}

	public String getRegista() {
		return regista;
	}

	public void setRegista(String regista) {
		this.regista = regista;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getImmagine() {
		return immagine;
	}

	public void setImmagine(String immagine) {
		this.immagine = immagine;
	}

	public boolean isPrenotato() {
		return prenotato;
	}

	public void setPrenotato(boolean prenotato) {
		this.prenotato = prenotato;
	}
	
	
}
