/**
 * 
 */
package com.questionpro.assessment.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.questionpro.assessment.models.Item;
import com.questionpro.assessment.repo.ItemRepository;
import com.questionpro.assessment.so.ItemResponseList;
import com.questionpro.assessment.so.RequestObject;
import com.questionpro.assessment.so.ResponseObject;

/**
 * @author Sameer Deshpande
 *
 */

@Component
public class AssesmentDaoImp implements AssesmentDao {

	@Autowired
	private ItemRepository itemRepository;

	public ResponseObject updateItem(RequestObject req) {
		ResponseObject res = new ResponseObject();
		try {
			Item i = this.itemRepository.findByItemId(req.getItemId());
			if (null != i) {
				i.setItemDescription(req.getItemDescription());
				i.setItemName(req.getItemName());
				i.setItemPrice(req.getItemPrice());
				i.setItemQuantity(req.getItemQuantity());
				this.itemRepository.save(i);
				res.setMessage("Success");
				res.setStatus(200);
			} else {
				Item newItem = new Item();
				newItem.setItemName(req.getItemName());
				newItem.setItemPrice(req.getItemPrice());
				newItem.setItemDescription(req.getItemDescription());
				newItem.setItemQuantity(req.getItemQuantity());
				this.itemRepository.save(newItem);
				res.setMessage("Success");
				res.setStatus(200);
			}

		} catch (Exception e) {
			e.printStackTrace();
			res.setMessage("Something went wrong, please try again");
			res.setStatus(500);
		}
		return res;
	}

	@Override
	public ItemResponseList getDetails() {
		ItemResponseList res = new ItemResponseList();
		// TODO Auto-generated method stub
		try {
			List<Item> items = this.itemRepository.findAll();
			if (!items.isEmpty()) {
				res.setResponseList(items);
				res.setMessage("Success");
				res.setStatus(200);
			} else {
				res.setMessage("Success");
				res.setStatus(200);
			}
		} catch (Exception e) {
			res.setMessage("Something went wrong, please try again");
			res.setStatus(500);
		}
		return res;
	}

	@Override
	public ResponseObject removeItem(RequestObject req) {
		// TODO Auto-generated method stub
		ResponseObject res = new ResponseObject();
		try {
			this.itemRepository.deleteByItemId(req.getItemId());
			res.setMessage("Success");
			res.setStatus(200);
		} catch (Exception e) {
			e.printStackTrace();
			res.setMessage("Something went wrong, please try again");
			res.setStatus(500);
		}
		return res;
	}

	@Override
	public ResponseObject bookOrder(List<RequestObject> req) {
		// TODO Auto-generated method stub
		ResponseObject res = new ResponseObject();
		try {
			for (RequestObject r : req) {
				Item itemFromDb = this.itemRepository.findByItemName(r.getItemName());
				itemFromDb.setItemQuantity(String.valueOf(
						(Integer.valueOf(itemFromDb.getItemQuantity()) - Integer.valueOf(r.getItemQuantity()))));
				this.itemRepository.save(itemFromDb);
			}
			res.setMessage("Success");
			res.setStatus(200);

		} catch (Exception e) {
			e.printStackTrace();
			res.setMessage("Something went wrong, please try again");
			res.setStatus(500);
		}
		return res;
	}

}
