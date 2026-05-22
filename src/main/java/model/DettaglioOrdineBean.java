package model;

import java.io.Serializable;
import java.math.BigDecimal;

public class DettaglioOrdineBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    private int idDettaglioOrdine;
    private String nomeProdotto;
    private int quantita;
    private BigDecimal prezzoUnitario;
    private BigDecimal subTotale;
    private int idOrdine;
    private int idProdotto;

    public DettaglioOrdineBean()
    {


    }

	public int getIdDettaglioOrdine() {
		return idDettaglioOrdine;
	}

	public void setIdDettaglioOrdine(int idDettaglioOrdine) {
		this.idDettaglioOrdine = idDettaglioOrdine;
	}

	public String getNomeProdotto() {
		return nomeProdotto;
	}

	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public BigDecimal getPrezzoUnitario() {
		return prezzoUnitario;
	}

	public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}

	public BigDecimal getSubTotale() {
		return subTotale;
	}

	public void setSubTotale(BigDecimal subTotale) {
		this.subTotale = subTotale;
	}

	public int getIdOrdine() {
		return idOrdine;
	}

	public void setIdOrdine(int idOrdine) {
		this.idOrdine = idOrdine;
	}

	public int getIdProdotto() {
		return idProdotto;
	}

	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}

	
	
	/*
	@Override
	public String toString() {
		return "DettaglioOrdineBean [idDettaglioOrdine=" + idDettaglioOrdine + ", nomeProdotto=" + nomeProdotto
				+ ", quantita=" + quantita + ", prezzoUnitario=" + prezzoUnitario + ", subTotale=" + subTotale
				+ ", idOrdine=" + idOrdine + ", idProdotto=" + idProdotto + "]";
	}

    
    
    */
	
	
	
    /*
	public DettaglioOrdineBean(int idDettaglioOrdine, String nomeProdotto, int quantita, BigDecimal prezzoUnitario,
			BigDecimal subTotale, int idOrdine, int idProdotto) {
		super();
		this.idDettaglioOrdine = idDettaglioOrdine;
		this.nomeProdotto = nomeProdotto;
		this.quantita = quantita;
		this.prezzoUnitario = prezzoUnitario;
		this.subTotale = subTotale;
		this.idOrdine = idOrdine;
		this.idProdotto = idProdotto;
	}
	
	
	*/
	
	
	
	
	
	

	
	
	

}//ch.classe
