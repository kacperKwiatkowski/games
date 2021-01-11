package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;

public class Bishop extends Piece{

    public Bishop(Color color) {
        setColor(color);
        setPieceType(PieceType.B);
    }
}
