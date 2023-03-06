package com.oops.generics;

import java.util.ArrayList;
import java.util.List;
abstract class Shape{
	abstract void draw();
}

class Rectangle extends Shape{
	void draw() 
	{System.out.println("drawing rectangle");}
}
class Circle extends Shape{
	void draw()
	{System.out.println("drawing circle");}
}


public class WildcardExample {
	public static void drawShapes(List<? extends Shape>lists) {
		for(Shape s:lists) {
			s.draw();
		}
	}
	public static void main(String[] args) {
	List<Rectangle> list=new ArrayList<Rectangle>(); 
		list.add(new Rectangle());
	List<Circle> list1=new ArrayList<Circle>();
	list1.add(new Circle());
	drawShapes(list1);  
	drawShapes(list);
	drawShapes(list1); 
	}
}
