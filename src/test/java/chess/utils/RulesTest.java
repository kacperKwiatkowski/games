package chess.utils;

import chess.board.Board;
import chess.board.Spot;
import chess.enums.Color;
import chess.pieces.Pawn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class RulesTest {


    @Test
    public void assertMethodIsMoveWithinBoardBoundariesWillReturnFalse(){

        //given
        Spot spot = new Spot(new Pawn(Color.BLACK), 9,9);

        //when
        boolean result = Rules.isMoveWithinBoardBoundaries(spot);

        //then
        Assertions.assertFalse(result);
    }
}
