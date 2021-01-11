package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;

public class Knight extends Piece{

    public Knight(Color color) {
        setColor(color);
        setPieceType(PieceType.N);
    }
}
