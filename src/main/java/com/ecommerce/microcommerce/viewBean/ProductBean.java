package com.ecommerce.microcommerce.viewBean;

import com.ecommerce.microcommerce.model.Product;

public class ProductBean {

	private int id;
	private String nom;
	private int prix;
	private int prixAchat;
	private int marge;

	// constructeur par défaut
	public ProductBean() {
	}

	// constructeur sans la marge
	public ProductBean(int id, String nom, int prix, int prixAchat) {
		this.id = id;
		this.nom = nom;
		this.prix = prix;
		this.prixAchat = prixAchat;
	}

	// constructeur de recopie
	public ProductBean(Product product) {
		this.id = product.getId();
		this.nom = product.getNom();
		this.prix = product.getPrix();
		this.prixAchat = product.getPrixAchat();
		this.marge = calculerMarge(product.getPrix(), product.getPrixAchat());
	}
	
	public int calculerMarge(int prix, int prixAchat) {
		int marge = prix - prixAchat;
		return marge;
	}
	
	@Override
	public String toString() {
		return "Product " + "{ id = " + id + ", nom = " + nom + ", prix = " + prix + " } : " + marge;
	}

	public int getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public int getPrix() {
		return prix;
	}

	public int getPrixAchat() {
		return prixAchat;
	}

	public int getMarge() {
		return marge;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public void setPrixAchat(int prixAchat) {
		this.prixAchat = prixAchat;
	}

	public void setMarge(int marge) {
		this.marge = marge;
	}
	
	
	
}
