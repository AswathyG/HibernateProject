package org.ashish.learnspring;

import java.util.List;

public class Triangle {
	
	private List<Point> points;

	void Draw() {
		
	for(Point point: points ) {
		System.out.println("Point A coordinates x: "+ point.getX()+" , y: "+ point.getY()+ "\n");
		
	}
	}

	public List<Point> getPoints() {
		return points;
	}

	public void setPoints(List<Point> points) {
		this.points = points;
	}

	
}
