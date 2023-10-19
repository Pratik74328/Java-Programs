package point;

public class Point2d {
	
	private int xcoord;
	private int ycoord;
	
	//Default Constructor
	public Point2d() {
		this.xcoord= 0;
		this.ycoord= 0;
	}
	
	//Parameterized Constructor
	public Point2d(int xcoord, int ycoord) {
		super();
		this.xcoord = xcoord;
		this.ycoord = ycoord;
	}
	
	
	
	
	
	//Getter
	public int getXcoord() {
		return xcoord;
	}
	
	//Setter
	public void setXcoord(int xcoord) {
		this.xcoord = xcoord;
	}

	//Getter
	public int getYcoord() {
		return ycoord;
	}
	
	//Setter
	public void setYcoord(int ycoord) {
		this.ycoord = ycoord;
	}
	
	//Display Method
	public void displaycoord() {
		System.out.println("X coord: "+ xcoord +" and "+ "Y coord: "+ ycoord);
	}
	
	@Override
	public String toString() {
		return "X-coord: "+xcoord+" and "+"Y-coord: "+ycoord;
	}
}
