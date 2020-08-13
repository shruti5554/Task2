package Chocolates;

public class Chocolate {
	protected double percentButter ;
	protected double percentMilk ;
	protected double percentChoco ;
	protected String chocolateName;
	protected String confectioner ;
	protected int price ;

	
	
	public Chocolate() {
		super();
		// TODO Auto-generated constructor stub
		this.price  = 25 ;
		this.percentButter = 15.0 ;
		this.percentMilk =  12.0 ;
	    this.percentChoco = 25.0 ;
	    this.chocolateName = "Chocolate" ;
	    this.confectioner = "Willy Wonka" ;
	}
	public int getPrice() {
		return this.price;
	}



	public void getComposition() {
		System.out.println("The  chocolate composition is as follows : ");
		System.out.println("Percentage Butter : "+ percentButter);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Choco : "+ percentChoco);
	}



	@Override
	public String toString() {
		return "--Chocolate--\n";
	};
	
	
	

}
