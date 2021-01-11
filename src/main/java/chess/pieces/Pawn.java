package chess.pieces;

import chess.board.Board;
import chess.board.Spot;
import chess.enums.Color;
import chess.enums.PieceType;
import chess.utils.Rules;

public class Pawn extends Piece{

    private boolean hasBeenMoved = false;

    public Pawn(Color color) {
        setColor(color);
        setPieceType(PieceType.P);
    }

    public boolean movePossible(Board board, Spot start, Spot end){

        if(!Rules.isMoveWithinBoardBoundaries(end)){
            return false;
        }

        //TODO Check if direction of the move is correct:
        if(start.getX()!=end.getX()){
            return false;
        } else {
            if(start.getPiece().getColor().equals(Color.WHITE) & end.getX()<=start.getX()){
                return false;
            } else if(start.getPiece().getColor().equals(Color.BLACK) & end.getX()>start.getX()){
                return false;
            }
        }

        // Can't move more than two fields
        if(Math.abs(start.getX() - end.getX()) > 2){
            return false;
        }
        // Can move by two spaces, if pawn was not moved before
        else if(Math.abs(start.getX() - end.getX()) == 2){
            return !hasBeenMoved;
        }
        // Move is by one spot, direction checked previously, therefore is good
        else return true;
    }
}
