package chess.board;

import chess.enums.Color;
import chess.pieces.*;

public class Board {

    private Spot [][] board = new Spot[8][8];

    public Board(){
        setUpBoard();
    }

    public Spot[][] getBoard() {
        return board;
    }

    private void setUpBoard(){
        setUpBlack();
        setUpWhite();
        setUpEmptySpots();
    }

    private void setUpWhite(){
        setUpWhitePawns();
        setUpWhiteRooks();
        setUpWhiteKnights();
        setUpWhiteBishops();
        setUpWhiteQueen();
        setUpWhiteKing();
    }

    private void setUpWhitePawns() {
        for(int i = 0; i < 8; i++){
            board[6][i] = new Spot(new Pawn(Color.WHITE), 6, i);
        }
    }

    private void setUpWhiteRooks() {
        board[7][0] = new Spot(new Rook(Color.WHITE), 7, 0);
        board[7][7] = new Spot(new Rook(Color.WHITE), 7, 7);
    }

    private void setUpWhiteKnights() {
        board[7][1] = new Spot(new Knight(Color.WHITE), 7, 1);
        board[7][6] = new Spot(new Knight(Color.WHITE), 7, 6);
    }

    private void setUpWhiteBishops() {
        board[7][2] = new Spot(new Bishop(Color.WHITE), 7, 2);
        board[7][5] = new Spot(new Bishop(Color.WHITE), 7, 5);
    }

    private void setUpWhiteQueen() {
        board[7][3] = new Spot(new Queen(Color.WHITE), 7, 3);
    }

    private void setUpWhiteKing() {
        board[7][4] = new Spot(new King(Color.WHITE), 7, 4);
    }

    private void setUpBlack(){
        setUpBlackPawns();
        setUpBlackRooks();
        setUpBlackKnights();
        setUpBlackBishops();
        setUpBlackQueen();
        setUpBlackKing();
    }

    private void setUpBlackPawns() {
        for(int i = 0; i < 8; i++){
            this.board[1][i] = new Spot(new Pawn(Color.BLACK), 1, i);
        }
    }

    private void setUpBlackRooks() {
        board[0][0] = new Spot(new Rook(Color.BLACK), 0, 0);
        board[0][7] = new Spot(new Rook(Color.BLACK), 0, 7);
    }

    private void setUpBlackKnights() {

        board[0][1] = new Spot(new Knight(Color.BLACK), 0, 1);
        board[0][6] = new Spot(new Knight(Color.BLACK), 0, 6);
    }

    private void setUpBlackBishops() {
        board[0][2] = new Spot(new Bishop(Color.BLACK), 0, 2);
        board[0][5] = new Spot(new Bishop(Color.BLACK), 0, 5);
    }

    private void setUpBlackQueen() {
        board[0][3] = new Spot(new Queen(Color.BLACK), 0, 3);
    }

    private void setUpBlackKing() {
        board[0][4] = new Spot(new King(Color.BLACK), 0, 4);
    }

    private void setUpEmptySpots() {
        for (int i = 2; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = new Spot(null, i, j);
            }
        }
    }
}
