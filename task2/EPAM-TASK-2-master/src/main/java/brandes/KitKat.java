package brandes;

public class KitKat extends Brandes {

	
	public KitKat() {
		super();
		this.brandname = "Kit Kat" ;
		this.owner = "Nestle" ;
		this.price = 75 ;
	}
	
	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "--KitKat--\n";
	}


	@Override
	public void getBrandOwner() {
		String str = brandname + "is owned by "+owner ;
		System.out.println(str);
	}

}
