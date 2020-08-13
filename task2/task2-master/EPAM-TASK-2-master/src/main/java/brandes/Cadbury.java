package brandes;

public class Cadbury extends Brandes {

	
	public Cadbury() {
		super();
		this.brandname = "Cadbury" ;
		this.owner = "Mondelez International" ;
		this.price = 50 ;
		
	}
	
	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "--Cadbury--\n";
	}

	@Override
	public void getBrandOwner() {
		String str = brandname + "is owned by "+owner ;
		System.out.println(str);
		
	}
	

}
