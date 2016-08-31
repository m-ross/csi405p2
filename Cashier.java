import java.util.ArrayList;

public class Cashier {
	private String name; // cashier's name
	private Sandwich currentSandwich; // the sandwich the cashier is currently ringing up
	private Customer currentCustomer; // the customer the cashier is currently servicing
	private double tillCash; // the amount of cash in the till

	public Cashier(String name, double tillCash) {
		this.name = name;
		this.tillCash = tillCash;
	}
	
	public void ringUpSandwich(Customer customer, Sandwich sandwich) {
		currentSandwich = sandwich;
		currentCustomer = customer;
		computeTotal();
	}

	public void computeTotal() {
		double total = 0; // total amount to charge the customer
		
		// check each sandwich variety in enum SandwichVariety for a match to currentSandwich, then add its price to the total
		for (SandwichVariety variety : SandwichVariety.values()) {
			if (currentSandwich.getVariety().equalsIgnoreCase(variety.getName())) {
				total = variety.getPrice();
				break;
			}
		}
		
		ArrayList<String> sandwichIngredients = currentSandwich.getIngredients(); // get the ingredients on the sandwich so as to loop through them
		
		// check each ingredient in enum Ingredient for a match to sandwichIngredient, then add its price to the total
		for (String sandwichIngredient : sandwichIngredients) {
			for (Ingredient ingredient : Ingredient.values()) {
				if (ingredient.getName().equalsIgnoreCase(sandwichIngredient)) {
					total += ingredient.getPrice();
					break;
				}
			}
		}
		
		// if the customer can afford to pay, then add the total paid to the cash in the till
		if (currentCustomer.givePayment(total)) {
			tillCash += total;
		}
	}
}