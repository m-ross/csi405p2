import java.util.ArrayList;

public class Sandwich {
	private String variety;
	private ArrayList<String> ingredients;  // list to hold all the of ingredients placed on the sandwich
	
	public Sandwich(String variety) {
		this.variety = variety;
		ingredients = new ArrayList<String>(); // no need to initialise with any values because all ingredients are added via addIngredient()
	}
	
	public void addIngredient(String ingredient) {
		ingredients.add(ingredient); // add the specified ingredient to the list
	}
	
	public String getVariety() {
		return variety;
	}
	
	public ArrayList<String> getIngredients() {
		return ingredients;
	}
}
