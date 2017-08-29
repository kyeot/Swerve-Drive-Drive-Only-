package org.usfirst.frc2783.util;

/**
 * A 2D Vector with magnitude and direction
 * 
 * @author 2783
 * @see Transform
 * @see Bearing
 */
public class Vector {
	double a;
	double b;
	
	public Vector(double a, double b) {
		this.a = a;
		this.b = b;
	}
	
	public Vector(double mag, double dir, boolean a) { 
		this.a = Math.sin(dir) * mag;
		this.b = Math.cos(dir) * mag;
	}
	
	public Vector add(Vector v) {
		double c = a + v.getA();
		double d = b + v.getB();
		return new Vector(c,d);
	}
	
	public double mag() {
		return Math.hypot(a, b);
	}
	
	public Bearing dir() {
		return new Bearing(Math.toDegrees(Math.atan2(a,b)));
	}
	
	public double getA() {
		return a;
	}
	
	public double getB() {
		return b;
	}
}