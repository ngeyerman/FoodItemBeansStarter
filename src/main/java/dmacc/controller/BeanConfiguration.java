package dmacc.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import dmacc.beans.FoodItem;
import dmacc.beans.Ingredients;

@Configuration
public class BeanConfiguration {

	@Bean
	public FoodItem fooditem() {
		FoodItem bean = new FoodItem("spagetti");
		//bean.setName("mac n' cheese");
		//bean.setPrice(11.50);
		//bean.setVegetarian(true);
		return bean;
	}
	
	@Bean
	public Ingredients ingredients() {
		Ingredients bean = new Ingredients("sausage", "spagetti", "tomato sauce");
		return bean;
		
	}
	
}
