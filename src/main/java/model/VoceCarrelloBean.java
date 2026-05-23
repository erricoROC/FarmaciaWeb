package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class VoceCarrelloBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
    private String nomeProdotto;
    
    private BigDecimal prezzoUnitario;
    private BigDecimal subT;
    
    private int idProdotto;



private int quantita;




	
public VoceCarrelloBean()
{



}//ch.costr.

public String getNomeProdotto() {
	return nomeProdotto;
}

public void setNomeProdotto(String nomeProdotto) {
	this.nomeProdotto = nomeProdotto;
}

public BigDecimal getPrezzoUnitario() {
	return prezzoUnitario;
}

public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
	this.prezzoUnitario = prezzoUnitario;
}

public BigDecimal getSubT() {
	return subT;
}

public void setSubT(BigDecimal subT) {
	this.subT = subT;
}

public int getIdProdotto() {
	return idProdotto;
}

public void setIdProdotto(int idProdotto) {
	this.idProdotto = idProdotto;
}

public int getQuantita() {
	return quantita;
}

public void setQuantita(int quantita) {
	this.quantita = quantita;
}




/*
@Override
public String toString() {
	return "VoceCarrelloBean [nomeProdotto=" + nomeProdotto + ", prezzoUnitario=" + prezzoUnitario + ", subT=" + subT
			+ ", idProdotto=" + idProdotto + ", quantita=" + quantita + "]";
}

*/




/*
public VoceCarrelloBean(String nomeProdotto, BigDecimal prezzoUnitario, BigDecimal subT, int idProdotto, int quantita) {
	super();
	this.nomeProdotto = nomeProdotto;
	this.prezzoUnitario = prezzoUnitario;
	this.subT = subT;
	this.idProdotto = idProdotto;
	this.quantita = quantita;
}

*/






	
	
	

}//ch.classe
