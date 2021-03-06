/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradleTest.Increment;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test(timeout = 1000) public void AppWorksProperly() {
        assertEquals(App.getSum(5), 15);
        assertEquals(App.getSum(10), 55);
        assertEquals(App.getSum(15), 120);
        assertEquals(App.getSum(20), 210);


        assertEquals(App.getSum(-5), 15);
        assertEquals(App.getSum(-10), 55);
        assertEquals(App.getSum(-15), 120);
        assertEquals(App.getSum(-20), 210);
    }
}
