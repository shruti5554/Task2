package Candies;

public class Candy {
	protected double percentSugar ;
	protected double percentWater ;
	protected double percentMilk ;
	protected String candyName ;
	protected int price;
	public Candy() {
		super();
		this.candyName = "Cnady" ;
		this.percentMilk = 20.0 ;
		this.percentSugar = 12.20 ;
		this.percentWater = 13.43 ;
		this.price = 30 ;
		
	} 
	
	public int getPrice() {
		return this.price;
	}
	
	public void getComposition() {
		System.out.println("The Candy composition is as follows : ");
		System.out.println("Percentage Sugar : "+ percentSugar);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Water : "+ percentWater);
	}

	@Override
	public String toString() {
		return "--Candy--\n";
	}
	
	
	

}
