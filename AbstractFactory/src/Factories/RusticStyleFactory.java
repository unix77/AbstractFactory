package Factories;

import Products.*;
import RusticProducts.*;

/*
	Each specific factory extends the functionality of the abstract factory, creating products 
	of one specific family 
*/
public class RusticStyleFactory extends FurnitureAbstractFactory {
	
	//attributes
	private String name;
	
	//constructor
	public RusticStyleFactory(String n) {
		name = n;
		System.out.println("The rustic factory named "+n+" has been created");
	}

	//getters
	public String getName() {
		return name;
	}
	
	//methods
	public Chair getChair(String s) {
		return new RusticChair(s);
	}
	
	public Sofa getSofa(String s) {
		return new RusticSofa(s);
	}

}
