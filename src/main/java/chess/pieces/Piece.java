package chess.pieces;

import chess.enums.Color;
import chess.enums.PieceType;
import chess.enums.Status;

public abstract class Piece {

    private PieceType pieceType;
    private Color color;

    public PieceType getPieceType() {
        return pieceType;
    }

    public void setPieceType(PieceType pieceType) {
        this.pieceType = pieceType;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
