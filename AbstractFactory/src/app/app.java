package app;

import Factories.*;
import Products.*;

public class app {

	
	public static void main(String[] args) {
		System.out.println();
		FurnitureAbstractFactory modernfactory = new ModernStyleFactory("'Future'");
		FurnitureAbstractFactory rusticFactory = new RusticStyleFactory("'Antique'");
		
		Chair c1 = modernfactory.getChair("wood");
		Sofa s1 = rusticFactory.getSofa("metal");
		
		System.out.println("chair material is "+c1.getMaterial());
		System.out.println("sofa material is "+s1.getMaterial());
		
	}

}
