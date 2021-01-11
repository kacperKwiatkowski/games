package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;

public class King extends Piece{

    public King(Color color) {
        setPieceType(PieceType.K);
        setColor(color);
    }

}
