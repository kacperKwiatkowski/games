package chess.utils;

import chess.board.Board;
import chess.pieces.Piece;

public class Printer {

    public static void printBoard(Piece[][] game){
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 8; j++){
                if(game[i][j]!=null){
                    System.out.print(game[i][j].getPieceType());
                } else {
                    System.out.print("empty");
                }
                System.out.println();
            }
        }
    }

}
