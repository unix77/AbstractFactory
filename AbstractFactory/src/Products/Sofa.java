package Products;

public abstract class Sofa {
	
	protected String material;
	
	public String getMaterial() {
		System.out.println("The SOFA is made from "+material);
		return material;
	}
	
}