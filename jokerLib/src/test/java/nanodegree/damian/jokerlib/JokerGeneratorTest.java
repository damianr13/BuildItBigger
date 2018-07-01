package nanodegree.damian.jokerlib;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by robert_damian on 28.06.2018.
 */

public class JokerGeneratorTest {

    @Test
    public void testJoke() {
        Assert.assertNotEquals(JokesGenerator.generate(), JokesGenerator.FALLBACK_VALUE);
    }

}
