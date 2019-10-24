package dmacc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dmacc.beans.FoodItem;
import dmacc.beans.Ingredients;
import dmacc.controller.BeanConfiguration;
import dmacc.repository.FoodItemRepository;

@SpringBootApplication
public class FoodItemBeansStarterApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FoodItemBeansStarterApplication.class, args);

	}

	@Autowired
	FoodItemRepository repo;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		//use existing bean
		FoodItem f = appContext.getBean("fooditem", FoodItem.class);
		f.setName("Bolognese");
		repo.save(f);
		
		//create an object to use not manages by Spring
		FoodItem fi = new FoodItem("cacio e pepe", 12.99, true);
		Ingredients i = new Ingredients("pecorino-romano", "spagetti", "olive oil");
		fi.setIngredients(i);
		repo.save(fi);
		
		List<FoodItem> allMyFood = repo.findAll();
		for(FoodItem food: allMyFood) {
			System.out.println(food.toString());
		}
	}
	
}
