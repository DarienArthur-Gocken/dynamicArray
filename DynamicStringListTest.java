import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DynamicStringListTest {

    @Test
    public void addStringAndGet() {
        DynamicStringList test = new DynamicStringList();
        test.add("Test");
        assertEquals(test.get(0), "Test");
    }

    @Test
    public void addStringMultiple() {
        DynamicStringList test = new DynamicStringList();
        test.add("Test");
        test.add("Test2");
        test.add("Test3");
        assertEquals(test.get(1), "Test2");
    }

    @Test
    public void removeStringTest() {
        DynamicStringList test = new DynamicStringList();
        test.add("Test");
        test.add("Test2");
        test.add("Test3");
        test.remove(1);
        assertEquals(test.get(1), "Test3");
    }
}