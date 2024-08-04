package com.pakasio.app.model.composite_key;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Component
@Embeddable
public class PurchaseProductKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column( name = "purchase_id" )
	Long purchaseId;
	@Column( name = "product_id" )
	Long productId;
	
	public PurchaseProductKey() {}
	
	public PurchaseProductKey(Long purchaseId, Long productId) {
		this.purchaseId = purchaseId;
		this.productId = productId;
	}

	public Long getPurchaseId() {
		return purchaseId;
	}

	public void setPurchaseId(Long purchaseId) {
		this.purchaseId = purchaseId;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}	

	
}
