import game.Frame;
import junit.framework.*;

public class TestFrame extends TestCase {
    public TestFrame(String name) {
        super(name);
    }

    public void testScoreNoThrows() {
        Frame f = new Frame();
        assertEquals(0, f.getItsScore());
    }

    public void testAddOneThrow() {
        Frame f = new Frame();
        f.add(5);
        assertEquals(5, f.getItsScore());
    }
}
