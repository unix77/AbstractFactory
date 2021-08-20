package Factories;

import Products.*;
import ModernProducts.*;

/*
	Each specific factory extends the functionality of the abstract factory, creating products 
	of one specific family 
*/
public class ModernStyleFactory extends FurnitureAbstractFactory {
	
	//attributes
	private String name;
	
	//constructor
	public ModernStyleFactory(String n) {
		name = n;
		System.out.println("The modern factory named "+n+" has been created");
	}

	//getters
	public String getName() {
		return name;
	}
	
	//methods
	public Chair getChair(String s) {
		return new ModernChair(s);
	}
	
	public Sofa getSofa(String s) {
		return new ModernSofa(s);
	}

}
