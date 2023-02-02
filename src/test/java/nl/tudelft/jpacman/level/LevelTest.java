package nl.tudelft.jpacman.level;

import com.google.common.collect.Lists;

import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.npc.Ghost;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class LevelTest {
    // Level(Board board, List<Ghost> ghosts, List<Square> startPositions,
    //                 CollisionMap collisionMap)
    private Level level;
    private final Ghost ghost = mock(Ghost.class);
    private final Square square1 = mock(Square.class);
    private final Square square2 = mock(Square.class);
    private final Board board = mock(Board.class);
    private final CollisionMap collisions = mock(CollisionMap.class);
    @BeforeEach
    void setUp()
    {
        level = new Level(board, Lists.newArrayList(ghost), Lists.newArrayList(square1, square2), collisions);
    }
    @Test
    void noStart()
    {
        assertThat(level.isInProgress()).isFalse();
    }
}
