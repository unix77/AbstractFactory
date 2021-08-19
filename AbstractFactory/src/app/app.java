package app;

import Factories.*;
import Products.*;

public class app {

	
	public static void main(String[] args) {
		System.out.println("Welcome to the app !");
		FurnitureAbstractFactory modernfactory = new ModernStyleFactory("'Future'");
		FurnitureAbstractFactory rusticFactory = new RusticStyleFactory("'Antique'");
		
		Chair c1 = modernfactory.createChair("wood");
		Sofa s1 = rusticFactory.createSofa("metal");
		
		System.out.println("chair material is "+c1.getMaterial());
		System.out.println("sofa material is "+s1.getMaterial());
		
	}

}
