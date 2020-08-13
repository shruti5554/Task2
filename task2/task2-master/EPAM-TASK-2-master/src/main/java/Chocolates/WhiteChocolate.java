package Chocolates;

public class WhiteChocolate extends Chocolate{

	
	
	public WhiteChocolate() {
		super();
		this.price  = 10 ;
		this.percentButter = 20.0 ;
		this.percentMilk =  14.0 ;
	    this.percentChoco = 25.0 ;
	    this.chocolateName = "White Chocolate" ;
	    this.confectioner = "Willy Wonka" ;
	}
	public int getPrice() {
		return this.price;
	}


	@Override
	public void getComposition() {
		// TODO Auto-generated method stub
		System.out.println("The white chocolate composition is as follows : ");
		System.out.println("Percentage Butter : "+ percentButter);
		System.out.println("Percentage Milk : "+ percentMilk);
		System.out.println("Percentage Choco : "+ percentChoco);
		
	}
	
	public void getConfectioner() {
    	System.out.println("Confectioner : "+ confectioner);
    }


	@Override
	public String toString() {
		return "--White Chocolate--\n";
	}

	
}
