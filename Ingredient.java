public enum Ingredient {
	// the string is the name of the ingredient and the number is the price of it
	GHERKIN ("Gherkins", 0.99),
	MEATBALL ("Meatballs", 1.99),
	CHEESE ("Cheese", 2.99),
	GUAC ("Guacamole", 3.99);
	
	private final String ingredient;
	private final double price;
	
	private Ingredient (String ingredient, double price) {
		this.ingredient = ingredient;
		this.price = price;
	}
	
	public String getName() {
		return ingredient;
	}
	
	public double getPrice() {
		return price;
	}
}
