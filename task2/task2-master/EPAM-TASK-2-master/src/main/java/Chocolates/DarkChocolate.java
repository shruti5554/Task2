package Chocolates;

public class DarkChocolate extends Chocolate {

	
	
	
	
	public DarkChocolate() {
		super();
		this.price  = 15 ;
		this.percentButter = 18.0 ;
		this.percentMilk =  5.0 ;
	    this.percentChoco = 35.0 ;
	    this.chocolateName = "Dark Chocolate" ;
	    this.confectioner = "Willy Wonka" ;
	}


	public int getPrice() {
		return this.price;
	}
	@Override
	public void getComposition() {
		// TODO Auto-generated method stub
		System.out.println("The dark chocolate composition is as follows : ");
		System.out.println("Percentage Butter : "+ percentButter);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Choco : "+ percentChoco);
		
	}
	
	public void getConfectioner() {
    	System.out.println("Confectioner : "+ confectioner);
    }


	@Override
	public String toString() {
		return "--Dark Chocolate--\n";
	}
	

}
