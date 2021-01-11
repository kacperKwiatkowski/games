package chess.utils;

import chess.board.Spot;

public class Printer {

    public static void printBoard(Spot[][] game){

        char [] xAxisNames = {'A','B','C','D','E','F','G','H'}, yAxisNames = {'1','2','3','4','5','6','7','8'};

        System.out.print("   ");
        for(int i = 0; i < 8; i++){
            System.out.print(" " + xAxisNames[i] + ": ");
        }
        System.out.println();

        for (int i = 0, a = 7; i < 8; i++, a--){
            System.out.print(yAxisNames[a] + ": ");

            for (int j = 0; j < 8; j++){
                if(game[i][j].getPiece()!=null){
                    System.out.print("[" + game[i][j].getPiece().getPieceType() + game[i][j].getPiece().getColor().toString().toLowerCase().charAt(0) + "]");
                } else {
                    System.out.print("[  ]");
                }
            }

            System.out.println();
        }
    }

}
