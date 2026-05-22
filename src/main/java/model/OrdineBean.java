package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class OrdineBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 private int idOrdine;
	    private LocalDateTime dataOrdine;
	    private String statoOrdine;
	    private BigDecimal prezzoTotaleOrdine;
	    private int totaleProdotti;
	    
	    private List<DettaglioOrdineBean> prodotti;
	    
	    private String indirizzoSpedizione;
	private int nCivSpedizione;
	private String provSpedizione;
	    private String capSpedizione;
	    private String cittaSpedizione;
	    private BigDecimal costoSpedizione;
	    private int idUtente;
	    private int idMetodoSpedizione;
	    private int idMetodoPagamento;
	
	

	    public OrdineBean()
	 {

		this.prodotti=new ArrayList<DettaglioOrdineBean>();


	    }



		public int getIdOrdine() {
			return idOrdine;
		}



		public void setIdOrdine(int idOrdine) {
			this.idOrdine = idOrdine;
		}



		public LocalDateTime getDataOrdine() {
			return dataOrdine;
		}



		public void setDataOrdine(LocalDateTime dataOrdine) {
			this.dataOrdine = dataOrdine;
		}



		public String getStatoOrdine() {
			return statoOrdine;
		}



		public void setStatoOrdine(String statoOrdine) {
			this.statoOrdine = statoOrdine;
		}



		public BigDecimal getPrezzoTotaleOrdine() {
			return prezzoTotaleOrdine;
		}



		public void setPrezzoTotaleOrdine(BigDecimal prezzoTotaleOrdine) {
			this.prezzoTotaleOrdine = prezzoTotaleOrdine;
		}



		public int getTotaleProdotti() {
			return totaleProdotti;
		}



		public void setTotaleProdotti(int totaleProdotti) {
			this.totaleProdotti = totaleProdotti;
		}



		public List<DettaglioOrdineBean> getProdotti() {
			return prodotti;
		}



		public void setProdotti(List<DettaglioOrdineBean> prodotti) {
			this.prodotti = prodotti;
		}



		public String getIndirizzoSpedizione() {
			return indirizzoSpedizione;
		}



		public void setIndirizzoSpedizione(String indirizzoSpedizione) {
			this.indirizzoSpedizione = indirizzoSpedizione;
		}



		public int getnCivSpedizione() {
			return nCivSpedizione;
		}



		public void setnCivSpedizione(int nCivSpedizione) {
			this.nCivSpedizione = nCivSpedizione;
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



		public BigDecimal getCostoSpedizione() {
			return costoSpedizione;
		}



		public void setCostoSpedizione(BigDecimal costoSpedizione) {
			this.costoSpedizione = costoSpedizione;
		}



		public int getIdUtente() {
			return idUtente;
		}



		public void setIdUtente(int idUtente) {
			this.idUtente = idUtente;
		}



		public int getIdMetodoSpedizione() {
			return idMetodoSpedizione;
		}



		public void setIdMetodoSpedizione(int idMetodoSpedizione) {
			this.idMetodoSpedizione = idMetodoSpedizione;
		}



		public int getIdMetodoPagamento() {
			return idMetodoPagamento;
		}



		public void setIdMetodoPagamento(int idMetodoPagamento) {
			this.idMetodoPagamento = idMetodoPagamento;
		}


/*
		public OrdineBean(int idOrdine, LocalDateTime dataOrdine, String statoOrdine, BigDecimal prezzoTotaleOrdine,
				int totaleProdotti, List<DettaglioOrdineBean> prodotti, String indirizzoSpedizione, int nCivSpedizione,
				String provSpedizione, String capSpedizione, String cittaSpedizione, BigDecimal costoSpedizione,
				int idUtente, int idMetodoSpedizione, int idMetodoPagamento) {
			super();
			this.idOrdine = idOrdine;
			this.dataOrdine = dataOrdine;
			this.statoOrdine = statoOrdine;
			this.prezzoTotaleOrdine = prezzoTotaleOrdine;
			this.totaleProdotti = totaleProdotti;
			this.prodotti = prodotti;
			this.indirizzoSpedizione = indirizzoSpedizione;
			this.nCivSpedizione = nCivSpedizione;
			this.provSpedizione = provSpedizione;
			this.capSpedizione = capSpedizione;
			this.cittaSpedizione = cittaSpedizione;
			this.costoSpedizione = costoSpedizione;
			this.idUtente = idUtente;
			this.idMetodoSpedizione = idMetodoSpedizione;
			this.idMetodoPagamento = idMetodoPagamento;
		}
	
	
	*/
	    
	    
	    
		public void addDettaglioOrdine(DettaglioOrdineBean voceProd)
		{
			prodotti.add(voceProd);

		}//ch.metodo
	    
		public int numeroVociOrdine()
		{
			return this.prodotti.size();

		}


/*
		@Override
		public String toString() {
			return "OrdineBean [idOrdine=" + idOrdine + ", dataOrdine=" + dataOrdine + ", statoOrdine=" + statoOrdine
					+ ", prezzoTotaleOrdine=" + prezzoTotaleOrdine + ", totaleProdotti=" + totaleProdotti
					+ ", prodotti=" + prodotti + ", indirizzoSpedizione=" + indirizzoSpedizione + ", nCivSpedizione="
					+ nCivSpedizione + ", provSpedizione=" + provSpedizione + ", capSpedizione=" + capSpedizione
					+ ", cittaSpedizione=" + cittaSpedizione + ", costoSpedizione=" + costoSpedizione + ", idUtente="
					+ idUtente + ", idMetodoSpedizione=" + idMetodoSpedizione + ", idMetodoPagamento="
					+ idMetodoPagamento + "]";
		}
	    
	
	*/	
		
		
		
		
		
		
	

}//ch.classe
