import static org.junit.Assert.*;
import org.junit.Test;

public class IntStackTest {


    @Test
    public void getCapacity() {
        IntStack stack = new IntStack();
        assertEquals(stack.getCapacity(), 0);
    }

    @Test
    public void checkLength() {
        IntStack stack = new IntStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void checksetCapacity() {
        IntStack stack = new IntStack();
        stack.setCapacity(3);
        assertEquals(stack.getCapacity(), 10);
    }

}
