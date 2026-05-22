package model;

import java.io.Serializable;

public class CategoriaBean implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	 private int idCategoria;
	    private String nomeCategoria;
	    private String descrizioneCategoria;
	    private int idCategoriaPadre;

	    public CategoriaBean() {
	    }

		public int getIdCategoria() {
			return idCategoria;
		}

		public void setIdCategoria(int idCategoria) {
			this.idCategoria = idCategoria;
		}

		public String getNomeCategoria() {
			return nomeCategoria;
		}

		public void setNomeCategoria(String nomeCategoria) {
			this.nomeCategoria = nomeCategoria;
		}

		public String getDescrizioneCategoria() {
			return descrizioneCategoria;
		}

		public void setDescrizioneCategoria(String descrizioneCategoria) {
			this.descrizioneCategoria = descrizioneCategoria;
		}

		public int getIdCategoriaPadre() {
			return idCategoriaPadre;
		}

		public void setIdCategoriaPadre(int idCategoriaPadre) {
			this.idCategoriaPadre = idCategoriaPadre;
		}

		
		/*
		@Override
		public String toString() {
			return "CategoriaBean [idCategoria=" + idCategoria + ", nomeCategoria=" + nomeCategoria
					+ ", descrizioneCategoria=" + descrizioneCategoria + ", idCategoriaPadre=" + idCategoriaPadre + "]";
		}

	    */
		
		
	    /*
		public CategoriaBean(int idCategoria, String nomeCategoria, String descrizioneCategoria, int idCategoriaPadre) {
			super();
			this.idCategoria = idCategoria;
			this.nomeCategoria = nomeCategoria;
			this.descrizioneCategoria = descrizioneCategoria;
			this.idCategoriaPadre = idCategoriaPadre;
		}
	
	*/
	    
	    
	    
	    
	    
	
	
}//ch.classe
