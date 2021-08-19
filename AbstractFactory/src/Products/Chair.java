package Products;

public abstract class Chair {
	
	protected String material;
	
	public String getMaterial() {
		System.out.println("The CHAIR is made from "+material);
		return material;
	}
	
}
