package chess.enums;

public enum PieceType {
    P("Pawn"), N("Knight"), B("Bishop"), R("Rook"), Q("Queen"), K("King");

    private final String pieceName;

    PieceType(String pieceName) {
        this.pieceName = pieceName;
    }
}
