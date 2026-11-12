package res.mavenex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class AppTest
{
    @Test
    public void testEven()
    {
        App obj = new App();
        assertTrue(obj.checkEvenOdd(10));
    }

    @Test
    public void testOdd()
    {
        App obj = new App();
        assertFalse(obj.checkEvenOdd(7));
    }
}
