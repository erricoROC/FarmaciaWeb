package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Arrays;

public class ProdottoBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private int idProdotto;

	private String nomeProdotto;


	private String descrizione;

	private String formato;


	private String marca;

	private BigDecimal prezzoUnitario;

	private int quantitaDisponibile;

	private byte[] immagine;

	private String mimeType;

	private int attivo;

	private int idCategoria;
	
	
	public  ProdottoBean()
	{


	}//ch.costr.
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	
	public ProdottoBean(int idProdotto, String nomeProdotto, String descrizione, String formato, String marca,
			BigDecimal prezzoUnitario, int quantitaDisponibile, byte[] immagine, String mimeType, int attivo,
			int idCategoria) {
		super();
		this.idProdotto = idProdotto;
		this.nomeProdotto = nomeProdotto;
		this.descrizione = descrizione;
		this.formato = formato;
		this.marca = marca;
		this.prezzoUnitario = prezzoUnitario;
		this.quantitaDisponibile = quantitaDisponibile;
		this.immagine = immagine;
		this.mimeType = mimeType;
		this.attivo = attivo;
		this.idCategoria = idCategoria;
	}


*/











	public boolean hasImage() {
        return immagine != null;
    }












	public int getIdProdotto() {
		return idProdotto;
	}












	public void setIdProdotto(int idProdotto) {
		this.idProdotto = idProdotto;
	}












	public String getNomeProdotto() {
		return nomeProdotto;
	}












	public void setNomeProdotto(String nomeProdotto) {
		this.nomeProdotto = nomeProdotto;
	}












	public String getDescrizione() {
		return descrizione;
	}












	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}












	public String getFormato() {
		return formato;
	}












	public void setFormato(String formato) {
		this.formato = formato;
	}












	public String getMarca() {
		return marca;
	}












	public void setMarca(String marca) {
		this.marca = marca;
	}












	public BigDecimal getPrezzoUnitario() {
		return prezzoUnitario;
	}












	public void setPrezzoUnitario(BigDecimal prezzoUnitario) {
		this.prezzoUnitario = prezzoUnitario;
	}












	public int getQuantitaDisponibile() {
		return quantitaDisponibile;
	}












	public void setQuantitaDisponibile(int quantitaDisponibile) {
		this.quantitaDisponibile = quantitaDisponibile;
	}












	public byte[] getImmagine() {
		return immagine;
	}












	public void setImmagine(byte[] immagine) {
		this.immagine = immagine;
	}












	public String getMimeType() {
		return mimeType;
	}












	public void setMimeType(String mimeType) {
		this.mimeType = mimeType;
	}












	public int getAttivo() {
		return attivo;
	}












	public void setAttivo(int attivo) {
		this.attivo = attivo;
	}












	public int getIdCategoria() {
		return idCategoria;
	}












	public void setIdCategoria(int idCategoria) {
		this.idCategoria = idCategoria;
	}










/*

	@Override
	public String toString() {
		return "ProdottoBean [idProdotto=" + idProdotto + ", nomeProdotto=" + nomeProdotto + ", descrizione="
				+ descrizione + ", formato=" + formato + ", marca=" + marca + ", prezzoUnitario=" + prezzoUnitario
				+ ", quantitaDisponibile=" + quantitaDisponibile + ", immagine=" + Arrays.toString(immagine)
				+ ", mimeType=" + mimeType + ", attivo=" + attivo + ", idCategoria=" + idCategoria + "]";
	}
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	

}//ch.classe
