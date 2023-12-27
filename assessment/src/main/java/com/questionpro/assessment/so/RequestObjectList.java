/**
 * 
 */
package com.questionpro.assessment.so;

import java.util.List;

/**
 * @author Sameer Deshpande
 *
 */
public class RequestObjectList {
	
	private List<RequestObject> requestList;

	public List<RequestObject> getRequestList() {
		return requestList;
	}

	public void setRequestList(List<RequestObject> requestList) {
		this.requestList = requestList;
	}

	@Override
	public String toString() {
		return "RequestObjectList [requestList=" + requestList + "]";
	}
	
	

}
