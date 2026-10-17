package ec.epn.edu.git.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorMockitoTest {

    @Test
    public void given_mocked_calculator_when_addition_then_returns_stubbed_value() {
        Calculator calculator = mock(Calculator.class);
        when(calculator.addition(10, 5)).thenReturn(99);

        assertEquals(99, calculator.addition(10, 5));
    }
}
