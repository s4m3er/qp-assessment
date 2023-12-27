/**
 * 
 */
package com.questionpro.assessment.so;

/**
 * @author Sameer Deshpande
 *
 */
public class ResponseObject {

	private String message;
	
	private int status;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "ResponseObject [message=" + message + ", status=" + status + "]";
	}
	
	
	
}
