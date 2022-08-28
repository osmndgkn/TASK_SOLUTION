import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void getTotalDiscount() {

        Payment payment = new Payment(new User("a","b",new Card("Gold"), true , new Date()) , 950 ,   "Phone");
        assertEquals(20,payment.getTotalDiscount());
    }

    @Test
    void getTotalDiscount2() {

        Payment payment = new Payment(new User("a","b",new Card("Goldberg"), true , new Date()) , 600 ,   "Phone");
        assertEquals(10,payment.getTotalDiscount());
    }
}