public class Customer {
	private String name; // customer's name
	private double cash; // customer's cash
	private String[] desiredSandwiches; // the sandwich(es) the customer wants
	private String[] desiredIngredients; // the ingredient(s) the customer wants (on each of the sandwich(es))

	public Customer(String name, double cash, String[] desiredSandwiches, String[] desiredIngredients) {
		this.name = name;
		this.cash = cash;
		this.desiredSandwiches = desiredSandwiches;
		this.desiredIngredients = desiredIngredients;
	}

	public void orderSandwich(SandwichMaker sandwichMaker) {
		// execute makeSandwich() for each sandwich in desiredSandwiches
		for (String sandwich : desiredSandwiches) {
			sandwichMaker.makeSandwich(this, sandwich);
		}
	}

	public boolean chooseIngredient(String ingredient) {
		boolean answer = false;
		
		// upon being prompted to choose an ingredient, check if the ingredient is among the list of desiredIngredients; if it is, answer yes
		for (String desiredIngredient : desiredIngredients) {
			if (desiredIngredient.equalsIgnoreCase(ingredient)) {
				answer = true;
			}
			
			break;
		}
		
		return answer;
	}

	public boolean givePayment(double total) {
		boolean answer = false;
		
		// if customer has enough cash to pay, answer to cashier is yes, and the cash is lost
		if (cash >= total) {
			cash -= total;
			answer = true;
		}
				
		return answer;
	}
}
