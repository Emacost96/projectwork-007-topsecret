package it.corso.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "data_ora_prenotazione")
	private LocalDateTime dataOraPrenotazione;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_opera", referencedColumnName = "id")
	private Opera opera;
	
	@ManyToOne(cascade = CascadeType.REFRESH)
	@JoinColumn(name = "id_utente", referencedColumnName = "id")
	private Utente utente;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public LocalDateTime getDataOraPrenotazione() {
		return dataOraPrenotazione;
	}
	public void setDataOraPrenotazione(LocalDateTime dataOraPrenotazione) {
		this.dataOraPrenotazione = dataOraPrenotazione;
	}
	public Opera getOpera() {
		return opera;
	}
	public void setOpera(Opera opera) {
		this.opera = opera;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	
	
	
	
}
