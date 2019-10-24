package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.FoodItem;

@Repository
public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {

}
