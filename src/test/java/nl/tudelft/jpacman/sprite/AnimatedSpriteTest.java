package nl.tudelft.jpacman.sprite;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AnimatedSpriteTest {
    private Sprite frame = new EmptySprite();
    private Sprite[] frames = { frame };
    // AnimatedSprite(Sprite[] frames, int delay, boolean loop, boolean isAnimating)
    private AnimatedSprite sprite = new AnimatedSprite(frames, 0, true, true);

    @Test
    void getWidth()
    {
        assertThat(sprite.getWidth()==0).isTrue();
    }
}
