package dmacc.beans;

import javax.persistence.Embeddable;

@Embeddable
public class Ingredients {
	private String protein;
	private String starch;
	private String sauce;
	
	
	public Ingredients() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Ingredients(String protein, String starch, String sauce) {
		super();
		this.protein = protein;
		this.starch = starch;
		this.sauce = sauce;
	}


	public String getProtein() {
		return protein;
	}


	public void setProtein(String protein) {
		this.protein = protein;
	}


	public String getStarch() {
		return starch;
	}


	public void setStarch(String starch) {
		this.starch = starch;
	}


	public String getSauce() {
		return sauce;
	}


	public void setSauce(String sauce) {
		this.sauce = sauce;
	}


	@Override
	public String toString() {
		return "Ingredients [protein=" + protein + ", starch=" + starch + ", sauce=" + sauce + "]";
	}
	
	
	

}
