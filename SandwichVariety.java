public enum SandwichVariety {
	// the string is the name of the variety and the number is the price of the sandwich
	HOME ("Homewrecker", 7.99),
	YUMMY ("Yummy", 8.99),
	ROAD ("Roadkill", 9.99),
	OPTIMUS ("Optimus Prime", 6.99);
	
	private final String variety;
	private final double price;
	
	private SandwichVariety (String variety, double price) {
		this.variety = variety;
		this.price = price;
	}
	
	public String getName() {
		return variety;
	}
	
	public double getPrice() {
		return price;
	}
}
