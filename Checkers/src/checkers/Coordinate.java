package checkers;

public class Coordinate {

	private int xCoordinate;
	private int yCoordinate;
	
	//Constructor
	public Coordinate(int x, int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public int getX() {
		return xCoordinate;
	}
	
	public int getY() {
		return yCoordinate;
	}
	
	public void setX(int x) {
		this.xCoordinate = x;
	}
	
	public void setY(int y) {
		this.yCoordinate = y;
	}
}