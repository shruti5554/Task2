package brandes;

public class FererroRocher extends Brandes{
	

	public FererroRocher() {
		super();
		this.brandname = "Ferrero Rocher" ;
		this.owner = "Ferrero International" ;
		this.price = 150 ;
	}
	public int getPrice() {
		return this.price;
	}

	@Override
	public String toString() {
		return "--FererroRocher--\n";
	}

	@Override
	public void getBrandOwner() {
		String str = brandname + "is owned by "+owner ;
		System.out.println(str);
		
	}

}
