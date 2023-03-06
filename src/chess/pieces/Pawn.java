package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{
	
	public Pawn(Board board, Color color) {
		super(board, color);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public boolean[][] possibleMoves() {
		// TODO Auto-generated method stub
	
		boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
	
		Position p = new Position(0,0);
		
	
		if(getColor() == Color.WHITE) {
	
			p.setValue(position.getRow() -1, position.getColumn());
	
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValue(position.getRow() -2, position.getColumn());
			
			Position p2 = new Position(position.getRow()-1, position.getColumn());
			
			if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
				mat[p.getRow()][p.getColumn()] = true;
			}
			
			p.setValue(position.getRow() -1, position.getColumn()-1);
			
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}	
			
			p.setValue(position.getRow() -1, position.getColumn()+1);
			
			if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
				mat[p.getRow()][p.getColumn()] = true;
			}
		}
			else {
			
				p.setValue(position.getRow() +1, position.getColumn());
			
				if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				p.setValue(position.getRow() +2, position.getColumn());
				
				Position p2 = new Position(position.getRow()+1, position.getColumn());
				
				if(getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
					mat[p.getRow()][p.getColumn()] = true;
				}
				
				p.setValue(position.getRow() +1, position.getColumn()-1);
				
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}	
				
				p.setValue(position.getRow() +1, position.getColumn()-1);
				
				if(getBoard().positionExists(p) && isThereOpponentPiece(p)) {
					mat[p.getRow()][p.getColumn()] = true;
				}
			}

		return mat;
	}
	
	//tostring
	@Override
	public String toString() {
		return "P";
	}
	
	
}