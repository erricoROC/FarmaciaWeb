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
	    private String password;
	    private String telefono;
	    private String indirizzoSpedizione;
	    
	    private int nCiv;
	    
	    private String provSpedizione;
	        private String capSpedizione;
	        private String cittaSpedizione;
	        
	    private LocalDate dataRegistrazione;
	    private String ruolo;
	    
	    
	    
	    public UtenteBean()
	    {
	    	
	    	
	    }
	    
	    
	    
	    
		public UtenteBean(int idUtente, String nome, String cognome, String email, String password, String telefono,
				String indirizzoSpedizione, String citta, String cap, String prov,int nCiv, LocalDate dataRegistrazione,
				String ruolo)
		{
			
			this.idUtente = idUtente;
			this.nome = nome;
			this.cognome = cognome;
			this.email = email;
			this.password = password;
			this.telefono = telefono;
			this.indirizzoSpedizione = indirizzoSpedizione;
			this.nCiv=nCiv;
			this.cittaSpedizione = citta;
			
			this.capSpedizione = cap;
			
			this.provSpedizione = prov;
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




		public String getPassword() {
			return password;
		}




		public void setPassword(String password) {
			this.password = password;
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




		public int getnCiv() {
			return nCiv;
		}




		public void setnCiv(int nCiv) {
			this.nCiv = nCiv;
		}




		public String getProvSpedizione() {
			return provSpedizione;
		}




		public void setProvSpedizione(String provSpedizione) {
			this.provSpedizione = provSpedizione;
		}




		public String getCapSpedizione() {
			return capSpedizione;
		}




		public void setCapSpedizione(String capSpedizione) {
			this.capSpedizione = capSpedizione;
		}




		public String getCittaSpedizione() {
			return cittaSpedizione;
		}




		public void setCittaSpedizione(String cittaSpedizione) {
			this.cittaSpedizione = cittaSpedizione;
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
		
		
		
		
		
		





/*

		@Override
		public String toString() {
			return "UtenteBean [idUtente=" + idUtente + ", nome=" + nome + ", cognome=" + cognome + ", email=" + email
					+ ", password=" + password + ", telefono=" + telefono + ", indirizzoSpedizione="
					+ indirizzoSpedizione + ", nCiv=" + nCiv + ", provSpedizione=" + provSpedizione + ", capSpedizione="
					+ capSpedizione + ", cittaSpedizione=" + cittaSpedizione + ", dataRegistrazione="
					+ dataRegistrazione + ", ruolo=" + ruolo + "]";
		}
	
	
	  */  
	    
	    
	    
	    
	    
	    
	    

}//ch.classe
