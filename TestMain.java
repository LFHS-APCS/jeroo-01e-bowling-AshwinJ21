import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
import java.io.*;

/**
 *
 * @author  Aronson
 */
public class TestMain
{
    public static void main(String args[]) {
        TestMain test = new TestMain();
        test.testBowling();
    }

    @Test
    public void testBowling() {
       Jeroo jeroo = new Jeroo(0,0, 100);
       jeroo.setupBowling();

       assertTrue("(1, 1)", Map.getInstance().isFlower(1,1));
       assertTrue("(1, 3)", Map.getInstance().isFlower(1,3));
       assertTrue("(1, 5)", Map.getInstance().isFlower(1,5));
       assertTrue("(1, 7)", Map.getInstance().isFlower(1,7));
       assertTrue("(2, 2)", Map.getInstance().isFlower(2,2));
       assertTrue("(2, 4)", Map.getInstance().isFlower(2,4));
       assertTrue("(2, 6)", Map.getInstance().isFlower(2,6));
       assertTrue("(3, 3)", Map.getInstance().isFlower(3,3));
       assertTrue("(3, 5)", Map.getInstance().isFlower(3,5));
       assertTrue("(4, 4)", Map.getInstance().isFlower(4,4));
    }
}
