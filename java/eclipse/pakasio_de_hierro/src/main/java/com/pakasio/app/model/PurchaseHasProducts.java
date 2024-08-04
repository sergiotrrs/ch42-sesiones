package com.pakasio.app.model;

import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.pakasio.app.model.composite_key.PurchaseProductKey;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;

@Entity
@Table(name="purchase_has_products")
public class PurchaseHasProducts implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private PurchaseProductKey id;
	
	@ManyToOne
	@MapsId("purchaseId")
    @JoinColumn(name = "purchase_id")
	private Purchase purchase;
	
	@ManyToOne
	@MapsId("productId")
    @JoinColumn(name = "product_id")
	@JsonIgnoreProperties("category")
	private Product product;
		
	@Column(name = "quantity")	
	private int quantity;
	
	@Column(name = "purchase_sold", precision=7, scale=2)	
	private BigDecimal purchaseSold;

	public PurchaseHasProducts() {}
	
	public PurchaseHasProducts(PurchaseProductKey id , Purchase purchase,
			Product product, int quantity, BigDecimal purchaseSold) {
		this.id = id;
		this.purchase = purchase;
		this.product = product;
		this.quantity = quantity;
		this.purchaseSold = purchaseSold;
	}

	public PurchaseProductKey getId() {
		return id;
	}

	public void setId(PurchaseProductKey id) {
		this.id = id;
	}

	public Purchase getPurchase() {
		return purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPurchaseSold() {
		return purchaseSold;
	}

	public void setPurchaseSold(BigDecimal purchaseSold) {
		this.purchaseSold = purchaseSold;
	}
	
	
}
