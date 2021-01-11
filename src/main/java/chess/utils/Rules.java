package chess.utils;

import chess.board.Spot;

public class Rules {

    public static boolean isMoveWithinBoardBoundaries(Spot end){
        if(end.getX() > 7) return false;
        else if (end.getX() < 0) return false;
        else if (end.getY() > 7) return false;
        else if (end.getY() < 0) return false;
        else return true;
    }

}
