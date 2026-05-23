package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CarrelloBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private LocalDate dataCreazione;



	private List<VoceCarrelloBean> prodotti;
	
	
	
	
	
	public CarrelloBean()
	{

	this.prodotti=new ArrayList<VoceCarrelloBean>();




	}//ch.costr.


	
	
	
	public LocalDate getDataCreazione() {
		return dataCreazione;
	}


	public void setDataCreazione(LocalDate dataCreazione) {
		this.dataCreazione = dataCreazione;
	}


	public List<VoceCarrelloBean> getProdotti() {
		return prodotti;
	}


	public void setProdotti(List<VoceCarrelloBean> prodotti) {
		this.prodotti = prodotti;
	}


	
	
	
	
	
	
	public void addVoceCarrello(VoceCarrelloBean voceProd)
	{
		prodotti.add(voceProd);

	}//ch.metodo
	
	
	
	
	
	
	
	

	public void cancellaVoceCarrello(VoceCarrelloBean voceProd)
	{
		for(VoceCarrelloBean v:prodotti)
		{
			if(v.getIdProdotto() == voceProd.getIdProdotto() )
			{
				prodotti.remove(v);
				break;
			}


		}//ch.for
		
			//nel caso non lo trovasse?

	}//ch.metodo
	
	
	
	
	
	
	
	//metodo che restituisce totale numero prodotti del carrello(corrente)

	public int numeroVociCarrello()
	{
		return this.prodotti.size();

	}
	
	
	
	
	
	
	

	
	//metodo che cerca voce nel carrello prodotti.Se la  trova la restituisce altrimenti null
	public VoceCarrelloBean cercaVoceCarrello(VoceCarrelloBean voceProd)
	{

		for(VoceCarrelloBean v:prodotti)
		{
			if(v.getIdProdotto() == voceProd.getIdProdotto() )
			{
				return v;
			}


		}//ch.for


	return null;

	}//ch.metodo
	
	
	
	
	
	
	
	
	
	
	/*

	@Override
	public String toString() {
		return "CarrelloBean [dataCreazione=" + dataCreazione + ", prodotti=" + prodotti + "]";
	}
	
	
	*/
	
	
	
	

/*
 
	public CarrelloBean(LocalDate dataCreazione, List<VoceCarrelloBean> prodotti) {
		super();
		this.dataCreazione = dataCreazione;
		this.prodotti = prodotti;
	}
	
	
	
	
	*/
	
	
	
	
	
	
	
}//ch.classe
