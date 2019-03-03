package checkers;

import java.awt.*;

public class Piece {
	
	private Coordinate pieceCoordinate;
	private Color pieceColor;
	private boolean kinged;
	
	public Piece(Coordinate pieceCoordinate, Color pieceColor)
	{
		kinged = false;
		this.pieceCoordinate = pieceCoordinate;
		this.pieceColor	= pieceColor;
	}
	
	public Coordinate getCoordinate() {
		return pieceCoordinate;
	}
	
	public Color getColor() {
		return pieceColor;
	}
	
	public void setCoordinate(Coordinate newCoordinate) {
		this.pieceCoordinate = newCoordinate;
	}
	
	public void setColor(Color newColor) {
		this.pieceColor = newColor;
	}
	
	public void kingMe() {
		kinged = true;
	}
	
	public boolean isKing() {
		return kinged;
	}
}