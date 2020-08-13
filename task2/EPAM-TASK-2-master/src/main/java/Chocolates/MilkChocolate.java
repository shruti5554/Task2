package Chocolates;

public class MilkChocolate extends Chocolate{

	
	

	public MilkChocolate() {
		super();
		this.price  = 10 ;
		this.percentButter = 15.0 ;
		this.percentMilk =  12.0 ;
	    this.percentChoco = 25.0 ;
	    this.chocolateName = "Milk Chocolate" ;
	    this.confectioner = "Willy Wonka" ;
				
	}
	public int getPrice() {
		return this.price;
	}



	@Override
	public void getComposition() {
		System.out.println("The milk chocolate composition is as follows : ");
		System.out.println("Percentage Butter : "+ percentButter);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Choco : "+ percentChoco);
	}

    public void getConfectioner() {
    	System.out.println("Confectioner : "+ confectioner);
    }

	
	@Override
	public String toString() {
		return "--MilkChocolate--\n";
	}
	

}
