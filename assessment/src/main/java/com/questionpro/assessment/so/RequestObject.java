/**
 * 
 */
package com.questionpro.assessment.so;

/**
 * @author Sameer Deshpande
 *
 */
public class RequestObject {

	private int itemId;

	private String itemName;

	private String itemQuantity;

	private String itemPrice;

	private String itemDescription;


	
	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemQuantity() {
		return itemQuantity;
	}

	public void setItemQuantity(String itemQuantity) {
		this.itemQuantity = itemQuantity;
	}

	public String getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "RequestObject [itemId=" + itemId + ", itemName=" + itemName + ", itemQuantity=" + itemQuantity
				+ ", itemPrice=" + itemPrice + ", itemDescription=" + itemDescription + "]";
	}

}
