package Candies;

public class Lollipop extends Candy{

	public Lollipop() {
		super();
		this.candyName = "Lollipop" ;
		this.percentMilk = 23.0 ;
		this.percentSugar = 12 ;
		this.percentWater = 15 ;
		this.price = 80 ;
		
	}
	public int getPrice() {
		return this.price;
	}
	public void getComposition() {
		System.out.println("The composition of Lollipop is : ");
		System.out.println("Percentage Sugar : "+ percentSugar);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Water : "+ percentWater);
	}

	public String toString() {
		return "--Lollipop--\n";
	}
	

}
