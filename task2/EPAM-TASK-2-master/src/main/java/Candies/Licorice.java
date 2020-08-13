package Candies;

public class Licorice extends Candy{

	public Licorice() {
		super();
		this.candyName = "Licorice" ;
		this.percentMilk = 23.0 ;
		this.percentSugar = 16.20 ;
		this.percentWater = 17.43 ;
		this.price = 100 ;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void getComposition() {
		System.out.println("The composition of Licorice is : ");
		System.out.println("Percentage Sugar : "+ percentSugar);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Water : "+ percentWater);
	}

	public String toString() {
		return "--Licorice--\n";
	}
	

}
