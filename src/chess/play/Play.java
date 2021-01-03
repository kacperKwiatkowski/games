package chess.play;

import chess.board.Board;
import chess.utils.Printer;

public class Play {

    private Board board;

    public Play(){
        this.board = new Board();
        Printer.printBoard(this.board.getBoard());
    }
}
