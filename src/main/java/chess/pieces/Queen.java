package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;

public class Queen extends Piece{

    public Queen(Color color) {
        setColor(color);
        setPieceType(PieceType.Q);
    }
}
