/**
 * 
 */
package com.questionpro.assessment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.questionpro.assessment.service.AssesmentService;
import com.questionpro.assessment.so.ItemResponseList;
import com.questionpro.assessment.so.RequestObject;
import com.questionpro.assessment.so.ResponseObject;

/**
 * @author Sameer Deshpande
 *
 */
@RestController
@RequestMapping("/qpassesment")
public class GroceryController {

	@Autowired
	private AssesmentService assesmentService;

	@PostMapping("/admin/update")
	public ResponseObject updateItem(@RequestBody RequestObject req) {
		return this.assesmentService.updateItem(req);

	}

	@GetMapping("/getDetails")
	public ItemResponseList getItem() {
		return this.assesmentService.getDetails();

	}

	@PostMapping("/removeGrocery")
	public ResponseObject removeItems(@RequestBody RequestObject req) {
		return this.assesmentService.removeItems(req);

	}

	@PostMapping("/bookItems")
	public ResponseObject removeItems(@RequestBody List<RequestObject> req) {
		return this.assesmentService.bookOrder(req);

	}

}
