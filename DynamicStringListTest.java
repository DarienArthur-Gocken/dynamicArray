import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTest {

    @Test
    public void addStringAndGet() {
        DynamicStringList test = new DynamicStringList();
        test.add("Test");
        assertEquals(test.get(0), "Test");
    }
}