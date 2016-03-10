import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StackTest {
    @Test
    public void it_can_create_an_empty_stack(){
        Stack s = new Stack();

        assertTrue(s.isEmpty());
    }

    @Test
    public void it_can_allow_one_value_to_be_pushed_to_it(){
        Stack s = new Stack();

        s.push(5);

        assertTrue(s.size() == 1);
        assertTrue(s.top() == 5);
    }

    @Test
    public void it_can_allow_one_value_to_be_popped_from_it(){
        Stack s = new Stack();

        s.push(5);
        int v = s.pop();

        assertEquals(5, v);
        assertTrue(s.isEmpty());
    }

    @Test
    public void it_adheres_to_lifo_filo_structure_expectations(){
        Stack s = new Stack();

        s.push(5);
        s.push(6);
        s.push(7);

        int v = s.pop();
        assertEquals(7, v);

        v = s.pop();
        assertEquals(6, v);

        v = s.pop();

        assertEquals(5, v);
    }

    @Test(expected=StackEmptyException.class)
     public void it_throws_exception_when_trying_to_pop_empty_stack(){
        Stack s = new Stack();

        s.pop();
    }

    @Test(expected=StackEmptyException.class)
    public void it_throws_exception_when_trying_to_top_an_empty_stack(){
        Stack s = new Stack();

        s.top();
    }
}
