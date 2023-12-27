/**
 * 
 */
package com.questionpro.assessment.so;

import java.util.List;

import com.questionpro.assessment.models.Item;

/**
 * @author Sameer Deshpande
 *
 */
public class ItemResponseList extends ResponseObject {

	private List<Item> responseList;

	public List<Item> getResponseList() {
		return responseList;
	}

	public void setResponseList(List<Item> responseList) {
		this.responseList = responseList;
	}

	@Override
	public String toString() {
		return "ItemResponseList []";
	}

}
