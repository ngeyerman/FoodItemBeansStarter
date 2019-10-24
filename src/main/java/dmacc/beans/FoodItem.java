package dmacc.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class FoodItem {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double price;
	private boolean vegetarian;
	@Autowired
	private Ingredients ingredients;

	public Ingredients getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredients ingredients) {
		this.ingredients = ingredients;
	}

	public FoodItem() {
		super();
		this.price = 8.00;
		// TODO Auto-generated constructor stub
	}

	public FoodItem(String name) {
		super();
		this.name = name;
	}

	public FoodItem(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public FoodItem(String name, double price, boolean vegetarian) {
		super();
		this.name = name;
		this.price = price;
		this.vegetarian = vegetarian;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "FoodItem [name=" + name + ", price=" + price + ", vegetarian=" + vegetarian + ", ingredients="
				+ ingredients + "]";
	}
}
