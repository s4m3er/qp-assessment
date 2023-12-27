/**
 * 
 */
package com.questionpro.assessment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.questionpro.assessment.dao.AssesmentDao;
import com.questionpro.assessment.so.ItemResponseList;
import com.questionpro.assessment.so.RequestObject;
import com.questionpro.assessment.so.ResponseObject;

/**
 * @author Sameer Deshpande
 *
 */

@Service
public class AssesmentService {

	@Autowired
	private AssesmentDao assesmentDao;

	public ResponseObject updateItem(RequestObject req) {
		return this.assesmentDao.updateItem(req);
	}

	public ItemResponseList getDetails() {
		// TODO Auto-generated method stub
		return this.assesmentDao.getDetails();
	}

	public ResponseObject removeItems(RequestObject req) {
		// TODO Auto-generated method stub
		return this.assesmentDao.removeItem(req);
	}

	public ResponseObject bookOrder(List<RequestObject> req) {
		// TODO Auto-generated method stub
		return this.assesmentDao.bookOrder(req);
	}

}
