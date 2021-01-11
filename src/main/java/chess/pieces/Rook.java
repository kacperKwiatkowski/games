package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;

public class Rook extends Piece{

    public Rook(Color color) {
        setColor(color);
        setPieceType(PieceType.R);
    }
}
