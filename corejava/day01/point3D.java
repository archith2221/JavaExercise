package com.valtech.training.corejava.day01;

public class point3D extends Point {
private int z;
public point3D() {}

 public point3D(int x, int y,int z) {
	 super(x,y);
	 this.z=z;
 
}
 
 public double distance() {
	 return Math.sqrt(x*x+y*y+z*z);

}
public double distance(int x, int y, int z) {
	  int dx = this.x-x;
	  int dy = this.y-y;
	  int dz = this.z-z;
	  return Math.sqrt(dx*dx+dy*dy+dz*dz);
}
 public double distance(point3D p) {
	  return distance(p.x,p.y,p.z);
	  
	  
 }
			  
 
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public static void main(String[] args) {
	System.out.println(new point3D());
	
}
}