package Factories;

import Products.Chair;
import Products.Sofa;

public abstract class FurnitureAbstractFactory {

	public abstract Chair createChair(String s); 
	public abstract Sofa createSofa(String s); 
	

}
