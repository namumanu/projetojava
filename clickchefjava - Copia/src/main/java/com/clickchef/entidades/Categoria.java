package com.clickchef.entidades;

public class Categoria {

	private long idCategoria;
	private String nomeCategoria;
	
	public Categoria() {
		
	}
	
	public Categoria(long idCategoria, String nomeCategoria) {
		super();
		this.idCategoria = idCategoria;
		this.nomeCategoria = nomeCategoria;
	}

	public String toString() {
		return "Categoria [idCategoria=" + idCategoria + ", nomeCategoria="
				+ nomeCategoria + "]";	
	}
	
	public long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeCategoria() {
		return nomeCategoria;
	}

	public void setNomeCategoria(String nomeCategoria) {
		this.nomeCategoria = nomeCategoria;
	}
	
	
}
