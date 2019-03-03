package checkers;

import java.awt.*;

//Super class for EmptyTile and OccupiedTile
public abstract class Tile {
	
	//viewable
	public Coordinate tileCoordinate;
	//not viewable
	private Color backgroundColor;
	
	//super class constructor
	public Tile(Coordinate tileCoordinate) {
		this.tileCoordinate = tileCoordinate;
	}
	
	public void setBackgroundColor(Color BG) {
		this.backgroundColor = BG;
	}
	
	public Color getBackColor() {
		return backgroundColor;
	}
	
	
	public abstract boolean isFilled();
	public abstract Piece whatPiece();
	
	public static final class EmptyTile extends Tile {
		
		public EmptyTile(Coordinate EC) {
			super(EC);
		}
		
		@Override
		public boolean isFilled() {
			return false;
		}
		
		@Override
		public Piece whatPiece() {
			return null;
		}
	}
	
	public static final class FilledTile extends Tile {
		
		private Piece pieceOccupying;

		public FilledTile(Coordinate FC, Piece piece) {
			super(FC);
			this.pieceOccupying = piece;
		}
		
		@Override
		public boolean isFilled() {
			return true;
		}
		
		@Override
		public Piece whatPiece() {
			return pieceOccupying;
		}
	}
}