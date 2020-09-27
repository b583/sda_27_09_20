package game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

class GameTest {

    final Game game = new Game();

    @ParameterizedTest
    @MethodSource("paramSource")
    void gameResultTest(GameWeapon playerOne, GameWeapon playerTwo, GameResult result) {
        // arrange  -> given (method arguments)
        // act      -> when play game
        // assert   -> then (results as in result)
        Assertions.assertEquals(result, game.playGame(playerOne, playerTwo));
    }

    private static Stream<Arguments> paramSource() {
        return Stream.of(
                Arguments.of(GameWeapon.ROCK, GameWeapon.PAPER, GameResult.RIGHT_WON)
        );
    }

}
