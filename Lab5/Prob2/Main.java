package Prob2;

import java.util.*; 

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Figure> figures = new ArrayList<Figure>();
		
		figures.add(new Triangle(2,5));
		figures.add(new Rectangle(3,5));
		figures.add(new Circle(5));
		
		double sum = 0;
		
		for(Figure f : figures) {
			
			sum =  sum + f.computeArea();
		}
		
		System.out.println(sum);

	}

}
