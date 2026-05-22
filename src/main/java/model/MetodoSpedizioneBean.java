package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class MetodoSpedizioneBean implements Serializable 
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	  private int idMetodoSpedizione;
	    private String nomeMetodo;
	    private BigDecimal costo;
	    private String descrizione;
	    private int attivo;

	    public MetodoSpedizioneBean()
	 {
	    }

	    
	    
		public int getIdMetodoSpedizione() {
			return idMetodoSpedizione;
		}

		public void setIdMetodoSpedizione(int idMetodoSpedizione) {
			this.idMetodoSpedizione = idMetodoSpedizione;
		}

		public String getNomeMetodo() {
			return nomeMetodo;
		}

		public void setNomeMetodo(String nomeMetodo) {
			this.nomeMetodo = nomeMetodo;
		}

		public BigDecimal getCosto() {
			return costo;
		}

		public void setCosto(BigDecimal costo) {
			this.costo = costo;
		}

		public String getDescrizione() {
			return descrizione;
		}

		public void setDescrizione(String descrizione) {
			this.descrizione = descrizione;
		}

		public int getAttivo() {
			return attivo;
		}

		public void setAttivo(int attivo) {
			this.attivo = attivo;
		}


/*
		@Override
		public String toString() {
			return "MetodoSpedizioneBean [idMetodoSpedizione=" + idMetodoSpedizione + ", nomeMetodo=" + nomeMetodo
					+ ", costo=" + costo + ", descrizione=" + descrizione + ", attivo=" + attivo + "]";
		}
		
		
*/
		
		
		
	    
	    /*
		public MetodoSpedizioneBean(int idMetodoSpedizione, String nomeMetodo, BigDecimal costo, String descrizione,
				int attivo) {
			super();
			this.idMetodoSpedizione = idMetodoSpedizione;
			this.nomeMetodo = nomeMetodo;
			this.costo = costo;
			this.descrizione = descrizione;
			this.attivo = attivo;
		}

	*/
	
	
	
	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
}//ch.classe
