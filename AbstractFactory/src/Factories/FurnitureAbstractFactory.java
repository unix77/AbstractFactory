package Factories;

import Products.Chair;
import Products.Sofa;

public abstract class FurnitureAbstractFactory {

	public abstract Chair getChair(String s); 
	public abstract Sofa getSofa(String s); 
	

}
