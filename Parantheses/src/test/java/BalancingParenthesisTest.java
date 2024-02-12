import static org.junit.Assert.*;
import java.util.List;
import org.junit.Test;


public class BalancingParenthesisTest {
    @Test
    public void balancedParenthesisTest() {
        
    	assertTrue(BalancingParenthesis.areParenthesisBalanced(List.of('(', 'i', 'f', ' ', '(', 'z', 'e', 'r', 'o', '?', ' ', 'x', ')', ' ', 'm', 'a', 'x', ' ', '(', '1', '/', 'x', ')', ')')));
        assertTrue(BalancingParenthesis.areParenthesisBalanced(List.of('(', 'I', ' ', 't', 'o', 'l', 'd', ' ', 'h', 'i', 'm', ' ', '(', 't', 'h', 'a', 't', ' ', 'i', 't', 's', ' ', 'n', 'o', 't', ' ', '(', 'y', 'e', 't', ')', ')', ' ', 'd', 'o', 'n', 'e', ')', '.', ' ', '(', 'B', 'u', 't', ' ', 'h', 'e', ' ', 'w', 'a', 's', 'n', 't', ' ', 'l', 'i', 's', 't', 'e', 'n', 'i', 'n', 'g', ')')));
        assertTrue(BalancingParenthesis.areParenthesisBalanced(List.of('(', ')', '(', ')', '(', '(', '-', ')', ')')));
        
    }

    @Test
    public void unbalancedParenthesisTest() {
        
    	assertFalse(BalancingParenthesis.areParenthesisBalanced(List.of(':', '-', ')')));
        assertFalse(BalancingParenthesis.areParenthesisBalanced(List.of('(', ')', ')', '(')));
        assertFalse(BalancingParenthesis.areParenthesisBalanced(List.of('a', 'b')));
        assertFalse(BalancingParenthesis.areParenthesisBalanced(List.of('a', 'b', '(')));
        assertFalse(BalancingParenthesis.areParenthesisBalanced(List.of('a', 'b', ')')));
    }
}
