package Products;

public abstract class Furniture {

	protected String material;
	
	public Furniture(String mat) {
		this.material = mat;
	}
	
	public String getMaterial() {
		System.out.println("Its made from "+material);
		return material;
	}

}
