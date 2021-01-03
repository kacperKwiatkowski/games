package chess.board;

import chess.pieces.*;

import java.util.Locale;

public class Board {

    private Piece [][] board = new Piece[8][8];

    public Board(){
        setUpBoard();
    }

    public Piece[][] getBoard() {
        return board;
    }

    public void setBoard(Piece[][] board) {
        this.board = board;
    }

    private void setUpBoard(){
        setUpBlack();
        setUpWhite();
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
            this.board[1][i] = new Pawn();
        }
    }

    private void setUpWhiteRooks() {
            this.board[0][0] = new Rook();
            this.board[0][7] = new Rook();
    }

    private void setUpWhiteKnights() {
            this.board[0][1] = new Knight();
            this.board[0][6] = new Knight();
    }

    private void setUpWhiteBishops() {
            this.board[0][2] = new Bishop();
            this.board[0][5] = new Bishop();
    }

    private void setUpWhiteQueen() {
            this.board[0][3] = new Queen();
    }

    private void setUpWhiteKing() {
            this.board[0][4] = new King();
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
            this.board[6][i] = new Pawn();
        }
    }

    private void setUpBlackRooks() {
        this.board[7][0] = new Rook();
        this.board[7][7] = new Rook();
    }

    private void setUpBlackKnights() {
        this.board[7][1] = new Knight();
        this.board[7][6] = new Knight();
    }

    private void setUpBlackBishops() {
        this.board[7][2] = new Bishop();
        this.board[7][5] = new Bishop();
    }

    private void setUpBlackQueen() {
        this.board[7][3] = new Queen();
    }

    private void setUpBlackKing() {
        this.board[7][4] = new King();
    }
}
