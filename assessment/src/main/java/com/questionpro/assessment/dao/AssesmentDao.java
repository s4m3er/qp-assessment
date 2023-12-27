/**
 * 
 */
package com.questionpro.assessment.dao;

import java.util.List;

import com.questionpro.assessment.so.ItemResponseList;
import com.questionpro.assessment.so.RequestObject;
import com.questionpro.assessment.so.ResponseObject;

/**
 * @author Sameer Deshpande
 *
 */
public interface AssesmentDao {

	public ResponseObject updateItem(RequestObject req);

	public ItemResponseList getDetails();

	public ResponseObject removeItem(RequestObject req);

	public ResponseObject bookOrder(List<RequestObject> req);

}
