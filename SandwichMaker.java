public class SandwichMaker {
	private String name; // sandwich maker's name
	private Sandwich currentSandwich; // what the sandwich maker is currently working on
	private String[] availableIngredients; // the ingredients at the sandwich maker's disposal
	private Cashier cashier; // assume the same cashier is going to be on shift for the entire time the sandwich maker works

	public SandwichMaker(String name, String[] availableIngredients, Cashier cashier) {
		this.name = name;
		this.availableIngredients = availableIngredients;
		this.cashier = cashier;
	}

	public void makeSandwich(Customer customer, String sandwichVariety) {
		currentSandwich = new Sandwich(sandwichVariety); // begin making a sandwich of the variety specified by the customer
		
		// for each available ingredient, ask the customer if they want it
		for (String ingredient : availableIngredients) {
			promptIngredient(customer, ingredient);
		}
		
		passSandwich(customer);
	}

	public void promptIngredient(Customer customer, String ingredient) {
		// if the customer wants the specified ingredient, then add it to the sandwich
		if (customer.chooseIngredient(ingredient)) {
			currentSandwich.addIngredient(ingredient);
		}
	}

	public void passSandwich(Customer customer) {
		// give the sandwich to the cashier to ring up
		cashier.ringUpSandwich(customer, currentSandwich);
	}
}
