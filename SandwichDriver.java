public class SandwichDriver {
	public static void main(String[] args) {
		Cashier cashier = new Cashier("Myrtle", 10000.0); // cashier is named Myrtle and has $10000 in the till
		Customer customer = new Customer("Gerald", 500.0, new String[] {"Optimus Prime", "Roadkill"}, new String[] {"Cheese", "Guacamole"}); // customer is named Gerald, has $500, wants the Optimus Prime sandwich and the Roadkill sandwich, and wants cheese and guacamole on each
		SandwichMaker sandwichMaker = new SandwichMaker("Brad", new String[] {"Cheese", "Gherkins", "Meatballs"}, cashier); // sandwich maker is named Brad and available ingredients are cheese, gherkins, and meatballs
		
		customer.orderSandwich(sandwichMaker); // Gerald begins his business with Brad
	}
}