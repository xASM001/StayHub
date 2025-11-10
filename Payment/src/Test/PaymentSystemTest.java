import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PaymentSystemTest {
    
    @Test
    public void testProcessPayment_Success() {
        // Payment amount is within the limit (<= 500), should return true
        assertTrue(PaymentSystem.processPayment("1234567812345678", "12/25", "123", 500));
        assertTrue(PaymentSystem.processPayment("1234567812345678", "12/25", "123", 100));
    }
    
    @Test
    public void testProcessPayment_Failure() {
        // Payment amount exceeds the limit (> 500), should return false
        assertFalse(PaymentSystem.processPayment("1234567812345678", "12/25", "123", 501));
        assertFalse(PaymentSystem.processPayment("1234567812345678", "12/25", "123", 1000));
    }
}
