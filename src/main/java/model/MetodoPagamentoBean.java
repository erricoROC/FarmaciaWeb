package model;

import java.io.Serializable;

public class MetodoPagamentoBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int idMetodoPagamento;

	private String nomeMetodo;

	private String descrizione;

	private int attivo;



	   public MetodoPagamentoBean() 
	{
	    }



	   public int getIdMetodoPagamento() {
		   return idMetodoPagamento;
	   }



	   public void setIdMetodoPagamento(int idMetodoPagamento) {
		   this.idMetodoPagamento = idMetodoPagamento;
	   }



	   public String getNomeMetodo() {
		   return nomeMetodo;
	   }



	   public void setNomeMetodo(String nomeMetodo) {
		   this.nomeMetodo = nomeMetodo;
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
		return "MetodoPagamentoBean [idMetodoPagamento=" + idMetodoPagamento + ", nomeMetodo=" + nomeMetodo
				+ ", descrizione=" + descrizione + ", attivo=" + attivo + "]";
	   }
	   
	   
*/
	   
	   
	   

/*
	   public MetodoPagamentoBean(int idMetodoPagamento, String nomeMetodo, String descrizione, int attivo) {
		super();
		this.idMetodoPagamento = idMetodoPagamento;
		this.nomeMetodo = nomeMetodo;
		this.descrizione = descrizione;
		this.attivo = attivo;
	   }
	   
	   
	   */
	   
	   
	   
	   
	   
	
	
	
}//ch.classe
