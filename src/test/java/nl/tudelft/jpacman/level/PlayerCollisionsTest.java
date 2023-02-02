package nl.tudelft.jpacman.level;

import static org.mockito.Mockito.mock;
import java.util.Map;

import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.points.PointCalculator;
import nl.tudelft.jpacman.points.PointCalculatorLoader;
import nl.tudelft.jpacman.sprite.Sprite;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerCollisionsTest {
    //Player(Map<Direction, Sprite> spriteMap, AnimatedSprite deathAnimation)
    private Map<Direction, Sprite> spriteMap = mock(Map.class);
    private AnimatedSprite deathAnimation = mock(AnimatedSprite.class);
    private Player player = new Player(spriteMap, deathAnimation);
    private static Sprite sprite = mock(Sprite.class);
    private Pellet pellet = new Pellet(10, sprite);
    private PointCalculatorLoader pointCalculatorLoader = new PointCalculatorLoader();
    private PointCalculator pointCalculator = pointCalculatorLoader.load();
    private PlayerCollisions PlayerCollision = new PlayerCollisions(pointCalculator);
    @BeforeEach
    void setUp()
    {
        assertThat(player.getScore()==0).isTrue();
    }

    @Test
    void playerVersusPellet()
    {
        PlayerCollision.playerVersusPellet(player, pellet);
        assertThat(player.getScore()==0).isFalse();
    }
}
