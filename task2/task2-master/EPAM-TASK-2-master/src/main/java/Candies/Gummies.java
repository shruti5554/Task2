package Candies;

public class Gummies extends Candy{

	public Gummies() {
		super();
		this.candyName = "Gummies" ;
		this.percentMilk = 25.0 ;
		this.percentSugar = 17.20 ;
		this.percentWater = 15.43 ;
		this.price = 75 ;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void getComposition() {
		System.out.println("The composition of Gummies is : ");
		System.out.println("Percentage Sugar : "+ percentSugar);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Water : "+ percentWater);
	}

	public String toString() {
		return "--Gummies--\n";
	}
}
