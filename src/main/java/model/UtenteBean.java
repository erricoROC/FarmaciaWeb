package model;

import java.io.Serializable;
import java.time.LocalDate;

public class UtenteBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	 private int idUtente;
	    private String nome;
	    private String cognome;
	    private String email;
	    private String passwordHash;
	    private String telefono;
	    private String indirizzoSpedizione;
	    private String citta;
	    private String cap;
	    private String prov;
	    private LocalDate dataRegistrazione;
	    private String ruolo;
	    
	    
	    
	    public UtenteBean()
	    {
	    	
	    	
	    }
	    
	    
	    
	    
		public UtenteBean(int idUtente, String nome, String cognome, String email, String passwordHash, String telefono,
				String indirizzoSpedizione, String citta, String cap, String prov, LocalDate dataRegistrazione,
				String ruolo)
		{
			
			this.idUtente = idUtente;
			this.nome = nome;
			this.cognome = cognome;
			this.email = email;
			this.passwordHash = passwordHash;
			this.telefono = telefono;
			this.indirizzoSpedizione = indirizzoSpedizione;
			this.citta = citta;
			this.cap = cap;
			this.prov = prov;
			this.dataRegistrazione = dataRegistrazione;
			this.ruolo = ruolo;
		}
		
		
		public int getIdUtente() {
			return idUtente;
		}
		public void setIdUtente(int idUtente) {
			this.idUtente = idUtente;
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
		public String getPasswordHash() {
			return passwordHash;
		}
		public void setPasswordHash(String passwordHash) {
			this.passwordHash = passwordHash;
		}
		public String getTelefono() {
			return telefono;
		}
		public void setTelefono(String telefono) {
			this.telefono = telefono;
		}
		public String getIndirizzoSpedizione() {
			return indirizzoSpedizione;
		}
		public void setIndirizzoSpedizione(String indirizzoSpedizione) {
			this.indirizzoSpedizione = indirizzoSpedizione;
		}
		public String getCitta() {
			return citta;
		}
		public void setCitta(String citta) {
			this.citta = citta;
		}
		public String getCap() {
			return cap;
		}
		public void setCap(String cap) {
			this.cap = cap;
		}
		public String getProv() {
			return prov;
		}
		public void setProv(String prov) {
			this.prov = prov;
		}
		public LocalDate getDataRegistrazione() {
			return dataRegistrazione;
		}
		public void setDataRegistrazione(LocalDate dataRegistrazione) {
			this.dataRegistrazione = dataRegistrazione;
		}
		public String getRuolo() {
			return ruolo;
		}
		public void setRuolo(String ruolo) {
			this.ruolo = ruolo;
		}
	
	
	    
	    
	    
	    
	    
	    
	    
	    

}//ch.classe
