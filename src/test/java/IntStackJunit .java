import static org.junit.Assert.*;
import org.junit.Test;

public class IntStackJunit {


    @Test
    public void getCapacity() {
        IntStack stack = IntStack.createIntStack();
        assertEquals(stack.getCapacity(), 0);
    }

    @Test
    public void checkLength() {
        IntStack stack = IntStack.createIntStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    public void checksetCapacity() {
        IntStack stack = IntStack.createIntStack();
        stack.setCapacity(3);
        assertEquals(stack.getCapacity(), 3);
    }

}
