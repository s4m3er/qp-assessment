/**
 * 
 */
package com.questionpro.assessment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.questionpro.assessment.models.Item;

/**
 * @author Sameer Deshpande
 *
 */
@Repository
public interface ItemRepository extends JpaRepository<Item, Integer> {

	Item findByItemId(int itemId);

	Item findByItemName(String itemName);

	void deleteByItemId(int itemId);

}
